package edu.comillas.icai.gitt.pat.spring.mvc;

import edu.comillas.icai.gitt.pat.spring.mvc.destino.DestinoRepository;
import edu.comillas.icai.gitt.pat.spring.mvc.destino.Destino;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class MvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcApplication.class, args);
	}


	@Configuration
	public class DataInitializer {

		@Bean
		CommandLineRunner initDatabase(DestinoRepository repository) {
			return args -> {
				repository.save(new Destino("Islas Galápagos", "Ecuador", "Media", 25));
				repository.save(new Destino("Gran Barrera de Coral", "Australia", "Alta", 30));
				repository.save(new Destino("Cenote Dos Ojos", "México", "Baja", 20));
				repository.save(new Destino("Mar Rojo", "Egipto", "Alta", 40));
				repository.save(new Destino("Isla de Komodo", "Indonesia", "Media", 35));
			};
		}
	}



}
