package sort.shellsort;

import java.util.Scanner;

public class ShellSort {
    //supplemented version of insertionSort
    static void shellSort(int[] a,int n){
        for (int h = n / 2; h > 0; h/=2){
            for (int i = h; i < n; i++) {
                int j;
                int temp = a[i];
                for (j = i - h; j >= 0 && a[j] > temp; j-=h) {
                    a[j + h] = a[j];
                }
                a[j + h] = temp;
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Shell sort");
        System.out.println("size : ");
        int size = scanner.nextInt();
        int[] x = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = scanner.nextInt();
        }

        shellSort(x,size);

        System.out.println("sorting is completed");

        for (int i = 0; i < size; i++) {
            System.out.println(x[i]);
        }
    }
}
