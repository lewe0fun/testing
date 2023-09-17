package hw3.tdd;

import hw3.hw.MainHW;
import org.assertj.core.api.AssertionsForClassTypes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
UserRepository userRepository=new UserRepository();
List<User> users =new ArrayList<>(Arrays.asList(new User("Tom","qwerty",false),
                                                new User("Admin","Admin",true),
                                                new User("Tim","132",false),
                                                new User("root","root",true)));

    /**
     * Проверка функции, которая разлогинивает всех пользователей, кроме администраторов.
     */
    @Test
    void logoutUsers() {
        assertAll(
                () -> assertThat(userRepository.logoutUsers(users)).isEqualTo(true),
                () -> assertThat(users.size()).isEqualTo(2)
        );
    }
}