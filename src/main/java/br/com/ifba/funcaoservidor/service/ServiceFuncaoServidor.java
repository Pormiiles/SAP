/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.funcaoservidor.service;

import br.com.ifba.funcaoservidor.dao.IDaoFuncaoServidor;
import br.com.ifba.funcaoservidor.model.FuncaoServidor;
import br.com.ifba.infrastructure.exception.BusinessException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author msmmendes
 */
public class ServiceFuncaoServidor implements IServiceFuncaoServidor{

    //================= CONSTANTES =============================================
    
    // Mensagem de erro se Servidor for null.
    public final static String FUNCAO_SERVIDOR_NULL = "Dados do(a) Servidor(a) nao preenchidos";
    // Mensagem de erro se o Servidor já existir.
    public final static String FUNCAO_SERVIDOR_EXISTE = "Servidor(a) ja existente no Banco de dados";
    // Mensagem de erro se o Servidor não existir no banco.
    public final static String FUNCAO_SERVIDOR_NAO_EXISTE = "Servidor(a) nao existente no Banco de dados";
    // Mensagem de erro se o FuncaoServidor for inválido.
    public final static String FUNCAO_SERVIDOR_INVALIDO = "As informaçoes do(a) Servidor(a) nao sao validas";
     // Mensagem de erro caso o nome esteja vazio.
    private final static String NOME_VAZIO = "O Campo Nome esta vazio";
    // Mensagem de erro caso o nome seja null.
    private final static String NOME_NULL = "Dados do nome nao preenchidos";
    
     //================= OBJETO =================================================
    
    @Autowired
    private IDaoFuncaoServidor daoFuncaoServidor;

     //================= MÉTODOS ================================================
    
    @Override
    public FuncaoServidor saveServidor(FuncaoServidor funcaoServidor) {
       if(funcaoServidor == null) {
            throw new BusinessException(FUNCAO_SERVIDOR_NULL);
        }
       if(daoFuncaoServidor.existsByNome(funcaoServidor.getNome()) == true) {
            throw new BusinessException(FUNCAO_SERVIDOR_EXISTE);
        }
       return daoFuncaoServidor.save(funcaoServidor);
    }

    @Override
    public FuncaoServidor updateServidor(FuncaoServidor funcaoServidor) {
        if(funcaoServidor == null) {
            throw new BusinessException(FUNCAO_SERVIDOR_NULL);
        } 
        if(daoFuncaoServidor.existsById(funcaoServidor.getId()) == false) {
            throw new BusinessException(FUNCAO_SERVIDOR_EXISTE);
        }
        return daoFuncaoServidor.save(funcaoServidor);
    }

    @Override
    public void deleteServidor(FuncaoServidor funcaoServidor) {
        if(funcaoServidor == null) {
            throw new BusinessException(FUNCAO_SERVIDOR_NULL);
        } 
        if(daoFuncaoServidor.existsById(funcaoServidor.getId()) == false) {
            throw new BusinessException(FUNCAO_SERVIDOR_NAO_EXISTE);
        }
        daoFuncaoServidor.delete(funcaoServidor);
    }

    @Override
    public List<FuncaoServidor> getAllservidor() {
        return this.daoFuncaoServidor.findAll();
    }
    
    @Override
    public List<FuncaoServidor> findByNome(String nome) {
        if(nome == null) {
            throw new BusinessException(NOME_NULL);
        } 
        if(nome.isEmpty()) {
            throw new BusinessException(NOME_VAZIO);
        }
        return daoFuncaoServidor.findByNome(nome); 
    }
    
     @Override
     public FuncaoServidor findById(Long id) {
          return daoFuncaoServidor.getReferenceById(id);
     }

     
}
