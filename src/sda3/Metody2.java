package sda3;

public class Metody2 {
/* wariant trudniejszy: metoda przyjmuje ilość sztuk towaru, cenę oraz podatek.
Powinna wyliczyć łączoną cenę towaru. Jeśli cena przekracza 100 zł powinna ustawić zmienną boolean darmowaWysylka na true.
Przygotuj drugą, pomocniczą metodę dla tej pierwszej, która przyjmie łączoną cenę towaru oraz informację o darmowejWysylce i wyświetli
stosowny komunikat o cenie do zapłaty oraz informację czy przesyłka będzie za darmo. Do wyświetlonej ceny powinna dodać ew. koszt wysyłki + 10zł.
*/
    public static void cenaTowaru(double amount, double price, double tax) {

        double sum = ((amount * price) * tax) + (amount * price);
        boolean freeDelivery = false;
        if (sum > 100) {
           freeDelivery = true;
        }
        cenaTowaruPrint(freeDelivery, sum);
        // deklaracja metody ze zwracanymi zmiennymi i ich typami
        // metoda zwracająca różne typy
    }

    public static void cenaTowaruPrint(boolean freeDelivery, double sum) {

        if (freeDelivery) {
            System.out.println("Całościowa cena zamówionego towaru wynosi " + sum + " zł.");
            System.out.println("Dostawa będzie darmowa");
        } else {
            System.out.println("Całościowa cena zamówionego towaru wynosi " + (sum + 10) + " zł.");
            System.out.println("Dostawa będzie płatna ");
        }
    }

    public static void main(String[] args) {

        cenaTowaru(12, 34,0.05);

    }
}