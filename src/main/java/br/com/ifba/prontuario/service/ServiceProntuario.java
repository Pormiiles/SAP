/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prontuario.service;

import br.com.ifba.prontuario.dao.IDaoProntuario;
import br.com.ifba.prontuario.model.Prontuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Hiego
 */
@Service
public class ServiceProntuario implements IServiceProntuario{
    @Autowired
    private IDaoProntuario dao;
    
    // salva o prontuario no banco de dados
    @Override
    public void saveProntuario(Prontuario prontuario) {
       prontuario.setAtivo(true); //seta todo prontuario como ativo por default
       dao.save(prontuario);
    }
}
