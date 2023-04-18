package sda2;

import java.util.Random;

public class PetlaFor_2 {
    public static void main(String[] args) {
        /* Za pomocą pętli for wylosuj milion liczb z przedziału 1-100 i zapisz je w tablicy. Następnie stosując
        pętle for each policz ile razy wystąpiła liczba 25 i wyświetl tę informację na końcu programu
        wariant trudniejszy:  Program ma zliczyć ilość wystąpień każdej z liczb i wyświetlić efekty na koniec. */

        Random random = new Random();
        int[] numbers = new int[1_000_000];
        for (int i = 0; i < 1_000_000; ++i) {
            numbers[i] = random.nextInt(1, 101);
        }
        int count = 0;
        for (int number : numbers) {
            if (number == 25) {
                ++count;
            }

        }
        System.out.println("liczba 25 jest " + count + "razy na liście");

        for (int i = 1; i < 101; ++i) {
            int count2 = 0;
            // czy zmienne wewnątrz pętli sa prywatne tylko pętli?
            for (int number : numbers) {
                if (i == number) {
                    ++count2;
                }
            }
            System.out.println("Liczba " + i + " znajduje sie " + count2 + " razy na liście.");
        }

    }
}
