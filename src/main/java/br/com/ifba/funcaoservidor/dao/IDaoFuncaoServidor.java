/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.funcaoservidor.dao;

import br.com.ifba.funcaoservidor.model.FuncaoServidor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author msmmendes
 */
public interface IDaoFuncaoServidor extends JpaRepository<FuncaoServidor, Long>{
    
    public List<FuncaoServidor> findByNome(String nome);
    public boolean existsByNome(String nome);
}
