package sda2;

import java.util.Random;

public class PetlaFor {
    public static void main(String[] args) {
       /* Za pomocą pętli for:
        - wyświetl liczby od 0 do 5000.
                - przygotuj tablicę 5 imion i wyświetl
                - wyświetl pierwsze 20 potęg liczby 2:
        0, 2, 4, 8, 16…..*/

        /*for (int i = 0; i < 5000; ++i) {
            System.out.println(i);*/

        String[] names = {"Kuba", "Alicja", "Anna", "Marcin", "Leszek"};

        for (int i = 0; i < 5; ++i) {
            System.out.println(names[i]);
            /* patrz na nawiasy !!!*/
        }
        for (String name : names) {
            System.out.println(name);
        }
        for (int i = 0; i < 20; ++i) {
            System.out.println(Math.pow(2, i));
        }
        // przyjałem wszystkie potęgi od zera

    }


}
