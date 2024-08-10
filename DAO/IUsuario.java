package br.com.criandoapi.projeto.DAO;

import br.com.criandoapi.projeto.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface IUsuario extends JpaRepository<Usuario, Integer> {
}
