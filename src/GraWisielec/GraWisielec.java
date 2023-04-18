package GraWisielec;

import java.util.Random;
import java.util.Scanner;

public class GraWisielec {

    static String[] phrases = {"opłata", "coś", "Prokrastynacja"};
    static Scanner scan = new Scanner(System.in);
    // czy można wszystko sczytywać ogólnym skaneram dla całej klasty?
    // i tak samo z Randomem???
    static String gotLetters;
    static String[] hangman = {"------", "|   |", "|   0", "|  /|\\  ", "|   |", "|  / \\ ", "|", "------"};
    // ciekawy problem - jak wyświetlić "/|\" - omijając znak ucieczki?
    static int hangCount;
    static boolean end = false;

    public static void main(String[] args) {

        // co jeśli raz wyprodukowana przez metodę zmienna musi być dostępna kilka razy - np wylosowane słowo
        // nie można ponownie wywołać metody je tworzące bo wylosuje inne
        String word = randomWord();
        // ta zmienna aby była dostępna w metodzie musi zostać do niej przekazana, pole statyczne jest dostępne bezpośrednio
        // pola statyczne a zmienne wprowadzone w metodzie main? - czym sie różnią?
        gotLetters = "";
        hangCount = 0;
        end = false;
        instruction();
        System.out.println("Słowo to: " + word);
        // wyizolowanie konkretnego fragmentu kodu do testowania, bez reszty metod
        while (!end) {

            displayWord(word);
            checkLetterInWord(takeLetter(), word);

        }

        /*
        ------
        |   |
        |   0
        |  /|\
        |   |
        |  / \
        |
        ------
         */
    }
    public static void instruction() {

        System.out.println("Odgadnij wylosowane słowo podając litery, które uważasz, że słowo może zawierać. " +
                "Każda nietrafiona litera buduje szubienicę. ");
        //scan.nextLine();
        // jak kontynuować dopiero po wciśnięciu entera? - jak zeskjanować sam enter?
    }
    public static String randomWord() {

        Random ran = new Random();
        return phrases[ran.nextInt(0, 2)];
    }
    public static void displayWord(String word) {

        String matrix = "";
        boolean letterPresent = false;
        char tmpLetter = ' ';
        for (int i = 0; i < word.length(); i++) {
            letterPresent = false;
            for (int j = 0; j < gotLetters.length(); j++) {
                if (word.charAt(i) == gotLetters.charAt(j)) {
                    letterPresent = true;
                    tmpLetter = gotLetters.charAt(j);
                }
            }
            if (!letterPresent) {
                matrix += "-";
            } else {
                matrix += tmpLetter;
            }
            // jak nie iterować za każdym razem od początku w celu wywietlania - tablica, druga wersja
        }
        if (!matrix.contains("-")) {
            System.out.println("Zgadłeś słowo");
            end = true;
        }
        System.out.println("Szukane słowo: " + matrix);
    }
    public static String takeLetter() {

        char charLetter;
        String tmpLetter = "";
        //za każdym razem kiedy będzie pobierał literę będzie tworzył tą zmienną, czy nie lepiej stworzyć pole statyczne?
        boolean isNew = false;
        do {
            System.out.println("Podaj literę >>");
            charLetter = scan.next().charAt(0);
            for (int i = 0; i < gotLetters.length(); i++) {
                if (gotLetters.charAt(i) == charLetter) {
                    System.out.println("Tą literę już podałeś");
                    break;
                }
            }
            isNew = true;
            } while (!isNew);
        // czy za każdym razem będzie tworzona ta zmienna i potem usuwana - czy tak mogę?
        //contains tylko do sequences of string - beznadzieja i pokopane sa zależności między typami znakowymi
        tmpLetter += charLetter;
        System.out.println("Wprowadziłeś " + tmpLetter);
        return tmpLetter;
    }
    public static void checkLetterInWord(String letter, String word) {
        // gdy wpiszemy zmienną do parametrów to przysłania ona pole statyczne o tej samej nazwie
        System.out.println(letter);
        System.out.println(word);
        if (word.contains(letter)) {
            gotLetters += letter;
            System.out.println("Trafiłeś literę");
        } else {
            System.out.println("Tej litery nie ma w szukanym słowie");
            hangCount += 1;
            drawHangman();
            if (hangCount == 7) {
                end = true;
            }
        }
    }
    public static void drawHangman() {
        for (int i = 0; i < hangCount; i++) {
            System.out.println(hangman[i]);
            // przekazywanie wartośći bezpośrednio do metody czy modyfikowanie pola statycznego
            // do którego ma dostęp dana metoda - jak tutaj hangCount?
        }
    }
}
