package sda1;

public class Zmienne {
    public static void main(String[] args) {
        int x = 20, y = 5, z = 12, v = x + y + z;
        System.out.println("Podane liczby to: " + x + ", " + y + ", " + z + ", a ich suma to " + v);

        int minutes = 3478;
        float f_minutes = (float) minutes;
        System.out.println(minutes + " minut to " + (f_minutes / 60) + "godzin, oraz " + (minutes * 60) + " sekund");
        // co z tym dzieleniem i wynikiem we float
        //sformatować składniki float

        float kwota = 148;
        float eur = 4.6F;
        float usd = 4.4F;
        System.out.println(kwota + " złotych to " + kwota / eur);
        System.out.println(kwota + " złotych to " + kwota / usd);
        //sformatować wynik do dwóch miejsc po przecinku
        //dlaczego println zmieniło kolor na czerwony?

        /*Napisz program który oblicza wskaźnik BMI: wzór: waga/wzrost². Waga ma być
        podana w kilogramach, a wzrost w metrach. Dodatkowo program ma sprawdzić czy BMI
        jest powyżej 24,9 - nadwaga  lub czy BMI jest poniżej 18,5 - niedowaga.
         Poinformuj w konsoli o każdym działaniu programu.
         */

        int waga = 75;
        float wzrost = 1.78f;
        float wzrostKwadrat;
        float BMI;
        System.out.println("Twoja waga to " + waga + " a wzrost to " + wzrost);
        System.out.println("Twój wzrost podnoszę do kwadratu");
        wzrostKwadrat =(float) Math.pow(wzrost, 2);
        // po co dodatkowa konwersja na float, gdy wszystkie zmienne będą float java także wymaga takiej konsersji?
        // type casting? narrowing and widening, automatic and manual
        System.out.println("Dzielę wagę przez wzrost podniesiony do kwadratu");
        BMI =waga /wzrostKwadrat;
        System.out.println("Twoje BMI wynosi " + BMI);
        System.out.println("Masz nadwagę: " + (BMI >= 24.9));
        System.out.println("Masz niedowagę: " + (BMI <= 18.5));
        System.out.println("Twoja waga jest w normie: " + (BMI >18.5 & BMI <24.5));

        //sformatować wyniki




    }
}