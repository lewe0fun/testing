package hw_final;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        MyGeneratedList l1= new MyGeneratedList(5);
        MyGeneratedList l2= new MyGeneratedList(5);
        MyListMedian m1 = new MyListMedian(l1.getList());
        MyListMedian m2 = new MyListMedian(l2.getList());
        MyListMedian m3 = null;
        MyListMedian m5 = new MyListMedian(Arrays.asList(10,20,30,41,5));
        MyListMedian m6 = new MyListMedian(Arrays.asList(1,3,6,8,9));
        System.out.println(l1+"\n"+l2);
        m1.compareToPrint(m2);
        //m2.compareToPrint(m1);
        //m5.compareToPrint(m6);
        //System.out.println(m5);
    }
}
