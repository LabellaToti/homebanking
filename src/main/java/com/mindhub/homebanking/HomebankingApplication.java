package com.mindhub.homebanking;

import com.mindhub.homebanking.models.Client;
import com.mindhub.homebanking.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HomebankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomebankingApplication.class, args);
	}

	@Bean
	public CommandLineRunner initDate(ClientRepository clientRepository){
		return (args -> {

			Client client1 = new Client("39-912-587","Melba", "Morel","melba@mindhub.com");
			Client client2 = new Client("20322860","Luciana", "Barano","lbarano@mindhub.com");

			clientRepository.save(client1);
			clientRepository.save(client2);
		});

	}

}
