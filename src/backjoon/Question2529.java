package backjoon;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Question2529 {
    private static int FIND_MAX = 0;
    private static int FIND_MIN = 1;
    private static void function123(String[] arr,int[] result,int size,int type){
        int currentNumber = (type==FIND_MAX)?9:0;
        String compareStr = (type==FIND_MAX)?">":"<";
        int i=0;
        while(i<arr.length){
            String str = arr[i];
            if(compareStr.equals(str)){
                result[i] = (type==FIND_MAX)?currentNumber--:currentNumber++;
                i++;
            }
            else{
                int j = i+1;
                while(arr.length > j && !compareStr.equals(arr[j]) ){
                    j++;
                }
                for (int l = j; l >= i ; l--) {
                    result[l] = (type==FIND_MAX)?currentNumber--:currentNumber++;
                }
                i=j+1;
            }
        }
        if(i == size){
            result[i] = currentNumber;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String[] arr = new String[k];
        for (int i = 0; i < k; i++) {
            arr[i] = scanner.next();
        }
        int[] result = new int[k+1];

        function123(arr,result,k,FIND_MAX);
        for (int j = 0; j < k+1; j++) {
            System.out.print(result[j]);
        }
        System.out.println();
        function123(arr,result,k,FIND_MIN);
        for (int j = 0; j < k+1; j++) {
            System.out.print(result[j]);
        }
    }
}

