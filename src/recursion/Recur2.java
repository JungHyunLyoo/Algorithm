package recursion;

import stack.IntStack;

import java.util.Scanner;

public class Recur2 {
    static void recur(int n){
        IntStack intStack = new IntStack(n);

        while(true){
            if(n > 0){
                intStack.push(n);
                n = n - 1;
                continue;
            }
            if (!intStack.isEmpty()){
                n = intStack.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input number");
        int x = scanner.nextInt();

        recur(x);
    }
}
