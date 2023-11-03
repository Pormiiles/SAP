/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.funcaoservidor.service;

import br.com.ifba.funcaoservidor.model.FuncaoServidor;
import java.util.List;

/**
 *
 * @author msmmendes
 */
public interface IServiceFuncaoServidor {
    // Salva servidor.
    public abstract FuncaoServidor saveServidor(FuncaoServidor funcaoServidor);
    // Atualiza servidor.
    public abstract FuncaoServidor updateServidor(FuncaoServidor funcaoServidor);
    // Deleta servidor.
    public abstract void deleteServidor(FuncaoServidor funcaoServidor);
     // Método que retorna todos os servidores da base de dados.
    public abstract List<FuncaoServidor> getAllservidor();
    // Método que retorna o servidor com o id informado.
    public FuncaoServidor findById(Long id);
    // Método que retorna a lista com os servidores com o nome informado.
    public List<FuncaoServidor> findByNome(String nome);
}
