package backjoon;

import java.util.Scanner;

public class Question1929 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = scanner.nextInt();
        int endNum = scanner.nextInt();
        boolean[] arr = new boolean[endNum];
        arr[0] = false;
        for (int i = 1; i < endNum; i++) {
            arr[i] = true;
        }

        for (int i = 1; i < endNum; i++) {
            if(arr[i]){
                int num = (i+1);
                for (int j = i+num; j < endNum; j+=num) {
                    arr[j] = false;
                }
            }
        }

        for (int i = 0; i < endNum; i++) {
            if(startNum-1 <= i && arr[i]){
                System.out.println(i+1);
            }
        }
    }
}
