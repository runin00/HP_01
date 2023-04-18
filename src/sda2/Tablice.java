package sda2;

import java.util.Arrays;
import java.util.Random;

public class Tablice {
    public static void main(String[] args) {
      /*  Napisz program “Poszukiwany”, stwórz i przypisz do odpowiednich zmiennych dwie tablice:
        tablica liczb z 4 miejscami,
                tablica tekstów z 2 miejscami.
                Następnie przypisz ręcznie:
        do liczb: osobno dzień,  miesiąc, rok ucieczki z więzienia,
                na 4 pozycji wpisz kwotę nagrody,
        do tekstów:  imię  i nazwisko uciekiniera.
        Wyświetl uzupełnioną wiadomość:
“ … - … - ….. zbiegł więzień …… …….. !”
“Nagroda za przyprowadzenie: ……….$!”*/

        int[] numbers = new int[4];
        String[] texts = new String[2];
        // czy są tablice mieszane?
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2015;
        numbers[3] = 100000;
        texts[0] = "Al";
        texts[1] = "Capone";
        System.out.println(numbers[0] + " - " + numbers[1] + " - " + numbers[2] + " zbiegł więzień " +
                texts[0] + " " + texts[1] + " !\n\"Nagroda za przyprowadzenie: " + numbers[3] + " $ !");

        double[] four = {2.4, 4.7, 23.5647, 0.04556};
        boolean[] bool =new boolean[] {true, false};
        char[] lit = {'j', 'a', 'v', 'a'};
        String[] strings = {new String("abc"),"sdf",new String("dfgdf")};
        strings[0] = "cvb";

        // czy zatem jest różnica między podwójnym i pojedynczym cudzysłowem?
        System.out.println(Arrays.toString(four));
        System.out.println(java.util.Arrays.toString(bool));
        System.out.println(java.util.Arrays.toString(lit));

        int[] ran = new int[3];
        java.util.Random random = new java.util.Random();

        Random[] randoms = {new Random(), new Random(), new Random()};
        randoms[1].nextInt(0, 5);

        int count = 0;
        while (count != 2) {
            ran[count] = random.nextInt(1, 10);
            ++count;
        }
        System.out.println(java.util.Arrays.toString(ran));
        System.out.println(random.nextInt(0, 5));




    }

}
