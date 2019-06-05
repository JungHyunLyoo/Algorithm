package sort.heapsort;

import java.util.Scanner;

public class HeapSort {
    static void swap(int[] x,int idx1,int idx2){
        int temp = x[idx1];
        x[idx1] = x[idx2];
        x[idx2] = temp;
    }

    static void makeHeap(int[] x,int size){
        for (int i = 1; i < size; i++) {
            int c = i;
            do {
                int root = (c-1)/2;
                if(x[c] > x[root]){
                    swap(x,root,c);
                }
                c = root;
            }while(c != 0);
        }
    }

    static void heapSort(int[] x,int size){
        do {
            makeHeap(x,size);
            swap(x,0,size-1);
            size--;
        }while(size != 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("heap sort");
        System.out.println("size : ");
        int size = scanner.nextInt();
        int[] x = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = scanner.nextInt();
        }

        heapSort(x,size);

        System.out.println("sorted result : ");
        for (int i = 0; i < size; i++) {
            System.out.println(x[i]);
        }
    }
}
