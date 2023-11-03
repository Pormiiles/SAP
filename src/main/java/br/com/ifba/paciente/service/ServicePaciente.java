/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.paciente.service;

import br.com.ifba.paciente.dao.IDaoPaciente;
import br.com.ifba.paciente.model.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author andre
 */
@Service
public class ServicePaciente implements IServicePaciente {
    @Autowired
    private IDaoPaciente daoPaciente;
    
    @Override
    public void savePaciente(Paciente paciente) {
        daoPaciente.save(paciente);
    }

}
