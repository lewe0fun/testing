package hw1.task;

public class Task2 {
    public static void main(String[] args) {
        //Нужно исправить пример, так чтобы метод не выбрасывал ошибку java
        assertConditionB();

    }

    public static void assertConditionB() {
        int x = 1 ;
        assert x >= 0 : "должно быть больше нуля";
    }

}
