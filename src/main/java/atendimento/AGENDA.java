/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atendimento;

import java.time.LocalDate;
import servico.AGENDAMENTO;

/**
 *
 * @author rotch
 */
public class AGENDA {
    private int id;
    private AGENDAMENTO agendamentos[];
    private LocalDate data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public AGENDAMENTO[] getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(AGENDAMENTO[] agendamentos) {
        this.agendamentos = agendamentos;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public AGENDA(int id, AGENDAMENTO[] agendamentos, LocalDate data) {
        this.id = id;
        this.agendamentos = agendamentos;
        this.data = data;
    }

    
}
