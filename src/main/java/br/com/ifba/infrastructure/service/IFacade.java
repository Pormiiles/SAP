/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.infrastructure.service;


import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.paciente.model.Paciente;
import br.com.ifba.prontuario.model.Prontuario;
import br.com.ifba.teste.model.Teste;
import java.util.List;


/**
 *
 * @author clebinho
 */
public interface IFacade {
    //=====================TESTE=====================
    public abstract void saveTeste(Teste teste);
    public List<Teste> findAll();
    
    //=====================PACIENTES=====================
    public abstract void savePaciente(Paciente paciente);  
    
    //=====================PRONTUARIO=====================
    public void saveProntuario(Prontuario prontuario);
    public List<Prontuario> getAllProntuarios();
    public List<Prontuario> getAllProntuariosArquivados();
    public void desarquivarProntuario(Prontuario prontuario);
    public Prontuario findProntuarioById(Long id);
    public void arquivarProntuario(Prontuario prontuario);
    
    //=====================AGENDAMENTO=====================
    public void saveDataAgendamento(Agendamento agendamento);
    public List<Agendamento>getAllAgendamento();
    public void updateAgendamento(Agendamento agendamento);
    public abstract void deleteAgendamento(Agendamento agendamento);
    public Agendamento findAgendamentoById(Long id);
}
