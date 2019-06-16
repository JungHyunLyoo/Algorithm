package backjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Question1978 {

    public static final int MAX = 1001;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean[] primeNumberArr = new boolean[MAX];
        Arrays.fill(primeNumberArr,true);
        primeNumberArr[0] = false;
        primeNumberArr[1] = false;
        for (int i = 2; i < primeNumberArr.length; i++) {
            if(primeNumberArr[i]){
                for (int j = i*2; j < primeNumberArr.length; j+=i) {
                    primeNumberArr[j] = false;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < arr.length; i++){
            if(primeNumberArr[arr[i]]){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}