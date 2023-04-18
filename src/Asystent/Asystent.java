package Asystent;



import java.util.Random;
import java.util.Scanner;

public class Asystent {
    static String[] menu = {"Loteria", "Quiz", "Sklep AGD", "Zakończ program"};
    static boolean exit = false;
    public static void main(String[] args) {

        rozpocznijProgram();
    }
    public static void rozpocznijProgram() {
        System.out.println(generujPowitanie());
        while (!exit) {

            drukujListeOpcji();
            uruchomOpcje(pobierzWybor());
        }
        System.out.println(generujPozegnanie());
    }
    public static String generujPowitanie() {
        Random ran = new Random();
        //czy trzeba losować indeks do tablicy? nie ma bezpośredniego sposobu losowania elementu tablicy?
        //wtedy po prostu tworzę tablicę i np zaciągam jako parametr do randoma, bez całego systemu wyboru
        int index = ran.nextInt(5);
        String[] greetings = {"Cześć", "Siema", "Dzień Dobry", "Jak leci?", "Co u Ciebie?"};
        return greetings[index];}
    public static String generujPozegnanie() {
        Random ran = new Random();
        int rep = ran.nextInt(1,6);
        return ("pa".repeat(rep) + "!");
    }
    public static void drukujListeOpcji() {
        System.out.println("Co chcesz uruchomić?");
        int count = 1;
        for (String i : menu) {
            System.out.println(count + " - " + i);
            count++;
        }
    }
    public static int pobierzWybor() {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        // czy zawsze trzeba inicjalizowac przed petlą? bo while nie widzi tej zmiennej
        do {
            System.out.println("Podaj pozycję >> ");
            choice = scan.nextInt();
            if ((choice < 1) || (choice > 4)) {
                System.out.println("Błędny wybór.");
            }
        } while ((choice < 1) || (choice > 4));
        return choice;
    }
    public static void uruchomOpcje(int choice) {
        System.out.println("Wybrano " + menu[choice - 1]);
        switch (choice) {
            //żaróweczka proponuje mi inny zapis switch
            case 1:
                Loteria.main(new String[]{});
                //albo po prostu wywołanie loteria() - metoda się zaciągnie bo jest w tym samym pakiecie
                //konieczność załadowania fikcyjnych pustych parametrów aby main odpalić
                break;
            case 2:
                sda2.PetlaFor7Quiz.main(new String[] {});
                //albo - import klasy sda2.Petla7Quiz; - wywołanie metody quiz(); bo jest w innym pakiecie
                break;
            case 3:
                sda1.SklepAGD.main(new String[] {});
                //kiedy wywołujemy bezpośrednio metodę innej klasy a kiedy tworzymy instancję i przez nią wywołujemy metodę?
                break;
            case 4:
                exit = true;
                break;
        }
    }
}
