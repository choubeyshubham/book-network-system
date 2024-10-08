package in.choubeyshubham.book_network_system_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJpaAuditing
public class BookNetworkSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookNetworkSystemApplication.class, args);
    }

}
