package hw1.task;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Task4 {
    public static void main(String[] args) {
        happyNY();
    }

    //Задание: Найдите и исправьте логическую ошибку в коде, который планирует поздравление с Новым Годом в полночь.

    public static void happyNY() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String currentDateTime = dateFormat.format(calendar.getTime());

        assert currentDateTime.equals("01/01/2022") : "Еще 2022 год :())";
        System.out.println("С новым годом");
    }
}
