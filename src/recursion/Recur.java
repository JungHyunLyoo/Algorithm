package recursion;

import java.util.Scanner;

public class Recur { //genuinely recursive class
    //하향식 분석 vs 상향식 분석
    static void recur(int n){
        if(n > 0){
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input number");
        int x = scanner.nextInt();

        recur(x);
    }
}
