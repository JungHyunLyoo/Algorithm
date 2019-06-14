package backjoon;

import java.util.Scanner;

public class Question1463 {
    public static final int MAX_NUM = 1000010;
    public static int[] arr = new int[MAX_NUM];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            arr[i] = findCnt(i+1);
        }
        System.out.println(arr[num-1]);
    }

    public static int findCnt(int num){
        if(num == 1){
            return 0;
        }
        else{
            int[] temp = new int[3];
            temp[0] = 1+arr[num-2];
            temp[1] = (num%2 == 0)?1+arr[num/2-1]:0;
            temp[2] = (num%3 == 0)?1+arr[num/3-1]:0;

            int small=temp[0];
            for (int i = 0; i < 3; i++)
                if(temp[i] != 0 && small > temp[i])
                    small = temp[i];
            return small;
        }
    }
}
