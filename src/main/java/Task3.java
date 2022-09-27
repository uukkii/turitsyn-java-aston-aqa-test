import java.util.Arrays;
import java.util.Random;

public class Task3 {
    private static final Random randomInt = new Random();
    private static final int ARRAY_LENGTH = 99;
    private static final int RANDOM_RANGE = 100;
    private static final int DIVIDE_NUMBER = 3;


    public static void main(String[] args) {

        int[] newArray = initializeArray();

        System.out.println("Сгенерированный массив: ");
        showArray(newArray);
        System.out.println("Числа из массива, кратные " + DIVIDE_NUMBER + ":");
        doCheck(newArray);

    }

    private static int[] initializeArray() {
        int[] array = new int[ARRAY_LENGTH];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomInt.nextInt(RANDOM_RANGE) + 1;
        }
        return array;
    }

    private static void doCheck(int[] array) {
        for (int i : array) {
            if (i % DIVIDE_NUMBER == 0) {
                System.out.print(i + ", ");
            }
        }
    }

    private static void showArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
