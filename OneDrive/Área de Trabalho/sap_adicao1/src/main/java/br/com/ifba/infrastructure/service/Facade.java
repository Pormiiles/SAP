/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.service;


import br.com.ifba.perfilusuario.model.PerfilUsuario;
import br.com.ifba.perfilusuario.service.IServicePerfilUsuario;
import br.com.ifba.teste.model.Teste;
import br.com.ifba.teste.service.IServiceTeste;
import br.com.ifba.usuario.model.Usuario;
import br.com.ifba.usuario.service.IServiceUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author clebinho
 */
@Controller
public class Facade implements IFacade {
    @Autowired
    private IServiceTeste serviceTeste;
    
    @Override
    public void saveTeste(Teste teste){
        serviceTeste.saveTeste(teste);
    }    
    
    //=====================PerfilUsuario====================//
    @Autowired
    private IServicePerfilUsuario servicePerfilUsuario;

    @Override
    public PerfilUsuario savePerfilUsuario(PerfilUsuario perfilUsuario) {
        return servicePerfilUsuario.savePerfilUsuario(perfilUsuario);
    }

    @Override
    public PerfilUsuario updatePerfilUsuario(PerfilUsuario perfilUsuario) {
        return servicePerfilUsuario.updatePerfilUsuario(perfilUsuario);
    }

    @Override
    public void deletePerfilUsuario(PerfilUsuario perfilUsuario) {
        servicePerfilUsuario.deletePerfilUsuario(perfilUsuario);
    }

    @Override
    public List<PerfilUsuario> getAllPerfilUsuario() {
        return servicePerfilUsuario.getAllPerfilUsuario();
    }

    @Override
    public PerfilUsuario findByIdPerfilUsuario(String id) {
        return (PerfilUsuario) servicePerfilUsuario.findByNome(id);
    }

    @Override
    public List<PerfilUsuario> findByNomePerfilUsuario(String nome) {
        return servicePerfilUsuario.findByNome(nome);
    }
    
    //=====================Usuario====================//
    @Autowired
    private IServiceUsuario serviceUsuario;

    @Override
    public Usuario saveUsuario(Usuario usuario) {
        return serviceUsuario.saveUsuario(usuario);
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return serviceUsuario.updateUsuario(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
        serviceUsuario.deleteUsuario(usuario);
    }

    @Override
    public List<Usuario> getAllUsuario() {
        return serviceUsuario.getAllUsuario();
    }

    /*
    @Override
    public List<Usuario> findByNomeUsuario(String nome) {
        return serviceUsuario.findByNome(nome);
    }
     */
    @Override
    public List<Usuario> findByLoginUsuario(String login) {
        return serviceUsuario.findByLogin(login);
    }
    
}
