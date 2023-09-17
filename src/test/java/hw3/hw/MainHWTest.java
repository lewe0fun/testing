package hw3.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class MainHWTest {


    /**
     * Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число четным или нечетным. (код приложен в презентации)
     */
    @Test
    void evenOddNumber() {
        assertAll(
                () -> assertThat(MainHW.evenOddNumber(10)).isEqualTo(true),
                () -> assertThat(MainHW.evenOddNumber(1)).isEqualTo(false)
        );
    }
    /**
     * Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное число в интервал (25;100). (код приложен в презентации)
     */
    @Test
    void numberInInterval() {
        assertAll(
                () -> assertThat(MainHW.numberInInterval(50)).isEqualTo(true),
                () -> assertThat(MainHW.numberInInterval(1)).isEqualTo(false)
        );
    }
}