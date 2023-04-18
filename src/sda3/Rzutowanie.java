package sda3;

import java.sql.SQLOutput;

public class Rzutowanie {
        /* Przygotuj następujące metody i przetesuj w main:
        - metoda przyjmuje dwa argumenty typu double oraz int.
        Zwraca pierwszą liczbę podniesioną do potęgi wartości drugiej liczby. Wynik zwraca w double
        - przetestuj powyższą metodę dla liczb 3 oraz 5, wynik zapisz do zmiennej int i wyświetl. Wykorzystaj rzutowanie.
        Po przekazaniu jakich wartości program będzie wyświetlać nieprawidłowe wyniki? Przetestuj to.
        - przygotuj metodę przyjmującą ilość minut i zwracającą ilość milisekund. Jako typ zwracany metody zadeklaruj wartość long.
        Wykorzystaj tę metodę dla przeliczenia 5 min. Wartość zwróconą przypisz do zmiennej int i wyświetl.
        Wykorzystaj rzutowanie. Potestuj metodę i sprawdź, jakie argumenty musiałbyś
        przekazać aby metoda zaczęła dawać niepoprawne wyniki?
        wariant trudniejszy: stwórz metodę która przyjmuje liczbę int oraz zwraca informację ile razy rzutowanie
        tej liczby na typ byte przekroczy jego maksymalną wartość. */

    public static double power(double base, int pow) {

        return Math.pow(base, pow);
    }

    public static long milisec(int sec) {

        return sec * 1000;
    }

    public static void intByte(int number) {

        // zakresy zmiennych - nazwa parametru, czy może krzyżować się z innymi w pozostałych metodach
        // byte - 128 do 127
        // integer -2,147,483,648 do 2,147,483,647
        System.out.println("Rzutowanie int na byte przekroczy wartość typu byte " + (number / 127.0) + " razy");
    }

    public static void main(String[] args) {

        int result = (int) power(3.5, 5);
        System.out.println("Wynik to " + result);
        System.out.println("Poprawny wynik to " + Math.pow(3.5, 5));
        // niepoprawne dany bedzie wyświetlał gdy trzeba bedzie zaokrąglić część dziesiętną
        // czyli gdy liczba będzie miała rozwinięcie dziesiętne

        int result2 = (int) milisec(5_000_000_00);
        System.out.println("5 sekund to " + result2 + " milisekund");
        // gdy przekroczy 5 mld, zakres wartości dla integer

        intByte(1000);
        int x = 999;
        short y = 20_000;
        System.out.println((float) x);
        System.out.println((byte) x);
        //dlaczego wyświetla -24>? powinna być największa wartość byte czy 127
        System.out.println((byte) y);
        // a dlaczego tu 32?

        // kiedy zmieniłem klasę i metody na private w ogóle nie chciało sie kompilować
    }
}


