package hw3.hw;

public class MainHW {
    public static void main(String[] args) {
        System.out.println(evenOddNumber(1));
    }
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).

    public static boolean evenOddNumber(int digit) {
        return digit % 2 == 0;
    }


    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    public static boolean numberInInterval(int digit,int upLimit,int downLimit) {
        return digit>=25 && digit<=100;
    }
    public static boolean numberInInterval(int digit) {
        int upLimit=25,downLimit =100;
        return digit>=25 && digit<=100;
    }
}
