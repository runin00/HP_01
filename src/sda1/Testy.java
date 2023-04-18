package sda1;

public class Testy {
    public static void main(String[] args) {

        int cal;
        float zm;
        double duz;
        //cal = 5 / 6; // wyrzuci zero
        //cal =  5 / 6.0; // wyrzuci błąd konwersji typu
        cal = (int) (5 / 6.0); // wynik dzielenia zaokrągli do integer - konwersja stratna
        //zm = 5 / 6; // wyrzuci zero
        // zm = 5 / 6.0; // wyrzuci błąd konwersji typu
        zm = (float) (5 / 6.0); // wynik dzielenia zaokrągli do float
        zm = (int) (5 / 6.0);
        System.out.println(zm);

        // wynik z dzielenia Java domyślnie ustawia jako double
        // czy błąd konwersji stratnej to tylko ostrzerzenie czy błąd kompilacji?
        // czy może to wywołać błąd wykjonania programu czy tylko wynik będzie zdeformowany
    }
}
