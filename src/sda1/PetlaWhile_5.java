package sda1;

public class PetlaWhile_5 {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        java.util.Scanner scanObj = new java.util.Scanner(System.in);
        int yourNumber = -1;
        int tries = 0;
        // czy ja muszę tak inicjalizować aby móc wywołać warunek pętyli?
        int number = random.nextInt(1, 10);
        System.out.println("Wylosowana liczba to " + number);
        while (yourNumber != number) {
            System.out.println("Zgadnij liczbę:");
            yourNumber = scanObj.nextInt();
            if (yourNumber > number) {
                System.out.println("Liczba za duża.");
            } else if (yourNumber < number) {
                System.out.println("Liczba jest za mała.");

            }
            ++tries;

        }
        System.out.println("Trafiłeś za " + tries + " razem");

    }
}
// nie rozumiem wersji trudniejszej