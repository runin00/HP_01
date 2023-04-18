package sda4;

import java.util.Random;

public class instrukcjeSwitch4 {

    public static void main(String[] args) {

        System.out.println(multiInput(1, 2, 3, 4, 5));
    }

    public static int multiInput(int... args) {

        Random ran = new Random();
        int ranIndex = ran.nextInt(0, args.length);
        return args[ranIndex];
    }
}