/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkppl.ujian_123040403;

/**
 *
 * @author SB 604-05
 */
public class Soal {

    public int pangkat(int bil, int pangkat) {
        int hasil = 1;
        int n = 1;

        while (n <= pangkat) {
            n++;
            hasil *= bil;
        }
        return hasil;
    }

    public int faktorial(int bil) {
        int hasil = 0;
        for (int i = 1; i < bil; i++) {
            hasil *= i;
        }
        return hasil;
    }

    public int perkalian(int bilA, int bilB) {
        return bilA * bilB;
    }
}
