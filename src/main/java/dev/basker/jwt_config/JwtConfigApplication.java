package dev.basker.jwt_config;

import dev.basker.jwt_config.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class JwtConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtConfigApplication.class, args);
	}

}
