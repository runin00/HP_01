package sda4;

import java.util.Scanner;

public class BibliotekiStatyczne {

    public static void main(String[] args) {
        System.out.println(Math.pow(2, 5));
        System.out.println(ifDigit("gh12"));

        System.out.println(textNumber());
    }
    /*Wykonaj następujące zadania:
    Wyświetl piątą potęgę liczby 2 wykorzystując bibliotekę Math.
    stwórz metodę która przyjmie tekst i zwróci true jeśli ostatni znak będzie cyfrą. Przykładowo “ul. Wiejska 1” -> true
    Podpowiedź: wykorzystaj metody charAt oraz metodę isDigit z biblioteki Character
    napisz metodę, w której za pomocą scannera pobierzesz liczbę i ją zwrócisz. Metoda ma zwracać -1 jeśli poda się tekst.
    Podpowiedź: wczytaj liczbę jako tekst, sprawdź czy jest tam na pewno liczba a potem przekonwertuj ją
    do typu int za pomocą metody parsującej z biblioteki Inteeger
    wariant trudniejszy: jeśli poda się litery metoda ma pozwolić na powtórne wprowadzanie danych do skutku.
    napisz metodę, która wyszukuje element i zwraca jego pozycję. Wykorzystaj algorytm sortowania
    binarnego zaimlementowany w bibliotece Arrays. Metoda ma najpierw posortować przyjęty zbiór.
     */

    public static boolean ifDigit(String text) {

        char ch = text.charAt(text.length() - 2);
        return Character.isDigit(ch);
    }

    public static int textNumber() {

        Scanner scan = new Scanner(System.in);
        Boolean justNumbers = false;
        Boolean isNumber;
        String number;
        // aby te zmienne były dostępne poza pętlą a także dla weryfikacji warunku przez while, muszą zostać zdefiniowane
        // przed pętlą
        do {
            number = scan.nextLine();
            String checkNum = "1234567890";
            for (int i = 0; i < number.length(); i++) {
                isNumber = false;
                for (int j = 0; j < checkNum.length(); j++) {
                    if (number.charAt(i) == checkNum.charAt(j)) {
                        isNumber = true;
                        break;
                    }
                }
                if (isNumber == false) {
                    justNumbers = false;
                    break;
                } else {
                    justNumbers = true;
                }
            }
        } while (justNumbers == false);
        return Integer.parseInt(number);

    }
}