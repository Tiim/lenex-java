package com.github.tiim.lenexjava;

import com.github.tiim.lenexjava.model.Lenex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class LenexParser {
    private static final Logger LOGGER = LoggerFactory.getLogger(LenexParser.class);
    private static final PathMatcher LENEX_XML = FileSystems.getDefault().getPathMatcher("regex:.*\\.lef");
    private static final PathMatcher LENEX_ZIP = FileSystems.getDefault().getPathMatcher("regex:.*\\.lxf");

    public static Lenex parse(InputStream is, LenexType type) throws IOException {
        try {
            if (type == LenexType.LENEX_COMPRESSED) {
                ZipInputStream zipis = new ZipInputStream(is);
                ZipEntry entry = zipis.getNextEntry();
                if (entry == null) {
                    throw new IOException("No file inside compressed lenex container found. Is it really a compressed file?");
                }
                is = zipis;
            }
            JAXBContext context = JAXBContext.newInstance(Lenex.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return (Lenex) unmarshaller.unmarshal(is);
        } catch (JAXBException e) {
            throw new IOException("Can't read xml file: " + e.toString(), e);
        }
    }

    public static Lenex fromFile(Path path) throws LenexException, IOException {
        LenexType type;
        if (LENEX_XML.matches(path)) {
            type = LenexType.LENEX_PLAIN;
        } else if (LENEX_ZIP.matches(path)) {
            type = LenexType.LENEX_COMPRESSED;
        } else {
            throw new LenexException("Unrecognized file extension. Must be either .lef or .lxf");
        }

        InputStream is = Files.newInputStream(path);
        return parse(is, type);
    }


}
