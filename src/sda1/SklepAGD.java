package sda1;

import java.util.Scanner;

public class SklepAGD {
    /*
        W sklepie ze sprzętem AGD oferowana jest sprzedaż ratalna.
                Napisz program umożliwiający wyliczenie wysokości miesięcznej raty za zakupiony sprzęt.
                 Danymi wejściowymi dla programu są:
• cena towaru (od 100 zł do 10 tys. zł),
• liczba rat (od 6 do 48).
        Program powinien sprawdzać, czy podane dane mieszczą się w określonych powyżej zakresach, a w przypadku błędu wyświetlać
        stosowny komunikat i natychmiast zakończyć działanie programu. (użyj instrukcji return)
        Kredyt jest oprocentowany w zależności od liczby rat:
 • od 6–12 wynosi 2.5% ,
• od 13–24 wynosi 5%,
• od 25–48 wynosi 10%.
        Obliczona miesięczna rata powinna zawierać również odsetki.

                Podpowiedź: możesz zakończyć metodę main i tym samym wyjść z programu w dowolnym momencie stosując instrukcję:
                return; lub System.exit(int);

        wariant trudniejszy: zadbaj o jak najmniejszą ilość powtórzeń w kodzie
*/
    static int outInstal;
    // czy mogę nazwać ją tak jak lokalną? czyli instal?
    public static void main(String[] args) {

        System.out.println("Twoja rata: " + obliczRate(pobierzWartosc(), pobierzIloscRat(), obliczOprocentowanie(outInstal)));
        // jaka jest konwencja wymiany danych między metodami
        //czy taki zapis przejdzie? czy rozbijamy to i przekazujemy za pomocą zmiennych?
    }

    public static float pobierzWartosc() {
        Scanner scanObj = new Scanner(System.in);
        float price = 0.0f;
        //definiowanie zmiennej warunku dla while przed while - jak się to robi standardowo?
        //bo musi zostać nadana wartość która umozliwi wykonanie pętli przynajmniej jeden raz
        while (price < 100.0 || price > 10000.0) {
            //do powtarzania pobierania wartości do skutku while czy do while?
            System.out.println("Podaj wartość sprzętu w przedziale od 100 do 10 tys zł: ");
            price = scanObj.nextFloat();
            if (price < 100.0f || price > 10000.0f) {
                System.out.println("Wartość spoza zakresu");
            }
        }
        return price;
    }

    public static int pobierzIloscRat() {
        int instal = 0;
        while ((instal < 6) || (instal > 48)) {
            System.out.println("Podaj ilość rat (od 6 do 48): ");
            Scanner scanObj = new Scanner(System.in);
            //ponownie trzeba inicjalizować instancję scannera
            // czyli takie zmienne użytkow trzeba określać lokalnie?
            instal = scanObj.nextInt();
        }
        if ((instal < 6) || (instal > 48)) {
            // pojedycza czy podwójna kreska? | vs ||?
            System.out.println("Liczba rat poza zakresem");
            // domyślnie Java przyjmuje double i tego typu należy używać}
        }
        outInstal = instal;
        return instal;
    }

    public static float obliczOprocentowanie(int install) {

            // jak zmienna parametyru była taka sama jak zmienna matody której zwrot ma zostać przez tą
            // zmienna przyjęty to zacząął się rzucać - dlatego install; ale to przecież zmienna lokalna???
            float inter = 0;
            //inaczej może nie zostać zwrócona

            if (install <= 12) {
                // dolny zamknęło pierwsze if
                // operator && - gdy pierwszy warunek nie jest spełniony nie sprawdza już następnego
                // operator & - sprawdza oba warunki nawet jeśli pierwszy nie jest spełniony, czasem może wywołać to błąd
                inter = 2.5f;
                //czy można zmienić typ zmiennej przed jej inicjalizacją - nie typy musza się zgadzać
            } else if (install > 12 && install <= 24) {
                inter = 5f;
            } else if (install > 24) {
                //górny zakres także pierwszy if domknął
                inter = 10f;
            } else {
                inter = 0f;
                //jeszcze raz z określeniami rodzaju typu przy wartości
            }
            return inter;
        }

    public static float obliczRate(float price, int instal, float inter) {

        float monthPayment = (price * (inter / 100) + price) / instal;
        return monthPayment;
    }
}
