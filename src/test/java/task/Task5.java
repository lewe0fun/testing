package task;

import static java.lang.Integer.sum;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Task5 {
    public static void main(String[] args) {
        expectedValue();
    }
    public static void expectedValue() {
        assertThat(sum(2, 3)).isEqualTo(5);
    }
}
