package set;

public class IntSet {
    private int max;
    private int num;
    private int[] set;

    public IntSet(int capacity) {
        num = 0;
        max = capacity;
        try {
            set = new int[max];
        }catch (OutOfMemoryError outOfMemoryError){
            max = 0;
            set = new int[max];
        }
    }

    public int capacity(){
        return max;
    }

    public int size(){
        return num;
    }

    public int indexOf(int n){
        for (int i = 0; i < num; i++) {
            if(set[i] == n){
                return i;
            }
        }
        return -1;
    }

    public boolean contains(int n){
        return indexOf(n) != -1;
    }

    public boolean add(int n){
        if(num >= max || contains(n)){
            return false;
        }
        else{
            set[num++] = n;
            return true;
        }
    }

    public boolean remove(int n){
        int idx = indexOf(n);
        if(num <= 0 || idx == -1) {
            return false;
        }
        else{
            set[idx] = set[--num];
            return true;
        }
    }

    public boolean copyTo(IntSet intSet){
        if(intSet == null){
            return false;
        }
        else{
            int n = num < intSet.max ? num : intSet.max;
            for (int i = 0; i < n; i++) {
                intSet.set[i] = set[i];
            }
            intSet.num = n;
            return true;
        }
    }

    public boolean copyFrom(IntSet intSet){
        if(intSet == null){
            return false;
        }
        else{
            int n = max < intSet.num ? max : intSet.num;
            for (int i = 0; i < n; i++) {
                set[i] = intSet.set[i];
            }
            num = n;
            return true;
        }
    }
}