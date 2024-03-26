package me.dio.stw24;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import me.dio.stw24.application.ListChampionsUseCase;
import me.dio.stw24.domain.ports.ChampionsRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public ListChampionsUseCase providListChampionsUseCase(ChampionsRepository repository) {
		return new ListChampionsUseCase(repository);
	}
}
