package org.ifunpas.rkppl.ujian_123040403;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    private static Soal so;

    @Before
    public void awalTest() {
        so = new Soal();
        System.out.println("Test dimulai");
    }

    @Test
    public void Test1() {
        System.out.println("Nilai 2 pangkat 2 seharusnya 4");
        assertEquals(4, so.pangkat(2, 2));
    }

    @After
    public void AkhirTest() {
        System.out.println("Test Berakhir");
    }
}
