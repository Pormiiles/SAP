/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.pessoa.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author matheus
 */

@Entity
@Table(name = "pessoa")
@Data
@EqualsAndHashCode(callSuper = false)
public class Pessoa extends PersistenceEntity {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    
    // @Temporal(javax.persistence.TemporalType.DATE)
    // private Date dataNascimento;
    /* @OneToOne(fetch = FetchType.EAGER)
    private Usuario usuario; */
}
