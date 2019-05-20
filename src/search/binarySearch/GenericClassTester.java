package search.binarySearch;

public class GenericClassTester {

    static class  GenericClass<T>{
        private T xyz;

        GenericClass(T xyz) {
            this.xyz = xyz;
        }

        T getXyz() {
            return xyz;
        }

        public static void main(String[] args) {
            GenericClass<String> s = new GenericClass<String>("ABC");
            GenericClass<Integer> n = new GenericClass<Integer>(15);

            System.out.println(s.getXyz());
            System.out.println(n.getXyz());
        }
    }
}
