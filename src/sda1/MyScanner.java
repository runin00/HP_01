package sda1;

import java.util.Random;
import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {

        /*Cześć, jak masz na imię?
                Jan
        Jak masz na nazwisko?
        Kowalski
        Cześć Jan! Proszę podaj jeszcze swój wiek:
        30
        Już wiem czy jesteś pełnoletni: true*/
/*
        Scanner scan = new Scanner(System.in);
        System.out.println("POdaj swoje imię: ");
        String name = scan.nextLine();
        System.out.println("Witaj " + name);
        System.out.println("Podaj swoje nazwiski: ");
        String surname = scan.nextLine();
        System.out.println("Twoje nazwisko to " + surname);
        System.out.println("Podaj jeszcze swój wiek: ");
        int age = scan.nextInt();
        System.out.println("Twój wiek jest poprawną wartością pomiędzy 0 i 100 lat: " + (age <= 100 & age >= 0));
        // operatory &, &&, | i ||
        System.out.println("Twój wiek to " + age);
        System.out.println("Jesteś pełnoletni: " + (age >= 18));
        System.out.println("Jesteś dzieckiem: " + (age < 12));
        System.out.println("Jesteś nastolatkiem: " + (age >= 12 & age < 18));
        System.out.println("Jesteś dorosłym : " + (age >=18 & age < 60));
        System.out.println("Jesteś w wieku emerytalnym: " + (age >= 60));
        // wyrażenia arytmetyczne w nawiasach
*/
        // zadanie z random
        // wersja z class Random oraz wersja z funkcja Math.random
/*
        Scanner input = new Scanner(System.in);
        System.out.println("Ile ścian ma miec kostka? ");
        int maxDice = input.nextInt();
        int minDice = 1;
        int amount = (int) (Math.random() * (maxDice - minDice + 1) + minDice);
        System.out.println("Wynik rzutu kostką o " + maxDice + " ścianach: " + amount);
 */
        // trudniejsza wersja
        Random random = new Random();
        System.out.println(random.nextInt(5,11));

       double wylosowana = 0.5;
        System.out.println(Math.random());

        Scanner input = new Scanner(System.in);
        System.out.println("Jaka ma być najwyższa liczba? ");
        int maxNumber = input.nextInt();
        System.out.println("Jaka ma być najniższa liczba?");
        int minNumber = input.nextInt();
        int result = (int) (Math.random() * (maxNumber - minNumber + 1) + minNumber);
        // wciąż tego nie rozumiem
        System.out.println("Wynik losowania pięciu liczb z zakresu: " + minNumber + " - " +  maxNumber + " to: " +
                (int) (random.nextDouble() * (maxNumber - minNumber + 1) + minNumber) + ", " +
                // (int) w nawiasie deklarujemy jaki typ eyniku chcemy uzyskać
                (Math.random() * (maxNumber - minNumber + 1) + minNumber) + ", " +
                (int) (Math.random() * (maxNumber - minNumber + 1) + minNumber) + ", " +
                random.nextInt(minNumber,maxNumber+1) + ", " +
                (int) (Math.random() * (maxNumber - minNumber + 1) + minNumber));

        // druga wersja z class Random




    }
}
