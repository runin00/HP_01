package utils;

import java.util.Random;

public class ArrayUtils {
    public static String getRandomText( String[] texts ) {
        Random ran = new Random();
        int index = ran.nextInt(5);
        return texts[index];
    }
}
