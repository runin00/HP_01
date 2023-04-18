package sda4;

import java.util.Scanner;

public class instrukcjeSwitch5 {
    // nie rozumiem ostatniego zdania z tego zadania
    public static void main(String[] args) {
        rangeOutput(4, 8);
    }

    public static int rangeOutput(int min, int max) {
        int number;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Podaj liczbę z zakresy od " + min + " do " + max);
            number = scan.nextInt();
            //znów number musi być poza pętlą - modyfikatory dostępu mogą to zmienić?
            //co gdy nie chcemy go zainicjalizować - wtedy kompilator nie przepuści bo jest ryzyko że
            // do weryfikacji warunku dotrze null
        } while ((number < min) || (number > max));
        return number;
    }

}
