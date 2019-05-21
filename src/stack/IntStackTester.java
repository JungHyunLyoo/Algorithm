package stack;

import java.util.Scanner;

public class IntStackTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack intStack = new IntStack(64);
        while (true){
            System.out.println("size : " + intStack.size() + "/" + intStack.capacity());
            System.out.println("1 : push , 2 : pop , 3 : peek , 4 : dump , 0 : quit");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu){
                case 1:
                    System.out.println("data : ");
                    x = stdIn.nextInt();
                    try {
                        intStack.push(x);
                    }catch (IntStack.OverflowIntStackException e){
                        System.out.println("stack is full");
                    }
                    break;
                case 2:
                    try {
                        x = intStack.pop();
                        System.out.println("poped data is " + x);
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("stack is empty");
                    }
                    break;
                case 3:
                    try {
                        x = intStack.peek();
                        System.out.println("peeked data is " + x);
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("stack is empty");
                    }
                    break;
                case 4:
                    intStack.dump();
                    break;
            }
        }

    }
}
