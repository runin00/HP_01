package sda1;

import java.util.Scanner;

public class Petla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int liczba = scanner.nextInt();
        if (liczba != 0) {
            System.out.println("powtarzam");
            main(args);
        }
    }
}
