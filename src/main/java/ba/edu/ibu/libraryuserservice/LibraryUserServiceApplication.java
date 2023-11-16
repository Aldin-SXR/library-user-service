package ba.edu.ibu.libraryuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LibraryUserServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(LibraryUserServiceApplication.class, args);
	}

}
