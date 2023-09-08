package task;

public class Task3 {
    public static void main(String[] args) {
        String msg="too large number";
       assert sum(2_147_483_647, 2)>Integer.MAX_VALUE : msg;
        System.out.println(sum(2_147_483_647, 2));
    }
    /**Задание:** Нужно исправить метод сложения двух чисел так,
     *  чтобы при переполнении переменной (Запустить пример
     *  System.out.println(sum(2_147_483_647, 2)) )
     *  выбрасывалось предупреждение java*/

    public static int sum(int a, int b) {
        //assert (a+b>Integer.MAX_VALUE);
        return a+b;
    }
}
