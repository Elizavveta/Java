package Task1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random random = new Random();
        for (int i=0;i<array.length;i++){
            array[i] = random.nextInt(1,50);
        }
        System.out.println(Arrays.toString(array));
    }
}
________________________________________________________________

        package Task2;

        import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10, 99);
        }
        for (int num : array) {
            System.out.println(num + " ");
        }
        System.out.println();
        boolean isSorted = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] >= array[i]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) System.out.println("не является строгой возрастающей последовательностью");
        else System.out.println("является строго возрастающей последовательностью");

    }
}