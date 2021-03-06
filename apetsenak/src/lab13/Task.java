package lab13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Создать массив, заполнить его случайными элементами,
 * распечатать, перевернуть, и снова распечатать
 * (при переворачивании нежела-тельно создавать еще один массив).
 */
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите размерность массива : ");
        int[] array = new int[sc.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
        sc.close();
    }
}
