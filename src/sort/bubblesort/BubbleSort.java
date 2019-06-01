package sort.bubblesort;

import java.util.Scanner;

public class BubbleSort {
    static void swap(int[] arr,int idx1,int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    static void bubbleSort(int[] arr,int n) {
        int k = 0;
        for (int i = 0; i < n - 1; i++) {
            int changeCnt = 0;
            for (int j = n - 1; j > k; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    k = j;
                }
            }
            i = k;
        }
    }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("bubble sort");
        System.out.println("size : ");
        int size = scanner.nextInt();
        int[] x = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = scanner.nextInt();
        }

        bubbleSort(x,size);

        System.out.println("sorting is completed");

        for (int i = 0; i < size; i++) {
            System.out.println(x[i]);
        }
    }
}
