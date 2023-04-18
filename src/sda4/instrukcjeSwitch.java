package sda4;

import java.awt.*;
import java.util.Scanner;

public class instrukcjeSwitch {
    public static void main(String[] args) {

        System.out.println("Zaczynasz przygodę! W którą stronę chcesz iść?\n" +
                "1 - na zachód\n" +
                "2 - na wschód\n" +
                "3 - na północ\n" +
                "4 - na południe?\n");
        Scanner scan = new Scanner(System.in);
        int answer = scan.nextInt();

        switch (answer) {
            case 1:
                System.out.println("Poszedłeś prosto.");
                break;
            case 2:
                System.out.println("Poszedłeś na lewo do lasu.");
                break;
            case 3:
                System.out.println("Poszedłeś po piwo :) ");
                break;
            case 4:
                System.out.println("Na prawo nie chciało Ci się iść więc usiadłeś z piwem pod drzewem :))) ");
                break;
            default:
                System.out.println("Po co gdzieś iść? Masz już piwo.");

                // bez break wykonują się wszystkie warianty od tego który wybrałeś w dół - bez sensu


        }
    }
}
