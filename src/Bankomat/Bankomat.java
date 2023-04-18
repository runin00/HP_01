package Bankomat;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {
        /*
        Co chcesz zrobić?:
        - wypłacić gotówkę:
           - włóż kartę i naciśnij dalej
            - 50 eur
            - 100 eur
            - 150 eur
            - 200 eur
            - inna kwota
         */
    }
    public static void wlozKarte() {

        System.out.println("Włóż kartę i naciśnij dalej.");
        System.out.println("Sprawdzam kartę");

    }
    public static int pobierzPolecenie() {

        System.out.println("Wybierz opcję >>");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        return choice;
    }
    public static void displayMenu() {

        System.out.println("Jaką kwotę chcesz wyjąć?" +
                "\n1 - 50 zł\n2 - 100 zł\n3 - 150 zł\n4 - 200 zł\n5 - 250 zł\n");
    }
}
