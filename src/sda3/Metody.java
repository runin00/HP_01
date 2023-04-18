package sda3;

import java.util.Arrays;

public class Metody {
    public static void hello() {
        System.out.println("Hello");
    }
    // elemety deklaracju metody - public i static
    // void i int

    public static void name(String name) {
        System.out.println("Cześć " + name);
    }

    public static void textNumber(String text, int number) {
        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }
    }
    // dlaczego raz deklarije się String jak inne typy a raz jak instancje z new?

    public static void wiekImie(String name, int age) {
        if (age > 20) {
            System.out.println("Dzien dobry " + name);
        } else {
            System.out.println("Cześć " + name);
        }
    }

    public static void tablicaImion(String[] names) {
        for (String name : names) {
            System.out.println("Cześć " + name);
        }
    }

    public static void main(String[] args) {
        // dlaczego zawsze w main jest String[] args? przekazujemy tam argumenty?

       // System.out.println(Arrays.toString(args));

        hello();
        //name(args[2]);
        name("Kuba");
        textNumber("Jakiś tekst", 10);
        wiekImie("Kuba", 40);
        String[] names = {"Kuba", "Karol", "Alicja"};
        double[] numbers = {2, 3};
//        double[] numbers = new double[]{2, 3};
        tablicaImion(names);
       // tablicaImion({"Kuba", "Karol", "Alicja"}); //- nie mogłem tablicy przekazać bezpośrednio
//        tablicaImion(new String[]{"Kuba", "Karol", "Alicja"});
    }

    //java c Metody.java
    //java Metody Szczecin 20 Daniel
}
