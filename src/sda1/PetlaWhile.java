package sda1;

import java.util.Random;
import java.util.Scanner;
public class PetlaWhile {
    public static void main(String[] args) {

        int x =0;
        int i = 0;
        Random ran = new Random();
        while (x != 10) {
            x = ran.nextInt(0, 11);
            System.out.println(x);
            ++i;
        }
        System.out.println("Wylosowano 10 za " + i + " razem.");
        System.out.println("Tyle razy będę losował kolejne liczby: ");

        while (i != 0) {
            System.out.println(ran.nextInt(0, 11));
            --i;
        }


    }
}