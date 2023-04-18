package sda2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PetlaFor6LoteriaHard {
    public static void main(String[] args) {
        loteria();
    }
    public static void loteria() {
        int howManyNumbers = 6;
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
        int[] randomNumbers = new int[howManyNumbers];
        int[] userNumbers = new int[howManyNumbers];

        boolean duplicate = false;
        //każda tablica jest nowym obiektem
        for (int i = 0; i < howManyNumbers; ) {
            int randomNumber = ran.nextInt(1, 24);
            for (int j = 0; j < howManyNumbers; j++) {
                if (randomNumbers[j] == randomNumber) {
                    System.out.println("powtórka");
                    duplicate = true;
                    break;
                    //gdy jest powtórka to musi przerwać i wrócic do losowania, czyli do poprzedniej pętli
                } else {
                    System.out.println("brak powtórki");
                }

                //bardzo często w randomie powtarzają się liczby
            }
            if (!duplicate) {
                randomNumbers[i] = randomNumber;
                i++;
            }
            // wcięcia mimo nawiasów? czy jak nawiasy sie zgadzają to wcięcia jeszcze decydują i jak?
        }


        // w którym momencie dokonuje inkrementacji licznika

        System.out.println(Arrays.toString(randomNumbers));
        System.out.println("Wprowadź sześć liczb w zakresie od 1 do 24!");
        for (int m = 0; m < howManyNumbers; ) {
            System.out.println((m + 1) + " liczba: ");
            int userNumber = scan.nextInt();
            duplicate = false;
            //użycie tej samej zmiennej dla wartości tymczasowych
            for (int n = 0; n < howManyNumbers; ) {
                if (userNumbers[n] == userNumber) {
                    System.out.println("ta liczba już była, jeszcze raz " + (m + 1) + " liczba");
                    duplicate = true;
                    break;
                    //przerywa, znów losuje i znów sprawdza od poczatku tablicy
                } else {
                    n++;
                    //else dla czytelności
                }
            }
            if (!duplicate) {
                userNumbers[m] = userNumber;
                m++;
            }
            //używanie tej samej nazwy licznika dla kolejnych pętli?
            //czy ta zmienna jest niszczona po wyjściu z petli?
            // czy pętla w pętli może mieć taką sama nazwę licznika?
        }
        int count = 0;
        for (int randomNumber : randomNumbers) {
            for (int userNumber : userNumbers) {
                if (randomNumber == userNumber) {
                    System.out.println("Trafiłeś" + randomNumber);
                    count++;
                }
            }
        }
        //todo przerobić na switch
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

      /*  switch (count){
            case 3:
                System.out.println("Trafiłeś 3 liczby! Wygrywasz 16 zł!");
               break;
            case 4:
                System.out.println("Trafiłeś 4 liczby! Wygrywasz 200 zł!");
                break;
            default:
                System.out.println("Nic nie wygrałeś");
        }*/


    }
}
