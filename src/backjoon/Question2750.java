package backjoon;

import java.util.Scanner;

public class Question2750 {
    static private void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void quickSort(int[] a,int left,int right){
        int pl = left;
        int pr = right;
        int pivot = a[(pl+pr)/2];
        do {
            while(a[pl] < pivot) pl++;
            while(a[pr] > pivot) pr--;
            if(pl <= pr){
                swap(a,pl++,pr--);
            }
        }while(pl <= pr);

        if(left < pr) quickSort(a,left,pr);
        if(right > pl) quickSort(a,pl,right);
    }

    static private void printArr(int[] arr){
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        quickSort(arr,0,size-1);
        printArr(arr);
    }
}
