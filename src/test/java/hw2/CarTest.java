package hw2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Тестовый класс для класса Car
 */
class CarTest {
    private Car car;
    @BeforeEach
    void setUp() {
        car =new Car("DeLorean","DMC-12",1981);
    }

    /**
     * Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).
     */
    @Test
    void testIsInstanceOfVehicle() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    /**
     * - Проверить, что объект Car создается с 4-мя колесами.
     */
    @Test
    void testNumWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    /**
     * Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    void testSpeed() {
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    /**
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).
     */
    @Test
    void testParking() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }


}