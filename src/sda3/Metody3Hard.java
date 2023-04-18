package sda3;
import java.util.Arrays;
public class Metody3Hard {
    /*wariant trudniejszy: metoda przyjmuje liczbę całkowitą. Powinna zwrócić tablicę liczb pierwszych
    nie większych niż przekazana liczba.
     */

    // najpierw policz ilość elementów a potem stwórz tablicę !!!
    public static int[] primary(int number) {

        // czy może byc tablica z zero elementami?
        int index = 0;
        int[] arr = new int[index];
        int[] arrTmp = new int[index]; // od początku obie tablice maja tyle samo pól
        int count = 0;
        for (int i = 2; i <= number; i++) {
            count = 0;
            //zmienne w pętli są niszczone po wyjściu z petli?
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count < 3) {
                // arrTmp = arr;
                // co z referencjami współdzielonymi - twarde kopiowanie?
                index++;
                for (int k = 0; k < arr.length; k++) {
                    arrTmp[k] = arr[k];
                }
                arr = new int[index];

                for (int l = 0; l < (arr.length - 1); l++) {
                    arr[l] = arrTmp[l];
                }

                // gdzie istnieją zmienne licznikowe a gdzie pozostałe zmienne w pętli?
                arr[arr.length - 1] = i;
                arrTmp = new int[index];
            }
           // arr = Arrays.copyOf(arr, arr.length + 1);
        }
        return arr;
    }


    public static void main(String[] args) {

        for (int i : primary(23)) {
            System.out.println(i);
            //dlaczego część zmiennych i mewtod jest pochyłą czcionką?
        }
    }
}
