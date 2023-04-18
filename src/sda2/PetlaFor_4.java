package sda2;

import java.util.Scanner;

public class PetlaFor_4 {
    public static void main(String[] args) {

        /*Program pobiera wysokość, szerokość oraz znak wypełnienia kwadratu a następnie za pomocą pętli for drukuje kwadrat w konsoli, o zadanych parametrach.

        Przykład działania:

        Wprowadź znak wypełnienia prostokąta:
&
        Wprowadź wysokość prostokąta:
        4
        Wprowadź szerokość prostokąta:
        7
        Rysuję!
                &&&&&&&
&&&&&&&
&&&&&&&*/
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj znak wypełnienia: ");
        String str = scan.nextLine();
        System.out.println("Ile ma byc rzedów?");
        int rows = scan.nextInt();
        System.out.println("Ile ma byc kolumn?:");
        int col = scan.nextInt();

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < col; ++j) {
                System.out.print(str);
            }
            System.out.println();
        }
*/

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Ile wierszy ma mieć choinka?: ");
        int lines = scan2.nextInt();

        for (int line = 1; line <= lines; line++) {
            if ((line % 2) != 0) {
                for (int i = 0; i < ((lines - line) / 2); ++i) {
                    System.out.print(" ");
                }
                for (int count = 0; count < line; ++count) {
                    System.out.print("*");
                }
                System.out.println();
            }

// ta sama zmienna kontrolna w warunku podpętli
        }
    }
}