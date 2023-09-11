import static org.assertj.core.api.Assertions.assertThat;

public class AssertExamples {
    public static void main(String[] args) {
        String text = "Hello, World";

        // Проверка на равенство строки
        assertThat(text).isEqualTo("Hello, World");

        // Проверка на наличие подстроки
        assertThat(text).contains("Hello");

        // Проверка на длину строки
        assertThat(text).hasSize(11);

        // Проверка на null
        assertThat(text).isNotNull();
    }
}

/*
import static org.assertj.core.api.Assertions.assertThat;

public class StringAssertionsExample {
    public static void main(String[] args) {
        String text = "Hello, World";

        // Проверка на равенство строки
        assertThat(text).isEqualTo("Hello, World");

        // Проверка на наличие подстроки
        assertThat(text).contains("Hello");

        // Проверка на длину строки
        assertThat(text).hasSize(12);

        // Проверка на null
        assertThat(text).isNotNull();
    }
}

22:09
        import static org.assertj.core.api.Assertions.assertThat;

        import java.util.ArrayList;
        import java.util.List;

public class CollectionAssertionsExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Проверка на наличие элемента
        assertThat(numbers).contains(2);

        // Проверка на отсутствие элемента
        assertThat(numbers).doesNotContain(4);

        // Проверка размера коллекции
        assertThat(numbers).hasSize(3);

        // Проверка на пустоту коллекции
        assertThat(numbers).isNotEmpty();
    }
}

22:14
        import static org.assertj.core.api.Assertions.assertThat;

public class ObjectAssertionsExample {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Проверка на равенство объектов с учетом полей
        assertThat(person1).isEqualToComparingFieldByField(person2);

        // Проверка на равенство объектов с учетом выбранных полей
        assertThat(person1).isEqualToComparingOnlyGivenFields(person2, "name");
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ExceptionAssertionsExample {
    public static void main(String[] args) {
        // Проверка на выбрасывание исключения
        assertThatThrownBy(() -> divide(10, 0)).isInstanceOf(ArithmeticException.class);
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}*/
