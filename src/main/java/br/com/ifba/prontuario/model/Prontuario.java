/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.prontuario.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Hiego
 */
@Entity
@Table(name = "prontuario")
@Data
@EqualsAndHashCode(callSuper = false)
public class Prontuario{
    @Id
    @javax.persistence.Id
    private String id;
    private Boolean aprovado;
    private String descricao;
}
