/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.pessoa.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.Data;

/**
 *
 * @author msmmendes
 */

@Entity
@Table(name = "pessoa")
@Data
public abstract class Pessoa extends PersistenceEntity implements Serializable {
    private String nome;
    private String telefone;
    private String email;
    private String cpf;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
//    @OneToOne(fetch = FetchType.EAGER)
//    private Usuario usuario;

}
