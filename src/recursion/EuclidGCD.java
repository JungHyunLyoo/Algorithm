package recursion;

import java.util.Scanner;

public class EuclidGCD {
    static int gcd(int x,int y){
        if(y == 0)
            return x;
        else
            return gcd(y,x%y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input number x");
        int x = scanner.nextInt();
        System.out.println("input number y");
        int y = scanner.nextInt();

        System.out.println(gcd(x,y));
    }
}


