/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prontuario.service;

import br.com.ifba.prontuario.model.Prontuario;
import java.util.List;

/**
 *
 * @author Hiego
 */
public interface IServiceProntuario {
    public abstract void saveProntuario(Prontuario prontuario);
    
    // Metéodo que retorna todos os prontuarios da base de dados.
    public abstract List<Prontuario> getAllProntuarios();
}


