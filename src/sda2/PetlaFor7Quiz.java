package sda2;

import java.util.Arrays;
import java.util.Scanner;

public class PetlaFor7Quiz {
    public static void main(String[] args) {

        quiz();
/*        Stwórz quiz na temat jednego z Twoich hobby, z minimum trzema pytaniami zamkniętymi.
          Na każde pytanie jest tylko jedna poprawna odpowiedź. Na koniec wyświetl wyniki quizu.
          wariant trudniejszy: Zastosuj również pytania wielokrotnego wyboru lub pytania otwarte w których należy wpisać odpowiednią liczbę.
*/}
        public static void quiz() {
            Scanner scan = new Scanner(System.in);

            String[] questions = {
                    "Jakie jest najbardziej znane piwo pochodzące z Monachium?",
                    "Jaka waluta obowiązuje w Tajlandii?",
                    "Kto napisał \"Jihad kontra Mcświat?\""
            };

            String[][] answers = {
                    {"Bitburger", "Paulaner", "Budweiser"},
                    {"Bath", "Dirham", "Dinar"},
                    {"Naomi Klein", "Francis Fukuyama", "Benjamin Barber"}
            };

            char[] positive = {'B', 'A', 'C'};
            System.out.println("Quiz");
            System.out.println("Odpowiedz na trzy pytania. odp A, B, C");
            for (int i = 0; i < 3; i++) {
                System.out.println("Pytanie " + (i + 1) + ":");
                System.out.println(questions[i]);
                System.out.println("Odpowiedzi:");
                for (int j = 0; j < 3; j++) {
                    System.out.println(answers[i][j]);
                }
                char answer = scan.next().charAt(0);
                if (answer != positive[i]) {
                    System.out.println("Odpowiedź niepoprawna.");
                } else {
                    System.out.println("Dobra odpowiedź.");
                }

            }

        }
    }