/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.prontuario.dao;

import br.com.ifba.prontuario.model.Prontuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Hiego
 */
public interface IDaoProntuario extends JpaRepository<Prontuario, String> {
    List<Prontuario> findAllByAtivoIsTrue();
    List<Prontuario> findAllByAtivoIsFalse();
    Prontuario findById(Long Id);
}
