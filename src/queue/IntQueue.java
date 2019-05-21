package queue;

import stack.IntStack;

public class IntQueue {
    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;

    public class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException() {
        }
    }

    public class OverFlowIntQueueException extends RuntimeException{
        public OverFlowIntQueueException() {
        }
    }

    public IntQueue(int capacity) {
        num = front = rear = 0;
        max = capacity;
        try {
            que = new int[max];
        }catch (OutOfMemoryError outOfMemoryError){
            max = 0;
        }
    }

    public int enque(int x) throws OverFlowIntQueueException{
        if (num >= max){
            throw new OverFlowIntQueueException();
        }
        que[rear++] = x;
        num++;
        if(num == max){
            rear = 0;
        }
        return x;
    }

    public int deque() throws EmptyIntQueueException{
        if(num <= 0){
            throw new EmptyIntQueueException();
        }
        int x = que[front];
        que[front++] = 0;
        num--;
        if(front == max){
            front = 0;
        }
        return x;
    }

    public int peek() throws EmptyIntQueueException{
        if(num <= 0){
            throw new EmptyIntQueueException();
        }
        return que[front];
    }

    public int indexOf(int x){
        for (int i = 0; i < num; i++) {
            int idx = (i+front) % max;
            if(que[idx] == x){
                return idx;
            }
        }
        return -1;
    }

    public void clear(){
        num = front = rear = 0;
        for (int i = 0; i < max; i++) {
            que[i] = 0;
        }
    }

    public int capacity(){
        return max;
    }

    public int size(){
        return num;
    }

    public boolean isEmpty(){
        return num <= 0;
    }

    public boolean isFull(){
        return num >= max;
    }

    public void dump(){
        if(num <= 0){
            System.out.println("que is empty");
        }
        else{
            for (int i = 0; i < num; i++) {
                System.out.println(que[(i+front)%max]);
            }
        }
    }
}
