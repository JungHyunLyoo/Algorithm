package search.LinearSearch;

import java.util.Scanner;

public class LinearSearchPrint {
	static Scanner stdIn=new Scanner(System.in);
	
	static int linearSearchPrint(int[] x,int size,int key) {
		System.out.print("   |");
		for(int i=0;i<size;i++) {
			System.out.printf("%4d",i);
		}
		System.out.println();
		System.out.printf("---+");
		int hyphenCnt=size*5;
		for(int i=0;i<hyphenCnt;i++) {
			System.out.print("-");
		}
		System.out.println();
		for(int i=0;i<size;i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n",(i*4)+3),"");
			System.out.printf("%3d|",i);
			for(int j=0;j<size;j++) {
				System.out.printf("%4d",x[j]);
			}
			System.out.println("");
			if(key==x[i]) {
				return i;
			}
		}
		return -1;
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
		
		System.out.println("== result ==");
		
		int result=linearSearchPrint(x, size, key);
		if(result == -1) {
			System.out.println("not found");
		}
		else {
			System.out.println("index:"+result);	
		}
	}
}
