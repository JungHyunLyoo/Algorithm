package sort.mergesort;

import java.util.Scanner;

public class MergeSort {
    static int[] buff;
    static void mergeSort(int[] a,int left,int right){
        if(left < right){
            int i;
            int center = (left + right)/2;
            int p = 0;
            int j = 0;
            int k = left;
            mergeSort(a,left,center);
            mergeSort(a,left+1,right);
            for (i = left;i <= center;i++) {
                buff[p++] = a[i];
            }
            while(i <= right && j < p){
                a[k++] = buff[j] <= a[i] ? buff[j++] : a[i++];
            }
            while(j < p){
                a[k++] = buff[j++];
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("merge sort");
        System.out.println("size");
        int size = scanner.nextInt();
        int[] x = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = scanner.nextInt();
        }

        buff = new int[size];
        mergeSort(x,0,size-1);
        buff = null;

        System.out.println("result : ");
        for (int i = 0; i < size; i++) {
            System.out.println("x["+i+"] : "+x[i]);
        }
    }
}
