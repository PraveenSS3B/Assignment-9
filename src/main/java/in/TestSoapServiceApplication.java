package in;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSoapServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(TestSoapServiceApplication.class, args);
	}
	
	// wsdl : http://localhost:8080/students/studentCRUD.wsdl
}
