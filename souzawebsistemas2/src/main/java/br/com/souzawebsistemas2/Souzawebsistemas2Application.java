package br.com.souzawebsistemas2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EntityScan(basePackages = "br.com.souzawebsistemas.model")
@ComponentScan(basePackages = { "br.com.souzawebsistemas.*" })
@EnableJpaRepositories(basePackages = { "br.com.souzawebsistemas.repositories" })
public class Souzawebsistemas2Application {

	public static void main(String[] args) {
		SpringApplication.run(Souzawebsistemas2Application.class, args);
	}

}
