package br.alves.spring02.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.alves.spring02.model.Usuario;
import br.alves.spring02.repository.UsuarioRepo;

@RestController //declarando que essa classe é um controlador rest
@CrossOrigin("*") //declarando que iremos aceitar requisições de qualquer origem
@RequestMapping("/user")
public class UsuarioController {

    @Autowired
    private UsuarioRepo repo;

    @GetMapping("/id/{id}") // {id} é o nome da variável
    public ResponseEntity<Usuario> obterUsuarioPorId(@PathVariable int id) { //essa anotação correlaciona a variável do getmapping com essa
        Usuario usuarioEncontrado = repo.findById(id).orElse(null);
        
        if(usuarioEncontrado != null) {
            return ResponseEntity.ok(usuarioEncontrado);
        }

        return ResponseEntity.notFound().build(); //notFound = 404

    }
    
    @GetMapping("/all")
    public ResponseEntity<List<Usuario>> listarUsuarios() { //encadeamento - lista de usuários
        List<Usuario> lista = (List<Usuario>) repo.findAll(); //casting para lista de usuários

        return ResponseEntity.ok(lista);

        }
    
    @PostMapping("/loginemail")
    public ResponseEntity<Usuario> loginByEmail(@RequestBody Usuario user) {
        Usuario userFound = repo.findByEmailAndSenha(user.getEmail(), user.getSenha());

        if(userFound != null) {
            userFound.setSenha("*******");
            return ResponseEntity.ok(userFound);
        }
        return ResponseEntity.status(404).build(); //notFound

    }

    
}
