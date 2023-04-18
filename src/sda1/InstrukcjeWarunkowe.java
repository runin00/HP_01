package sda1;

import java.util.Scanner;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {

        Scanner scanObj = new Scanner(System.in);
        System.out.println("Podaj trzy liczby.");
        System.out.println("Pierwsza liczba >> ");
        float firstNumber = scanObj.nextFloat();
        System.out.println("Druga liczna >> ");
        float secondNumber = scanObj.nextFloat();
        System.out.println("Trzeci liczba >> ");
        float thirdNumber = scanObj.nextFloat();

        System.out.println(0.5);
        // wczytywanie liczb na raz?

        float myFloat = 0.5f;

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Najwiekszą liczba jest " + firstNumber);
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Największą liczbą jest " + secondNumber);
        } else if  (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("Największa liczbą jest " + thirdNumber);
            System.out.println();
            // nawias tylko jak jest więcej instrukcji niż jedna
            // else: - wszystkie pozostałe opcje
        }
    }
}
