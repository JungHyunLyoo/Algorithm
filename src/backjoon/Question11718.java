package backjoon;

import java.util.Scanner;

public class Question11718 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strArr = new String[100];
        int i = 0;
        while(scanner.hasNextLine()){
            String temp = scanner.nextLine();
            if(temp == null || temp.isEmpty()){
                break;
            }
            strArr[i] = temp;
            i++;
        }
        scanner.close();
        for (int j = 0; j < i; j++) {
            System.out.println(strArr[j]);
        }
    }
}
