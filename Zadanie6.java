package PGO_01;

public class Zadanie6 {
    public static void main(String[] args) {
        int [] arr = {500, 100, 400, 200, 300, 550, 350, 150, 450, 250};
        int[] sorted = sortArray(arr);
        printArray(sorted);
    }

    static int[] sortArray(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr [j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }

    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1)
                System.out.print(", ");
        }
        System.out.print("]");
        System.out.println();
    }
}
