package sort;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("array size : ");
        int num = scanner.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = scanner.nextInt();
        }

        Arrays.sort(x);

        System.out.println("sorted by asc");
        for (int i = 0; i < num; i++) {
            System.out.println("x["+i+"] : " + x[i]);
        }
    }
}
