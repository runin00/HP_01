package sda2;

public class Tablice_2 {
    public static void main(String[] args) {
        /*Szybkim sposobem stwórz tablicę 10 liczb i wstaw wartości z przedziału 1 - 1000.
        za pomocą pętli wyświetl wszystkie liczby,
        wyświetl tylko liczby większe niż 100,
                wyświetl tylko nieparzyste liczby i mniejsze niż 750.

        wariant trudniejszy:  za pomocą pętli policz średnią tych liczb*/

        System.out.print("Wszystkie z listy:");
        int[] numbers = {367, 89, 625, 68, 423, 672, 123, 24, 654, 198};
        int count = 0;
        int sum = 0;
        do {
            System.out.println(numbers[count]);
            sum += numbers[count];
            ++count;
        }
        while (count < 10);
        System.out.println("Średniaq to: " + sum / (count - 1));

        System.out.println("Tylko mniejsze od 100:");
        count = 0;
        do {
            if (numbers[count] < 100) {
                System.out.println(numbers[count]);
            }
            ++count;
        }
        while (count < 10);

        System.out.println("Nieparzyste mniejsze od 750");
        count = 0;
        do {
            if (((numbers[count]) < 750) && ((numbers[count] % 2) != 0)) {
                System.out.println(numbers[count]);
            }
            ++count;
        }
        while (count < 10);
    }
}
