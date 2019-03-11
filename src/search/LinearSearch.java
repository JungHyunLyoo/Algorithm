package search;
import java.util.Scanner;

public class LinearSearch {
	static Scanner stdIn=new Scanner(System.in);
	static int linearSearch(int[] a,int size,int key) {
		System.out.println("select a number that means way to search");
		System.out.println("1.for");
		System.out.println("2.while");
		int way=stdIn.nextInt();
		
		if(way==1) {
			for(int i=0;i<size;i++) {
				if(a[i]==key) {
					return i;
				}
			}
			return -1;
		}
		else if(way==2) {
			int i=0;
			while(true) {
				if(i==size) {
					return -1;
				}
				if(a[i]==key) {
					return i;
				}
				i++;
			}
		}
		else {
			return -2;
		}
	}
	public static void main(String[] args) {
		System.out.println("array size:");
		int size=stdIn.nextInt();
		int[] x = new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("x["+i+"]:");
			x[i]=stdIn.nextInt();
		}
		
		System.out.println("value to search:");
		int key=stdIn.nextInt();
		
		int result=linearSearch(x,size,key);
		
		if(result==-1) {
			System.out.println("not found");
		}
		else if(result==-2) {
			System.out.println("not proper way");			
		}
		else {
			System.out.println("index:"+result);
		}
	}
}
