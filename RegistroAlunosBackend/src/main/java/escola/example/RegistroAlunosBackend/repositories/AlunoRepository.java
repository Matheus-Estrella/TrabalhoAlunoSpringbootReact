package escola.example.RegistroAlunosBackend.repositories;

import escola.example.RegistroAlunosBackend.models.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AlunoRepository extends MongoRepository<Aluno, String> {
}
