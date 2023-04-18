package sda2;

import java.util.Random;
import java.util.Scanner;

public class Tablice_3 {
    public static void main(String[] args) {
        System.out.println("Ile notatek potrzebujesz?: ");
        java.util.Scanner scn = new Scanner(System.in);
        Random rand = new Random();
        // zapytał sie mnie o Random, wcześniej był na czerwono, a potem przyporządkował do klasy ale nie zaciągnął ścieżki do niej (alt + Enter)
        int amount = scn.nextInt();
        scn.nextLine();
        String[] notes = new String[amount];
        //String jest clasą i tez potrzebuje "new"
        System.out.println("Tworzę tablicę na " + amount + " notatek.");
        int count = 0;
        while (count < amount) {
            // chyba aby uniknąć konieczności inicjalizacji zmiennej przed warunkiem pętli trzeba wykorzystać pętledo while
            // jakie ma to znaczenie dla wartości licznika?
            System.out.println("Wprowadź notatkę:");
            notes[count] = scn.nextLine();
            ++count;
        }
        System.out.println(java.util.Arrays.toString(notes));
        int ran = rand.nextInt(0, 3);
        System.out.println("Randomowa notatka: " + notes[ran]);
    }
}
