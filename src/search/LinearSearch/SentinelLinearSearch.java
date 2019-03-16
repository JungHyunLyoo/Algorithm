package search.LinearSearch;

import java.util.Scanner;

public class SentinelLinearSearch {
	static private Scanner stdIn=new Scanner(System.in);
	
	static int sentinelLinearSearch(int[] x,int size,int key) {
		x[size]=key;
		
		System.out.println("select a number that means way to search");
		System.out.println("1.for");
		System.out.println("2.while");
		int way=stdIn.nextInt();
		
		if(way==1) {
			int i;
			for(i=0;x[i]!=key;i++);
			return i==size?-1:i;
		}
		else if(way==2) {
			int i=0;
			while(true) {
				if(x[i]==key) 
					break;
				i++;
			}
			return i==size?-1:i;
		}
		else {
			return -2;
		}
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
