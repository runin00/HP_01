package sda4;

public class PolaStatyczne {

    static String dna = "agtcggctggactatgatggctgctaatgt";
    // bez static zmienna dna nie jest widoczna w metodach
    /*
    W nowej klasie zadeklaruj pole odpowiedniego typu o nazwie “dna”, a jego treść uzupełnić losową sekwencją 30 liter wykorzystując ten generator kodu DNA.

Stwórz metody, które wykonają następujące operacje:
zapisanie kodu dużymi literami,
zmiana wszystkich A na T i wszystkich G na C,
przycięcie kodu do pierwszych 15 znaków,

wariant trudniejszy: wstawienie spacji co trzeci znak.

Podpowiedź: wykorzystaj metody toUpperCase(), replace(char,char), substring(int,int) i charAt(int)

     */
    public static void main(String[] args) {

        upperCase();
        replace();
        snipet();
        every3rd();
    }

    public static void upperCase() {

        System.out.println(dna.toUpperCase());
    }

    public static void replace() {

        System.out.println(dna.replace('A', 'T').replace('G', 'C'));
    }

    public static void snipet() {

        System.out.println(dna.substring(0, 15));
    }

    public static void every3rd() {

        for (int i = 0; i < 30; i+=3) {

            System.out.print(dna.substring(i, (i + 3)) + " ");
        }
    }
}
