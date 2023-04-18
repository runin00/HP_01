package sda4;

public class MetodyString {
    /* Stwórz zmienną typu String i zainicjuj ją dowolnym zdaniem złożonym, a następnie:
    wyświetl zdanie dużymi literami,
    zapisz w zmiennej odpowiedniego typu ilość symboli w zdaniu,
    wyświetl pierwszą literę w tym zdaniu,
    nadpisz oryginalną zmienną tak, żeby zawierała zdanie wielkimi literami,
    wyświetl odpowiedź na pytanie czy w zdaniu znajduje się słowo “nie” (true/false),
    wyświetl fragment tekstu od znaku 5 do 13,
    wyświetl fragment tekstu od znaku 7 do końca,
    Podpowiedź: możesz wykorzystać metody: repeat(int), charAt(int), substring(int,int), substring(int),
    contains(String), toUpperCase(), length()
    Podpowiedź 2: skrót do wyświetlenia dokumentacji metody to ctrl + q (Windows)

    wariant trudniejszy:
    wyświetl ostatnią literę zdania, program ma działać poprawnie dla zdania dowolnej długości
    wyświetl zdanie 5 razy dodając po drodze symbol nowej linii metodą concat(String)
    Podpowiedź 3: możesz wywoływać metody wielokrotnie o ile produktem metody
    jest nowa wartość typu referencyjnego np: tekst.toUpperCase().charAt(0)
     */

    public static void main(String[] args) {

        String str;
        str = "Jakieś zdanie, które jest zdaniem złożonym, a nawet wielokrotnie złożonym.";
        System.out.println(str.toUpperCase());
        int amount = str.length();
        System.out.println("h j k".length());
        // length podaje także spacje
        System.out.println(amount);
        str = str.toUpperCase();
        System.out.println(str);

        System.out.println(str.charAt(0));
        System.out.println(str.contains("nie"));
        System.out.println(str.substring(5, 14));
        System.out.println(str.substring(7));

        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.concat("\n").repeat(5));

    }
}
