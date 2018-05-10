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
        assertEquals("SPLASH Meet Manager 2007", lenex.constructor.name);
        assertEquals("Splash Software", lenex.constructor.registration);
        assertEquals("DEBUG Build", lenex.constructor.version);
        assertEquals("http://www.splash-software.ch", lenex.constructor.contact.internet);
    }

    @Test
    void testMeet() {
        assertEquals("Nottwil", lenex.meets.get(0).city);
        assertEquals(AgeDate.TypeAgeDate.YEAR, lenex.meets.get(0).ageDate.getType());
        assertEquals(Course.SCM, lenex.meets.get(0).course);
    }

    @Test
    void test() {
        lenex.meets.stream()
                .flatMap(m -> m.clubs.stream())
                .flatMap(c -> c.athletes.stream())
                .map(Object::toString)
                .forEach(System.out::println);
    }

}
