package escola.example.RegistroAlunosBackend.controllers;

import escola.example.RegistroAlunosBackend.constants.Constant;
import escola.example.RegistroAlunosBackend.models.Aluno;
import escola.example.RegistroAlunosBackend.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController

@CrossOrigin(
        origins = "http://localhost:3000",
        methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE },
        allowedHeaders = "*"
)

@RequestMapping(Constant.API_URL)
public class AlunoController {
    @Autowired
    private AlunoService _alunoService;

    @PostMapping(Constant.API_ALUNO)
    public ResponseEntity<Aluno> insert(@RequestBody Aluno aluno){
        Aluno saved_aluno = _alunoService.save(aluno);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved_aluno);
    }

    @PutMapping(Constant.API_ALUNO)
    public ResponseEntity<Aluno> update(@RequestBody Aluno aluno){

        Aluno saved_aluno = _alunoService.save(aluno);
        return ResponseEntity.ok(saved_aluno);
    }

    @DeleteMapping(Constant.API_ALUNO + "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id){

        _alunoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping(Constant.API_ALUNO)
    public ResponseEntity<List<Aluno>> findAll(){
        return ResponseEntity.ok(_alunoService.findAll());
    }

    @GetMapping(Constant.API_ALUNO + "/{id}")
    public ResponseEntity<Optional<Aluno>> findById(@PathVariable("id") String id){

        return ResponseEntity.ok(_alunoService.findById(id));
    }

}
