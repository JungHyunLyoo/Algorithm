package sort.quicksort;

import java.util.Scanner;
public class Partition {
    static void swap(int[] a,int idx1,int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;
    }
    static void partition(int[] a,int size){
        int pl = 0;
        int pr = size - 1;
        int pivot = a[size / 2];

        do{
            while(a[pl] < pivot) pl++;
            while(a[pr] > pivot) pr--;
            if(pl <= pr){
                swap(a,pl++,pr--);
            }
        }while(pl <= pr);

        System.out.println("pivot : "+pivot);
        System.out.println("pivot's left side values : ");
        for (int i = 0; i < pl; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        if(pr < pl - 1){
            System.out.println("values equal with pivot");
            for (int i = pr + 1; i < pl ; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
        System.out.println("pivot's right side values : ");
        for (int i = pr + 1; i < size; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("separate array");
        System.out.println("size :");
        int size = scanner.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("x["+i+"]:");
            a[i] = scanner.nextInt();
        }
        partition(a,size);
    }
}