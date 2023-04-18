package sda1;

public class Literaly {
    public static void main(String[] args) {

        System.out.println(5 + 4);
        System.out.println(7 + "osiem");
        System.out.println(3 + 4.67);

        System.out.println(4 > 3);
        System.out.println(2 + 2);
        System.out.println((10 + 20) / 7.0);

        System.out.println("10 + 20 daje " + (10 + 20));
        System.out.println("30 / 7 to " + 30.0 / 7.0);
        System.out.println(Math.pow(15, 2) > 100);

        // rozbijać złożone wyrażenia dla czytelności !!!
        // przy dzieleniu dzielna albo dzielnik musi być zmiennoprzecinkowa inaczej
        // - wynik zostanie zaokrąglony do int
    }
}
