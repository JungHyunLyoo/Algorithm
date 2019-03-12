package search.LinearSearch;

import java.util.Scanner;

public class SentinelLinearSearch {
	static private Scanner stdIn=new Scanner(System.in);
	
	static int sentinelLinearSearch(int[] x,int size,int key) {
		x[size]=key;
		int i=0;
		while(true) {
			if(x[i]==key) 
				break;
			i++;
		}
		return i==size?-1:i;
	}
	
	public static void main(String[] args) {
		System.out.println("array size:");
		int size=stdIn.nextInt();
		int[] x=new int[size+1];

		for(int i=0;i<size;i++) {
			System.out.println("x["+i+"]:");
			x[i]=stdIn.nextInt();
		}

		System.out.println("value to search:");
		int key=stdIn.nextInt();
		
		int result=sentinelLinearSearch(x,size,key);
		if(result==-1) {
			System.out.println("not found");
		}
		else {
			System.out.println("index:"+result);			
		}
	}
}
