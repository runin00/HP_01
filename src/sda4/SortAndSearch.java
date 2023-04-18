package sda4;

import java.util.Arrays;

public class SortAndSearch {

    public static void main(String[] args) {
        // gdzie musi być funkcja main? jak jest na samym dole to też wydaje się, że jest dobrze
        int[] tab = {34, 67, 18, 3, 9, 45, 89, 43, 7, 78, 90, 14, 5, 44};
        sort(tab);
        System.out.println();
        System.out.println("Indeks szukanego numeru: " + search(tab, 45));
    }

    public static int[] sort(int[] tab) {

        System.out.println("Nieposortowana tablica");
        for (int i : tab) {
            System.out.print(i + " ");
        }
        Arrays.sort(tab);

        System.out.println("Posortowana tablica:");
        for (int i : tab) {
            System.out.print(i + " ");
        }
        return tab;
    }

    public static int search(int[] tab, int key) {

        return Arrays.binarySearch(tab, key);
    }
}
