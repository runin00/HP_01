package sda1;

public class PetlaWhile_3 {
    public static void main(String[] args) {
        int start = 0;
        while (start != 10) {
            System.out.println(start +1);
            ++start;
        }
        int next = 99;
        while (next != 65) {
            System.out.println(next);
            --next;
        }
        int count = 20;
        while (count != 42) {
            System.out.println(count);
            count += 2;
        }
        int count2 = 0;
        while (count2 != 41) {
            if ((count2 >= 20) && ((count2 % 2) == 0)) {
                 System.out.println(count2);
            }
            ++count2;
        }
        int i = 5;
        while (i != 0) {
            System.out.println("Kuba");
            --i;
        }
    }
}
