package com.gfarm.microservices;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@EnableDiscoveryClient
@SpringBootApplication
public class ItemCatlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemCatlogApplication.class, args);
	}

}

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity      //represent table in relational db
class Item{
	public Item(String name) {					// passing string parameterize constructor
		this.name = name;
	}
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
}

@RepositoryRestResource
interface ItemRepository extends JpaRepository<Item, Long>{
	
}

@Component
class ItemInitializer implements CommandLineRunner{
	
	private final ItemRepository itemRepository;
	ItemInitializer(ItemRepository itemRepository){
		this.itemRepository =itemRepository;
	}
	@Override
	public void run(String... args) throws Exception {
		Stream.of("Lining","PUMA","Bad Boy", "Air Jordan","Nike","Adidas","Rebok")
		.forEach(item -> itemRepository.save(new Item(item)));
		
		itemRepository.findAll()
		.forEach(System.out::println);
		
	}
	
}