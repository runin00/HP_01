package sda1;

import java.util.Scanner;
public class PetlaSWhile_4 {
    public static void main(String[] args) {
        Scanner scanObj = new Scanner(System.in);
        int password = 1234;
        int input = 0;
        // znów problem konieczności inicjalizacji
        // gdy hasło jest stringiem to żle porównuje

        while (input != password) {
            System.out.println("Podaj poprawne hasło: ");
            input = scanObj.nextInt();
            System.out.println(input);
        }

        double waga = 0.0;
        double wzrost = 0.0;
        double wzrostKwadrat;
        double BMI;

        while (wzrost < 40.0 || wzrost > 210.0) {
            System.out.println("Podaj poprawny wzrost: ");
            wzrost = scanObj.nextDouble();
        }
        while (waga < 30.0 || waga > 150.0) {
            System.out.println("Podaj poprawna wagę: ");
            waga = scanObj.nextDouble();
        }
        System.out.println("Twoja waga to " + waga + " a wzrost to " + wzrost);
        System.out.println("Twój wzrost podnoszę do kwadratu");
        wzrostKwadrat = Math.pow(wzrost, 2);
        // po co dodatkowa konwersja na float, gdy wszystkie zmienne będą float java także wymaga takiej konsersji?
        // type casting? narrowing and widening, automatic and manual
        System.out.println("Dzielę wagę przez wzrost podniesiony do kwadratu");
        BMI =waga /wzrostKwadrat;
        System.out.println("Twoje BMI wynosi " + BMI);
        System.out.println("Masz nadwagę: " + (BMI >= 24.9));
        System.out.println("Masz niedowagę: " + (BMI <= 18.5));
        System.out.println("Twoja waga jest w normie: " + (BMI >18.5 & BMI <24.5));

        //sformatować wyniki
    }



}
