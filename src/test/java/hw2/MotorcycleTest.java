package hw2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для класса Motorcycle
 */
class MotorcycleTest {
    private Motorcycle motorcycle;

    @BeforeEach
    void setUp() {
        motorcycle = new Motorcycle("Harley-Davidson", "Nightster", 2023);
    }

    /**
     * Проверить, что объект Motorcycle создается с 2-мя колесами.
     */
    @Test
    void testNumWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    /**
     * Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    void getSpeed() {
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
     */
    @Test
    void testParking() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}