package escola.example.RegistroAlunosBackend;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API Alunos", version = "1.0",
		description = "Trabalho de: Matheus Augusto Estrella (ra 04722056) "))

public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
