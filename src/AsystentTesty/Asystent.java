package AsystentTesty;

import sda2.PetlaFor6LoteriaHard;
//bez importu nie ma dostępu do klasy PF6 która jest w innym pakiecie ale już do drugiejKlasy z sda1 bez problemu???
public class Asystent {
    public static void main(String[] args) {
        drugaKlasa.main(new String[]{"1"});
        //czy można wywołać funkcję main bez argumentów gdy ich nie ma? gdy tak zrobię wywala błąd
        drugaKlasa.print();
        //wywołanie metody z drugiej klasy bez tworzenia instancji
        drugaKlasa prn = new drugaKlasa();
        prn.print();
        // wywołanie metody przez tworzenie instancji
        sda1.drugaKlasa.print();
        // wywołuje tylko przez podanie pakietu przed, więc nie trzeba kopiować do katalogu klasy wywołującej
        sda1.drugaKlasa prn2 = new sda1.drugaKlasa();
        prn2.print();
        // też można
        //logika funkcji main
        //czy wywołuje się funkcję main? do czego jest funkcja main?
        //przy kompilacji wykonywana jest od razu zawartość funkcji main, czy można zatem tą funkcjąmuruchomić z innej klasy
        sda2.PetlaFor6LoteriaHard loteria = new PetlaFor6LoteriaHard();
        sda2.PetlaFor6LoteriaHard.loteria();

    }
}
