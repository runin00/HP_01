package sda2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PetlaFor6Loteria {
    public static void main(String[] args) {
        /*
        Symulator loterii liczbowej:
        wprowadzenie 6 liczb (1-24)
        wylosowanie 6 liczb (1-24)
        sprawdzenie, które liczby są trafione
        wyświetlenie wyniku i nagrody:
        0-2 = 0zł, 3 = 16
        4 = 200zł, 5 = 4 000 zł
        6 = 1 500 000 zł
        Użyj każdego z poznanych narzędzi: zmienna, operatory, warunek, tablice, Scanner, Random, Pętle..
        wariant trudniejszy: Liczby wprowadzane ani liczby losowane nie mogą się  powtarzać.
        */
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int[] lottery = new int[6];
        int[] numbers = new int[6];
        //każda tablica jest nowym obiektem
        for (int i = 0; i < 6; i++) {
            lottery[i] = ran.nextInt(1, 24);
        }
        System.out.println(Arrays.toString(lottery));
        System.out.println("Wprowadź sześć liczb w zakresie od 1 do 24!");
        for (int i = 0; i < 6; i++) {
            System.out.println(i + " liczba: ");
            numbers[i] = scan.nextInt();
            //używanie tej samej nazwy licznika dla kolejnych pętli?
            //czy ta zmienna jest niszczona po wyjściu z petli?
            // czy pętla w pętli może mieć taką sama nazwę licznika?
        }
        int count = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (numbers[i] == lottery[j]) {
                        System.out.println("Trafiłeś" + numbers[i]);
                        count++;
                }
            }//gdy powtarzają się liczby w losowaniu to zwieksza sie liczba trafień ponad 6
        }
        if (count < 3) {
            System.out.println("Nic nie wygrałeś");
        } else if (count == 3) {
            System.out.println("Trafiłeś 3 liczby! Wygrywasz 16 zł!");
        } else if (count == 4) {
            System.out.println("Trafiłeś 4 liczby! Wygrywasz 200 zł!");
        } else if (count == 5) {
            System.out.println("Trafiłeś 5 liczb! Wygrywasz 4000 zł!");
        } else if (count == 6) {
            System.out.println("Trafiłeś 6 liczb! Wygrywasz 1 500 000 zł!");
        }
    }
}
