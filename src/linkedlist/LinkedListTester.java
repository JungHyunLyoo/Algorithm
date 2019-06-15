package linkedlist;


import java.util.Comparator;
import java.util.Scanner;

public class LinkedListTester {
    private static class Data{
        private static final int NO = 1;
        private static final int NAME = 2;

        private Integer no;
        private String name;

        @Override
        public String toString() {
            return "(" + no + " , " + name + ")";
        }

        void scanData(String guide,int sw){
            System.out.println("input date to " + guide);
            if((sw & NO) == NO){
                System.out.print("number : ");
                no = scanner.nextInt();
            }
            if((sw & NAME) == NAME){
                System.out.print("name : ");
                name = scanner.next();
            }
        }

        public static final Comparator<Data> NO_ORDER = new NoOrderComparator();
        private static class NoOrderComparator implements Comparator<Data>{
            @Override
            public int compare(Data o1, Data o2) {
                return (o1.no > o2.no) ? 1 : (o1.no < o2.no) ? -1 : 0;
            }
        }


        public static final Comparator<Data> NAME_ORDER = new NameOrderComparator();
        private static class NameOrderComparator implements Comparator<Data>{
            @Override
            public int compare(Data o1, Data o2) {
                return o1.name.compareTo(o2.name);
            }
        }
    }


    private static Scanner scanner = new Scanner(System.in);

    enum Menu{
        ADD_FIRST("insert node to head"),
        ADD_LAST("insert node to tail"),
        RMV_FIRST("delete head node"),
        RMV_LAST("delete tail node"),
        RMV_CRNT("delete selected node"),
        CLEAR("delete all nodes"),
        SEARCH_NO("search by number"),
        SEARCH_NAME("search by name"),
        NEXT("move to selected node"),
        PRINT_CRNT("print current node"),
        DUMP("print all nodes"),
        TERMINATE("terminate");

        private final String message;

        private static Menu MenuAt(int idx){
            for(Menu m : Menu.values()){
                if(m.ordinal() == idx){
                    return m;
                }
            }
            return null;
        }

        Menu(String string){
            message = string;
        }

        public String getMessage() {
            return message;
        }
    }

    static Menu SelectMenu(){
        int key;
        do{
            for (Menu m : Menu.values()){
                System.out.printf("(%d) %s ",m.ordinal(),m.getMessage());
                if( (m.ordinal() % 3) == 2 && m.ordinal() != Menu.TERMINATE.ordinal() )
                    System.out.println();
            }
            System.out.print(":");
            key = scanner.nextInt();
        }while (key < Menu.ADD_FIRST.ordinal() || key > Menu.TERMINATE.ordinal());
        return  Menu.MenuAt(key);
    }
    public static void main(String[] args) {
        Menu menu;
        Data data;
        Data ptr;
        Data temp = new Data();

        LinkedList<Data> list = new LinkedList<>();
        do{
            switch (menu = SelectMenu()) {
                case ADD_FIRST:
                    data = new Data();
                    data.scanData("insert to head", Data.NO | Data.NAME);
                    list.addFirst(data);
                    break;
                case ADD_LAST:
                    data = new Data();
                    data.scanData("insert to tail", Data.NO | Data.NAME);
                    list.addLast(data);
                    break;
                case RMV_FIRST:
                    list.removeFirst();
                    break;
                case RMV_LAST:
                    list.removeLast();
                    break;
                case RMV_CRNT:
                    list.removeCurrentNode();
                    break;
                case SEARCH_NO:
                    temp.scanData("search", Data.NO);
                    ptr = list.search(temp, Data.NO_ORDER);
                    if (ptr == null) {
                        System.out.println("no data");
                    } else {
                        System.out.println("search success : " + ptr);
                    }
                    break;
                case SEARCH_NAME:
                    temp.scanData("search",Data.NAME);
                    ptr = list.search(temp,Data.NAME_ORDER);
                    if (ptr == null) {
                        System.out.println("no data");
                    } else {
                        System.out.println("search success : " + ptr);
                    }
                case NEXT:
                    list.next();
                    break;
                case PRINT_CRNT:
                    list.printCurrentNode();
                    break;
                case DUMP:
                    list.dump();
                    break;
                case CLEAR:
                    list.clear();
                    break;
            }
        }while (menu != Menu.TERMINATE);
    }
}
