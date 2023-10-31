/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.paciente.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;

/**
 *
 * @author andre
 */
@Entity
@Data
@Table(name = "paciente")
@EqualsAndHashCode(callSuper = false)
public class Paciente implements Serializable {
    @Id
    @javax.persistence.Id
    private String nome;
    private String matricula;
}
