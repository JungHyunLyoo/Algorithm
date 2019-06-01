package search.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchApi {
	static Scanner stdIn=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("array size:");
		int size=stdIn.nextInt();
		int[] x=new int[size+1];

		System.out.println("please insert number by asc:");
		for(int i=0;i<size;i++) {
			System.out.println("x["+i+"]:");
			x[i]=stdIn.nextInt();
		}

		System.out.println("value to search:");
		int key=stdIn.nextInt();
		
		int result=Arrays.binarySearch(x, key);
		if(result==-1) {
			System.out.println("not found");
		}
		else {
			System.out.println("index:"+result);			
		}
	}
}
