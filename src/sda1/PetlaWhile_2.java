package sda1;

import java.util.Scanner;
public class PetlaWhile_2 {
    public static void main(String[] args) {

        Scanner scanObj = new Scanner(System.in);
        int score = 0;
        // jak tego uniknąć?
        // muszą zostać zainicjalizowane przed warunkami
        int sum = 0;
        while (score != -1) {
            score = scanObj.nextInt();
            sum += score;
        }
        System.out.println("Suma punktów to: " + sum);
    }
}
