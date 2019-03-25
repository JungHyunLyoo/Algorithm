package search.binarySearch;

import java.util.Scanner;

public class BinarySearch {
	static Scanner stdIn=new Scanner(System.in);
	
	/*
	 * 
	 * 이진탐색
	 * 베스킨라빈스 31 게임과 비슷.
	 * 정렬이 되어있어야 중간의 값 기준으로 좌,우를 나눌 수 있겠지?
	 * 범위가 반씩 줄어드니깐 시간복잡도는 평균적으로 log(n) 이라고 할수있다.
	 * 
	 * */
	static int binarySearch(int[] x,int size,int key) {
		int leftPointer=0;
		int rightPointer=size-1;
		
		do {
			int centerPointer=(leftPointer+rightPointer)/2;
			if(x[centerPointer]==key) {
				return centerPointer;
			}
			else if(x[centerPointer]>key) {
				rightPointer=centerPointer-1;
			}
			else {
				leftPointer=centerPointer+1;				
			}
		}while(leftPointer<=rightPointer);
		
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println("array size:");
		int size=stdIn.nextInt();
		int[] x=new int[size+1];
		

		System.out.println("please insert number by asc:");
		System.out.println("x[0]:");
		x[0]=stdIn.nextInt();
		for(int i=1;i<size;i++) {
			do {
				System.out.println("x["+i+"]:");
				x[i]=stdIn.nextInt();
			}while(x[i]<x[i-1]);
		}
		

		System.out.println("value to search:");
		int key=stdIn.nextInt();
		
		int result=binarySearch(x,size,key);
		if(result==-1) {
			System.out.println("not found");
		}
		else {
			System.out.println("index:"+result);			
		}
	}
}
