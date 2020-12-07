/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import atendimento.ANIMAL;
import atendimento.CLIENTE;
import financeiro.SERVICO;
/**
 *
 * @author rotch
 */
public class AGENDAMENTO {
    private int id;
    private ANIMAL animal;
    private PROFISSIONAL profissionais[];
    private CLIENTE cliente;
    private SERVICO servico;

    public AGENDAMENTO(int id, ANIMAL animal, PROFISSIONAL[] profissionais, CLIENTE cliente, SERVICO servico) {
        this.id = id;
        this.animal = animal;
        this.profissionais = profissionais;
        this.cliente = cliente;
        this.servico = servico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ANIMAL getAnimal() {
        return animal;
    }

    public void setAnimal(ANIMAL animal) {
        this.animal = animal;
    }

    public PROFISSIONAL[] getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(PROFISSIONAL[] profissionais) {
        this.profissionais = profissionais;
    }

    public CLIENTE getCliente() {
        return cliente;
    }

    public void setCliente(CLIENTE cliente) {
        this.cliente = cliente;
    }

    public SERVICO getServico() {
        return servico;
    }

    public void setServico(SERVICO servico) {
        this.servico = servico;
    }

    
}
