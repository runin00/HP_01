package sda2;

import java.util.ArrayList;
import java.util.List;

public class PetlaFor_3 {
    public static void main(String[] args) {

        /*Przygotuj tablicę 10 liczb  z przedziału -100 do 100. Za pomocą pętli for each:

        policz średnią z tych liczb
        wyświetl największą liczbę
        wyświetl najmniejszą liczbę*/

        int[] numbers = {-45, 78, 90, -39, 1, 32, -67, 12, 69, -15};
//        List<Integer> numbersList = new ArrayList<>();

        int count = 0;
        for (int number : numbers) {
            count += number;
        }
        System.out.println(" suma liczb to " + count + " Średnia z tych liczb to " + (count / numbers.length));
        int check = 0;
        for (int number : numbers) {
            if (number > check) {
                check = number;
            }

        }
        System.out.println("Największa liczba to " + check);
        int check_2 = 0;
        for (int i : numbers) {
            if (check > i) {
                check = i;
            }
        }
        System.out.println("Najmniejsza liczba to " + check);


    }
}
