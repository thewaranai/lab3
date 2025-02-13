import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n = 20;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент  " + (i + 1));
            Scanner in = new Scanner(System.in);
            array[i] = in.nextInt();
        }
        int newSize = moveZero(array);
        System.out.println("Упорядоченный массив:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(array[i] + " ");
        }
        int[] result = delZero(array); //вызов метода
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