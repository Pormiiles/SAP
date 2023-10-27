package br.com.ifba.usuario.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ifba.usuario.model.Usuario;
import java.util.List;

public interface IDaoUsuario extends JpaRepository<Usuario, Long> {

    public List<Usuario> findById(String id);

    public abstract Optional<Usuario> findByLoginAndSenha(String login, String senha);
}
