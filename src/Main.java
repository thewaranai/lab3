import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент  " + (i + 1));
            Scanner in = new Scanner(System.in);
            array[i] = in.nextInt();
        }
        int newSize = selectionSort(array);
        newSize = moveZero(array);
        System.out.println("Упорядоченный массив:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(array[i] + " ");
        }
        int[] result = delZero(array);
        System.out.println("\nМассив без нулей:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int moveZero ( int[] array){
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index] = array[i];
                index++;
            }
        }
        while (index < array.length) {
            array[index] = 0;
            index++;
        }
        return index;
    }
    public static int selectionSort ( int[] array) {
        int size = array.length;
        int min, temp;
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
        return size;
    }
    public static int[] delZero (int[] array){
        int count = 0;
        for (int num : array) {
            if (num != 0) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for (int num : array) {
            if (num != 0) {
                newArray[index] = num;
                index++;
            }
        }
        return newArray;
    }
}