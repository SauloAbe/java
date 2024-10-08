package br.com.criandoapi.projeto.controllers;

import br.com.criandoapi.projeto.DAO.IUsuario;
import br.com.criandoapi.projeto.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("usuarios")
public class UsuarioController {
    @Autowired
    private IUsuario dao;

    @GetMapping
    public List<Usuario> listaUsuarios () {
        return (List<Usuario>) dao.findAll();
    }

    @PostMapping
    public Usuario criarUsuario (@RequestBody Usuario usuario) {
        Usuario usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }

    @PutMapping
    public Usuario editarUsuario (@RequestBody Usuario usuario) {
        Usuario usuarioNovo = dao.save(usuario);
        return usuarioNovo;
    }

    @DeleteMapping("/{id}")
    public Optional<Usuario> excluirUsuario (@PathVariable Integer id) {
        Optional <Usuario> usuario = dao.findById(id);
        dao.deleteById(id);
        return usuario;
    }
}
