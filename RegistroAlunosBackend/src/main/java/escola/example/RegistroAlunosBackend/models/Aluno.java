package escola.example.RegistroAlunosBackend.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "alunos")
@Getter @Setter
public class Aluno {
    @Id
    public String id;
    public String nome;
    public String telefone;
    public String email;
    public String endereco;
}
