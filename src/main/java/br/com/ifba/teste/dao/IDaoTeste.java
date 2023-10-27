/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.teste.dao;

import br.com.ifba.teste.model.Teste;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author lara
 */
public interface IDaoTeste extends JpaRepository<Teste, Long> {
    
}
