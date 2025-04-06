package escola.example.RegistroAlunosBackend.services;


import escola.example.RegistroAlunosBackend.models.Aluno;
import escola.example.RegistroAlunosBackend.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository _alunoRepository;

    public Aluno save(Aluno aluno)
    {
        _alunoRepository.save(aluno);
        return aluno;
    }

    public List<Aluno> findAll(){

        return _alunoRepository.findAll();
    }

    public Optional<Aluno> findById(String id){
        return _alunoRepository.findById(id);
    }

    public void deleteById(String id){
        _alunoRepository.deleteById(id);
    }
}
