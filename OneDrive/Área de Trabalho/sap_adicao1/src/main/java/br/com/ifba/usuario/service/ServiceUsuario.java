/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ifba.infrastructure.exception.BusinessException;
import br.com.ifba.usuario.dao.IDaoUsuario;
import br.com.ifba.usuario.model.Usuario;

/**
 *
 * @author vitor
 */
@Service
public class ServiceUsuario implements IServiceUsuario {

    // OBJETO
    @Autowired
    private IDaoUsuario daoUsuario;

    // CONSTANTES

    // mensagem de erro se o Usuario for null;
    public final static String USUARIO_NULL = "Usuário null";

    // mensagem de erro se o Usuario já existir;
    public final static String USUARIO_EXISTE = "O Usuário já existe,";

    // mensagem de erro se o Usuario não existir no banco;
    public final static String USUARIO_NAO_EXISTE = "O Usuário não existe na base de dados";

    // mensagem de erro se o Usuario for inválido;
    public final static String USUARIO_INVALIDO = "Usuário inválido";
    
    // Mensagem de erro caso o login esteja vazio.
    private final static String LOGIN_VAZIO = "O Campo Login esta vazio";
    
    // Mensagem de erro caso o login seja null.
    private final static String LOGIN_NULL = "Dados do Login nao preenchidos";

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        if (usuario == null) {
            throw new BusinessException(USUARIO_NULL);
        }

        // O usuario já existe e está atualizando o usuário
        Long id = usuario.getId();
        if (id != null) {
            Usuario oldUser = this.findById(usuario.getId());
            System.out.println("O usuario está sendo atualizado " + usuario.getId());
            // Busca o usuário salvo no banco para atualizar a senha somente se mudar
        } else {
            // O usuario está sendo inserido
            System.out.println("O usuario está sendo inserido");
        }

        return daoUsuario.save(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        if (usuario == null) {
            throw new BusinessException(USUARIO_NULL);
        } else {
            this.daoUsuario.delete(usuario);
            return;
        }
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return (List<Usuario>) this.daoUsuario.findAll();
    }

    @Override
    public Usuario findById(Long id) {
        Optional<Usuario> user = daoUsuario.findById(id);
        return user.isPresent() ? user.get() : null;
    }

    @Override
    public Usuario findByLoginAndSenha(String login, String senha) {
        Optional<Usuario> user = daoUsuario.findByLoginAndSenha(login, senha);
        return user.isPresent() ? user.get() : null;
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        if(usuario == null){
            throw new BusinessException(USUARIO_NULL);
        } 
        if(daoUsuario.existsById(usuario.getId()) == false) {
            throw new BusinessException(USUARIO_NAO_EXISTE);
        }
        return daoUsuario.save(usuario);
    }

    @Override
    public List<Usuario> getAllUsuario() {
        return this.daoUsuario.findAll();    
    }

    @Override
    public List<Usuario> findByLogin(String login) {
        if(login == null) {
            throw new BusinessException(LOGIN_NULL);
        }
        if(login.isEmpty()) {
            throw new BusinessException(LOGIN_VAZIO);
        }
        return daoUsuario.findById(login);
    }

}
