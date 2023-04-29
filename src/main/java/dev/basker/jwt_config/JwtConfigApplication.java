package dev.basker.jwt_config;

import dev.basker.jwt_config.config.RsaKeyProperties;
import dev.basker.jwt_config.model.User;
import dev.basker.jwt_config.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class JwtConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtConfigApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepository userRepo, PasswordEncoder encoder) {
		return args -> {
			userRepo.save(new User("user", encoder.encode("password"), "ROLE_USER"));
			userRepo.save(new User("admin", encoder.encode("password"), "ROLE_USER,ROLE_ADMIN"));

		};
	}
}
