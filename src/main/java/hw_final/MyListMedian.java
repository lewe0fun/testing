package hw_final;

import java.util.Collections;
import java.util.List;


public class MyListMedian implements Comparable<MyListMedian> {
    private final double median;

    public MyListMedian(List<Integer> values) {
        Collections.sort(values);
        if (values.size() % 2 == 0)
            this.median = ((double) values.get(values.size() / 2) + (double) values.get(values.size() / 2 - 1)) / 2;
        else
            this.median = (double) values.get(values.size() / 2);

    }

    @Override
    public int compareTo(MyListMedian o) {
        return Double.compare(this.median, o.median);
    }

    public void compareToPrint(MyListMedian o) {
        String result = this+"";
        switch (this.compareTo(o)) {
            case 1 ->
                    result +=" > "+o+'\n'+"Первый список имеет большее среднее значение";
            case -1 ->
                    result +=" < "+o+'\n'+"Второй список имеет большее среднее значение";
            case 0 -> result +=" = "+o+'\n'+"Средние значения равны";
        }
        System.out.println(result);
    }

    @Override
    public String toString() {
        return ""+median;
    }
}
