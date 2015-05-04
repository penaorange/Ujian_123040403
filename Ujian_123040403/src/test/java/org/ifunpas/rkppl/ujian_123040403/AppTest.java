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

//    @Test
//    public void Test1() {
//        System.out.println("Nilai 2 pangkat 2 seharusnya 4");
//        assertEquals(4, so.pangkat(2, 2));
//    }
//
//    @Test
//    public void Test2() {
//        System.out.println("Nilai 2 pangkat 2 seharusnya 4, seharusnya salah");
//        assertNotEquals(4, so.pangkat(2, 2));
//    }
//
//    @Test
//    public void Test3() {
//        System.out.println("Nilai 3 Faktorial, seharusnya 6");
//        so.faktorial(3);
//        assertFalse("Seharusnya Salah", so.faktorial(3) == 5);
//    }
//
//    @Test
//    public void Test4() {
//        System.out.println("Nilai 3 Faktorial, hasil 6");
//        so.faktorial(3);
//        assertTrue("Seharusnya benar", so.faktorial(3) == 6);
//    }
//
//    @Test
//    public void Test5() {
//        System.out.println("Nilai Perkalian 3 x 3, seharusnya 9");
//        int a = so.perkalian(3, 3);
//        assertNotNull("Seharusnya tidak kosong", a);
//    }
//
//    @Test
//    public void Test6() {
//        System.out.println("Nilai Perkalian 3 x 3, seharusnya 9");
//        int a = so.perkalian(3, 3);
//        assertNull("Seharusnya kosong", a);
//    }

    @After
    public void AkhirTest() {
        System.out.println("Test Berakhir");
    }
}
