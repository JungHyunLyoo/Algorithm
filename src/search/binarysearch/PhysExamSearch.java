package search.binarysearch;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {
    static class PhyscData{
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }
        private static class HeightOrderComparator implements Comparator<PhyscData>{
            @Override
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 :
                        (d1.height < d2.height) ? -1 : 0;
            }
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("이나령", 162, 0.3),
                new PhyscData("유지훈", 168, 0.4),
                new PhyscData("김한결", 169, 0.8),
                new PhyscData("홍준기", 171, 1.5),
                new PhyscData("전서현", 173, 0.7),
                new PhyscData("이호연", 174, 1.2),
                new PhyscData("이수민", 175, 2.0),
        };

        System.out.println("Insert cm that you want to find");
        int height = stdIn.nextInt();
        int idx = Arrays.binarySearch(x,new PhyscData("",height,0.0),PhyscData.HEIGHT_ORDER);

        if(idx<0){
            System.out.println("no data");
        }
        else{
            System.out.println("x[" + idx + "]");
            System.out.println(x[idx]);
        }
    }
}