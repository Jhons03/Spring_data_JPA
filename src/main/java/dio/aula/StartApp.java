package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        List<User> users = repository.findByNameContaining("Edson");
        for (User user : users) {
            System.out.println(user);
        }
    }

        private void insertUser() {
            User user = new User();
            user.setName("Mel");
            user.setUsername("sophie");
            user.setPassword("123456");

            repository.save(user);

            for (User u : repository.findAll()) {
                System.out.println(u);
            }
        }

}
