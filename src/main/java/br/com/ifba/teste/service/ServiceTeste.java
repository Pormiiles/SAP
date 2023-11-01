/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.teste.service;

import br.com.ifba.prontuario.model.Prontuario;
import br.com.ifba.teste.dao.IDaoTeste;
import br.com.ifba.teste.model.Teste;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author lara
 */
@Service
public class ServiceTeste implements IServiceTeste{
    @Autowired
    private IDaoTeste dao;
    
    @Override
    public void saveTeste(Teste teste) {
       dao.save(teste);
    }
    
    @Override
    public List<Teste> findAll() {
        return this.dao.findAll();    
    }
}
