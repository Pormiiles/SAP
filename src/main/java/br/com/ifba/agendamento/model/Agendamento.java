/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.agendamento.model;

import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.paciente.model.Paciente;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import lombok.Data;

/**
 *
 * @author msmmendes
 */
@Entity
@Table(name="agendamento")
@Data
public class Agendamento extends PersistenceEntity implements Serializable{
    
    @OneToOne(mappedBy = "agendamento")
    Paciente paciente;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataAgendamento;
    
    @Temporal(javax.persistence.TemporalType.TIME)
    private Calendar horaAgendamento;
    
}