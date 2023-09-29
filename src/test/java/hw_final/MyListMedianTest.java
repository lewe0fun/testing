package hw_final;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Тестирование класса MyListMedian
 */

class MyListMedianTest {
    private MyListMedian m1;
    private MyListMedian m2;
    private MyListMedian m3;

    @BeforeEach
    void setUp() {
        m1 = new MyListMedian(Arrays.asList(10, 20, 30, 41, 5));
        m2 = new MyListMedian(Arrays.asList(1, 3, 6, 8, 9));
        m3 = new MyListMedian(Arrays.asList(10, 20, 30, 41, 5));
    }

    /**
     * Проверка переопределенного метода compareTo()
     */

    @Test
    void compareTo() {
        assertAll(
                () -> AssertionsForClassTypes.assertThat(m1.compareTo(m2)).isEqualTo(1),
                () -> AssertionsForClassTypes.assertThat(m2.compareTo(m1)).isEqualTo(-1),
                () -> AssertionsForClassTypes.assertThat(m1.compareTo(m3)).isEqualTo(0)
        );
    }

    /**
     * Проверка корректности вывода в консоль
     */

    @Test
    void compareToPrint() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        m1.compareToPrint(m2);
        String expected = "20.0 > 6.0\nПервый список имеет большее среднее значение\n";
        String actResult = output.toString();
        //Без этого сравнение падало, хотя вывод идентичный
        expected = expected.replaceAll("\n", "").replaceAll("\r", "");
        actResult = actResult.replaceAll("\n", "").replaceAll("\r", "");

        assertThat(actResult).isEqualTo(expected);
        System.setOut(System.out);
    }

    /**
     * Проверка переопределенного метода toString()
     */

    @Test
    void testToString() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        System.out.print(m1);
        String expected = "20.0";
        String actResult = output.toString();
        assertThat(actResult).isEqualTo(expected);
        System.setOut(System.out);
    }

}