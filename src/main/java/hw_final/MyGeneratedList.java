package hw_final;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyGeneratedList {
    private List<Integer> list;
    private Random random;

    public MyGeneratedList(int size) {
        this.random = new Random();
        this.list = listGen(size);
    }

    public List<Integer> getList() {
        return list;
    }

    public List<Integer> listGen(int size) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(random.nextInt(10));
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer i: this.list)
            stringBuilder.append(i).append("|");
        return stringBuilder.toString();
    }
}
