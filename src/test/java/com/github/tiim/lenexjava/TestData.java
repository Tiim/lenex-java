package com.github.tiim.lenexjava;

import com.github.tiim.lenexjava.model.AgeDate;
import com.github.tiim.lenexjava.model.Course;
import com.github.tiim.lenexjava.model.Lenex;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestData {

    private static Lenex lenex;

    @BeforeAll
    static void loadLenex() throws IOException {
        InputStream exEntries = LenexParserTest.class.getResourceAsStream("example-entries.lef");
        lenex = LenexParser.parse(exEntries, LenexType.LENEX_PLAIN);
    }

    @Test
    void testConstructor() {
        assertEquals("SPLASH Meet Manager 2007", lenex.getConstructor().getName());
        assertEquals("Splash Software", lenex.getConstructor().getRegistration());
        assertEquals("DEBUG Build", lenex.getConstructor().getVersion());
        assertEquals("http://www.splash-software.ch", lenex.getConstructor().getContact().getInternet());
    }

    @Test
    void testMeet() {
        assertEquals("Nottwil", lenex.getMeets().get(0).getCity());
        assertEquals(AgeDate.TypeAgeDate.YEAR, lenex.getMeets().get(0).getAgeDate().getType());
        assertEquals(Course.SCM, lenex.getMeets().get(0).getCourse());
    }

    @Test
    void test() {
        lenex.getMeets().stream()
                .flatMap(m -> m.getClubs().stream())
                .flatMap(c -> c.getAthletes().stream())
                .map(Object::toString)
                .forEach(System.out::println);
    }

}
