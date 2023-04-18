package Asystent;

        import java.util.Arrays;
        import java.util.Random;
        import java.util.Scanner;

public class Loteria {
    static int howManyNumbers = 6;

    /*
        Symulator loterii liczbowej:
        wprowadzenie 6 liczb (1-24)
        wylosowanie 6 liczb (1-24)
        sprawdzenie, które liczby są trafione
        wyświetlenie wyniku i nagrody:
        0-2 = 0zł, 3 = 16
        4 = 200zł, 5 = 4 000 zł
        6 = 1 500 000 zł
        Użyj każdego z poznanych narzędzi: zmienna, operatory, warunek, tablice, Scanner, Random, Pętle..
        wariant trudniejszy: Liczby wprowadzane ani liczby losowane nie mogą się  powtarzać.
        */
    public static void main(String[] args) {

        dajNagrode(wylosujLiczby(), pobierzLiczby());
    }

    public static int[] wylosujLiczby() {

        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int[] randomNumbers = new int[howManyNumbers];
        //każda tablica jest nowym obiektem
        for (int i = 0; i < howManyNumbers; i++) {
            randomNumbers[i] = ran.nextInt(1, 24);
            //prnscr tego co zrobiłem tu wcześniej - tworzenie zmiennej w każdym obrocie pętli
            for (int j = 0; j < i; j++) {
                if (randomNumbers[j] == randomNumbers[i]) {
                    i--;
                    //zakładam że wywoła to powtórzenie tego samego kroku zewnętrznej pętli
                    break;
                    //po powtórce nie ma sensu sprawdzać reszty niumerów
                }
            }

            //bardzo często w randomie powtarzają się liczby
        }
        System.out.print("Wylosowane liczby to: ");
        for (int i : randomNumbers) {
            System.out.print(" " + i + " ");
        }
        return randomNumbers;
    }

    public static int[] pobierzLiczby() {

        int[] userNumbers = new int[howManyNumbers];
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź sześć liczb w zakresie od 1 do 24!");
        for (int i = 0; i < howManyNumbers; i++) {
            System.out.println((i + 1) + " liczba: ");
            userNumbers[i] = scan.nextInt();
            if ((userNumbers[i] < 1) || (userNumbers[i] > 24)) {
                System.out.println("Liczba poza zakresem.");
                i--;
                // czy tak wygląda standardowy sposób cofnięcia się w petli gdy krok nie spełni naszych warunków?
            }
            for (int j = 0; j < i; j++) {
                if (userNumbers[i] == userNumbers[j]) {
                    System.out.println("ta liczba już była, jeszcze raz " + (i + 1) + " liczba");
                    i--;
                    break;
                }
            }
        }
        System.out.print("Twoje liczby to: ");
        for (int i : userNumbers) {
            System.out.print(" " + i + " ");
        }
        return userNumbers;
        //używanie tej samej nazwy licznika dla kolejnych pętli?
        //czy ta zmienna jest niszczona po wyjściu z petli?
        // czy pętla w pętli może mieć taką sama nazwę licznika?
    }

    public static void dajNagrode(int[] randomNumbers, int[] userNumbers) {

        int count = 0;
        for (int randomNumber : randomNumbers) {
            for (int userNumber : userNumbers) {
                if (randomNumber == userNumber) {
                    System.out.println();
                    System.out.println("Trafiłeś:  " + randomNumber);
                    count++;
                }
            }
        }
        // zamiana na switch ale musiałem zostawić jedno if
        if (count < 3) {
            System.out.println("Nic nie wygrałeś");
        }
        switch (count) {
            //znów propozycja zmiany struktury switch
            case 3:
                System.out.println("Trafiłeś 3 liczby! Wygrywasz 16 zł!");
                break;
            case 4:
                System.out.println("Trafiłeś 4 liczby! Wygrywasz 200 zł!");
                break;
            case 5:
                System.out.println("Trafiłeś 5 liczb! Wygrywasz 4000 zł!");
                break;
            case 6:
                System.out.println("Trafiłeś 6 liczb! Wygrywasz 1 500 000 zł!");
                break;
        }
    }
}

