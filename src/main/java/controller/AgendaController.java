/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import atendimento.AGENDA;
import java.util.Map;
import servico.AGENDAMENTO;

/**
 *
 * @author rotch
 */
public class AgendaController {
    Map<Integer,AGENDAMENTO> agendamentos;
    Map<Integer,AGENDA> agendas;
    
    public AgendaController(Map<Integer,AGENDAMENTO> agendamento,
    Map<Integer,AGENDA> agenda) {
        this.agendamentos = agendamento;
        this.agendas = agenda;
    }
    
    public void addMento(int id, AGENDAMENTO agenda){
        agendamentos.put(id, agenda);
    }
    public AGENDAMENTO getMento(int id){
        return agendamentos.get(id);
    }
    public void removeMento(int id){
        agendamentos.remove(id);
    }
    
    
    
    public void addAge(int id,AGENDA agenda){
        agendas.put(id, agenda);
    }
    public AGENDA getAge(int id){
        return agendas.get(id);
    }
    public void removeAge(int id){
        agendas.remove(id);
    }
    
    public Map<Integer,AGENDAMENTO> getAll(){
        return agendamentos;
    }
}
