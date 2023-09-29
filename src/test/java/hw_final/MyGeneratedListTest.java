package hw_final;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

/**
 * Тестирование класса MyGeneratedList
 */

class MyGeneratedListTest {
    MyGeneratedList l1;

    @BeforeEach
    void setUp() {
        l1 = new MyGeneratedList(5);
    }

    @Test
    void getList() {

    }
    /**
     * Проверка метода генерации рандомного листа цифр
     */
    @Test
    void listGen() {
        List<Integer> list1 = l1.listGen(4);
        List<Integer> list2 = l1.listGen(4);
        assertAll(
                () -> AssertionsForClassTypes.assertThat(list1.size()).isEqualTo(4),
                () -> AssertionsForClassTypes.assertThat(list2.size()).isEqualTo(4),
                () -> AssertionsForClassTypes.assertThat(list1).isNotEqualTo(list2)
        );
    }

    /**
     * Проверка переопределенного метода toString()
     */

    @Test
    void testToString() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        System.out.print(l1);
        int expected = 10;
        String actResult = output.toString();
        assertThat(actResult.length()).isEqualTo(expected);
        System.setOut(System.out);
    }
}