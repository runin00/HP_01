package sda2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class PetlaFor5Sortowanie {
    public static void main(String[] args) {

        Random ran = new Random();
        int[] tab = {7, 5, 9, 8, 6, 1, 4, 0, 3, 2};
        int tmp;
        for (int i = 0; i < (Array.getLength(tab) - 1);) {
            if (tab[i] > tab[i + 1]) {
                tmp = tab[i];
                tab[i] = tab[i + 1];
                tab[i + 1] = tmp;
                i = 0;
                System.out.println("Tablica w trakcie segregacji: " + Arrays.toString(tab));
                //czy można zerować licznik w trakcie pętli?
                //czy dla przejrzystości wprowadzać else?
            } else {
                i++;
            }// jakiś inny sposób modyfikacji licznika niż else?
        }
        System.out.println("Posegregowana tablica: " + Arrays.toString(tab));
    }
}


