package br.com.hr.userapi;

import br.com.hr.userapi.domain.User;
import br.com.hr.userapi.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
@RequiredArgsConstructor
@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

    private final UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(UserApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        userRepository.saveAll(List.of(
        new User(null, "Gabriella", "gabi@gmail.com", "1234", 20.0),
        new User(null, "Jonathan", "jojo@gmail.com", "4321", 20.0)
        ));
    }
}
