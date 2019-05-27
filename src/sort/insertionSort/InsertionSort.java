package sort.insertionSort;

import java.util.Scanner;

public class InsertionSort {
    static void insertionSort(int[] a,int n){
        for (int i = 1; i < n; i++) {
            int j;
            int temp = a[i];
            for (j = i; j > 0 && a[j - 1] > temp; j--) {
                a[j] = a[j - 1];
            }
            a[j] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("insertion sort");
        System.out.println("size : ");
        int size = scanner.nextInt();
        int[] x = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = scanner.nextInt();
        }

        insertionSort(x,size);

        System.out.println("sorting is completed");

        for (int i = 0; i < size; i++) {
            System.out.println(x[i]);
        }
    }
}
