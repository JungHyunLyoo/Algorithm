package sort.quicksort;

import java.util.Scanner;

public class QuickSort {
    static void swap(int[] a,int idx1,int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }

    static void quickSort(int[] a,int left,int right){
        int pl = left;
        int pr = right;
        int pivot = a[(pl+pr)/2];

        do {
            while(a[pl] < pivot) pl++;
            while(a[pr] > pivot) pr--;
            if(pr <= pl){
                swap(a,pl++,pr--);
            }
        }while(pl <= pr);

        if(left < pr) quickSort(a,left,pr);
        if(right > pl) quickSort(a,pl,right);
    }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("quick sort");
        System.out.println("size : ");
        int size = scanner.nextInt();
        int[] x = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("x[" + i + "]:");
            x[i] = scanner.nextInt();
        }

        quickSort(x,0,size-1);

        System.out.println("sorting is completed");

        for (int i = 0; i < size; i++) {
            System.out.println(x[i]);
        }
    }
}
