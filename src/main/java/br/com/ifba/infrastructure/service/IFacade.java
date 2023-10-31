/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.infrastructure.service;


import br.com.ifba.prontuario.model.Prontuario;
import br.com.ifba.teste.model.Teste;

import java.util.List;

/**
 *
 * @author clebinho
 */
public interface IFacade {
    public abstract void saveTeste(Teste teste);
    public abstract void saveProntuario(Prontuario prontuario);   
}
