package sda4;

import java.util.Scanner;

public class instrukcjeSwich2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dwie liczby:/nPierwsza liczba >> ");
        int num1 = scan.nextInt();
        System.out.println("Druga liczba >>");
        int num2 = scan.nextInt();
        System.out.println("Jakie działania chcesz wykonać na tych liczbach?: ");
        System.out.println("+, -, *, /");
        char chr = scan.next().charAt(0);

        switch (chr) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
        }
    }
}
