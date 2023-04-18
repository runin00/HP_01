package sda4;

import java.util.Scanner;

public class instrukcjeSwitch3 {
    public static void main(String[] args) {
       /*
        Wiosna 21 marca 20 czerwca
        Lato 21 czerwca 22 września
        Jesień 23 września 21 grudnia
        Zima 22 grudnia 20 marca
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj miesiąc");
        int month = scan.nextInt();
        System.out.println("Podaj dzień");
        int day = scan.nextInt();
        // próbowałem metod lambda
        switch (month) {
            case 1:
                System.out.println("Jest Zima");
                break;
            case 2:
                System.out.println("Jest Zima");
                break;
            case 3:
                if (day < 21) {
                    System.out.println("Jest Zima");
                } else {
                    System.out.println("Jest Wiosna");
                }
            case 4:
                System.out.println("Jest Wiosna");
                break;
            case 5:
                System.out.println("Jest Wiosna");
                break;
            case 6:
                if (day < 21) {
                    System.out.println("Jest Wiosna");
                } else {
                    System.out.println("Jest Lato");
                }
            case 7:
                System.out.println("Jest Lato");
                break;
            case 8:
                System.out.println("Jest Lato");
                break;
            case 9:
                if (day < 23) {
                    System.out.println("Jest Lato");
                } else {
                    System.out.println("Jest Jesień");
                }
            case 10:
                System.out.println("Jest Jesień");
                break;
            case 11:
                System.out.println("Jest Jesień");
                break;
            case 12:
                if (day < 22) {
                    System.out.println("Jest Jesień");
                } else {
                    System.out.println("Jest Zima");
                }
        }


    }
}
