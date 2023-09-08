package task;

public class Task1 {
/***
    Задание: Используйте ключевое слово assert для проверки
    вашего предположения в коде. Если утверждение не выполняется,
    программа сгенерирует AssertionError. Сможете ли вы исправить
    утверждение в этом коде, чтобы оно стало верным?
*/

public static void main(String[] args) {
    assertConditionA();
}
    public static void assertConditionA() {
        String[] weekends = {"Суббота", "Воскресенье"};
        assert weekends.length == 12 : "должно быть 2";
        System.out.println("В неделе " + weekends.length + " дня выходных");
    }
}
