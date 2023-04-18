package sda3;

import java.lang.reflect.Array;
import java.util.Random;

public class Metody3 {
/*
Przygotuj następujące metody i przetesuj w main:
metoda zwraca Twoją ulubioną liczbę. Przyjmij do zmiennej w main i wyświetl wartość zwróconą
metoda przyjmuje trzy liczby i zwraca ich sumę
metoda losuje liczbę od 1 do 10 i zwraca
metoda przyjmuje ilość lat i zwraca ilość dni
metoda przyjmuje dwie liczby i dzieli pierwszą przez drugą. Jeśli druga liczba to 0 metoda ma zwrócić -1 aby zakomunikować błąd.
metoda przyjmuje dzień, miesiąc i rok urodzenia i zwraca je w postaci String formatując w ten sposób: “RRRR-MM-DD”
metoda przyjmuje trzy liczby, zwraca true jeśli wszystkie trzy liczby są identyczne. W main, testując metodę wyświetl “Takie same”
jeśli zwróciła true oraz “Inne” jeśli false.
metoda przyjmuje tablicę liczb i zwraca ich sumę
metoda przyjmuje tablicę liczb oraz liczbę całkowitą, zwraca true jeśli w tablicy istnieje liczba większa od przekazanej, false jeśli nie

*/
    public static int favouriteNumber() {
        return 500;
    }

    public static double sum(double one, double two, double three) {
        return one + two + three;
    }

    public static int random() {
        Random random = new Random();
        return random.nextInt(1, 10);
    }

    public static int yearsDays(int years) {
        return years * 365;
    }

    public static double div(double x, double y) {
        if (y == 0) {
            return -1;
        } else {
            return x / y;
        }
    }

    // czy metoda może zwracać kilka zmiennych?
    // czy metoda może zwracać kilka typów?

    public static String dayMonthYear(int day, int month, int year) {
        String mothView = "" +month;
        if (month < 10) {
            mothView = "0" + month;
        }
        return year + " - " + month + " - " + day;
    }

    public static boolean theSame(int x, int y, int z) {
        if ((x == y) && (x == z)) {
            return true;
        } else {
            return false;
        }
    }

    public static int arraySum(int[] tab) {
        int sum = 0;
        for (int i : tab) {
            sum += i;
        }
        return sum;
    }

    public static boolean ifBigger(int[] ara, int x) {
        boolean flag = false;
        for (int i : ara) {
            if (i > x) {
                flag = true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int var = favouriteNumber();
        System.out.println("Ulubiona liczba to " + var);
        System.out.println("Suma trzech liczb to " + sum(123, 34, 78));
        System.out.println("Wylosowana liczba to " + random());
        System.out.println("12 lat to " + yearsDays(12) + " dni");
        System.out.println("Wynik dzielenia 23 przez 0 " + div(23, 0));
        System.out.println(dayMonthYear(23, 9, 2023));
        if (theSame(23, 23, 23)) {
            System.out.println("Takie same");
        } else {
            System.out.println("Inne");
        }
        int[] tab = {1, 2, 3, 4, 5, 6};
        System.out.println("Suma elementów tablicy wynosi " + arraySum(tab));
        System.out.println("W tablicy jest liczba wieksza od " + 15 + ": " + ifBigger(tab, 15));
        // znów kompilując tą klase zaczyna mi kompilować inne Metody3 - Metody3Hard
        // jak wymuszę jakiś błąd w Metody3Hard np ; to tak sie staniue
    }
}
