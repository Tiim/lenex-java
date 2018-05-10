package com.github.tiim.lenexjava;

import com.github.tiim.lenexjava.model.Lenex;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.io.InputStream;
import java.util.stream.Stream;

@DisplayName("Test parsing of lenex files")
class LenexParserTest {

    @ParameterizedTest
    @DisplayName("Plain lenenx xml files")
    @MethodSource("getLefFiles")
    void parseLef(String file) throws IOException {
        InputStream exEntries = LenexParserTest.class.getResourceAsStream(file);
        Lenex lenex = LenexParser.parse(exEntries, LenexType.LENEX_PLAIN);
    }

    @ParameterizedTest
    @DisplayName("Compressed lenex files")
    @MethodSource("getLxfFiles")
    void paresLxf(String file) throws IOException {
        InputStream exEntries = LenexParserTest.class.getResourceAsStream(file);
        Lenex lenex = LenexParser.parse(exEntries, LenexType.LENEX_COMPRESSED);
    }

    @EnabledIfEnvironmentVariable(named = "FULL_TEST", matches = "true")
    @ParameterizedTest
    @DisplayName("Try parsing compressed as uncompressed files")
    @MethodSource("getLxfFiles")
    void parseLxfAsLef(String file) throws IOException {
        InputStream exEntries = LenexParserTest.class.getResourceAsStream(file);
        Assertions.assertThrows(IOException.class, () -> {
            Lenex lenex = LenexParser.parse(exEntries, LenexType.LENEX_PLAIN);
        });
    }

    @EnabledIfEnvironmentVariable(named = "FULL_TEST", matches = "true")
    @ParameterizedTest
    @DisplayName("Try parsing uncompressed as compressed files")
    @MethodSource("getLefFiles")
    void parseLefAsLxf(String file) throws IOException {
        InputStream exEntries = LenexParserTest.class.getResourceAsStream(file);
        Assertions.assertThrows(IOException.class, () -> {
            Lenex lenex = LenexParser.parse(exEntries, LenexType.LENEX_COMPRESSED);
        });
    }

    private static Stream<Arguments> getLefFiles() {
        return Stream.of(
                Arguments.of("example-entries.lef"),
                Arguments.of("example-records.lef"),
                Arguments.of("example-results.lef")
        );
    }

    private static Stream<Arguments> getLxfFiles() {
        return Stream.of(
                Arguments.of("example-entries.lxf"),
                Arguments.of("example-records.lxf"),
                Arguments.of("example-results.lxf")
        );
    }
}