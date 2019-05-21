package queue;

import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntQueue intQueue = new IntQueue(64);

        while (true){
            System.out.println("data : " + intQueue.size() + "/" + intQueue.capacity());
            System.out.println("1 : inque , 2 : deque , 3 : peek , 4 : dump , 0 : quit");

            int menu = scanner.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu){
                case 1:
                    System.out.println("data : ");
                    x = scanner.nextInt();
                    try {
                        intQueue.enque(x);
                    }catch (IntQueue.OverFlowIntQueueException e){
                        System.out.println("stack is full");
                    }
                    break;
                case 2:
                    try {
                        x = intQueue.deque();
                        System.out.println("poped data is " + x);
                    }catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("stack is empty");
                    }
                    break;
                case 3:
                    try {
                        x = intQueue.peek();
                        System.out.println("peeked data is " + x);
                    }catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("stack is empty");
                    }
                    break;
                case 4:
                    intQueue.dump();
                    break;
            }
        }
    }
}
