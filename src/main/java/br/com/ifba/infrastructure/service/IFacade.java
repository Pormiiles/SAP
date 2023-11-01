/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.infrastructure.service;


import br.com.ifba.paciente.model.Paciente;
import br.com.ifba.prontuario.model.Prontuario;
import br.com.ifba.teste.model.Teste;
import java.util.List;


/**
 *
 * @author clebinho
 */
public interface IFacade {
    ///testes
    public abstract void saveTeste(Teste teste);
    public List<Teste> findAll();
    
    //pacientes
    public abstract void savePaciente(Paciente paciente);  
    
    //pronturios
    public void saveProntuario(Prontuario prontuario);
     public List<Prontuario> getAllProntuarios();
     public List<Prontuario> getAllProntuariosArquivados();
     public void DesarquivarProntuario(Prontuario prontuario);
    public Prontuario findProntuarioById(Long id);
    }
