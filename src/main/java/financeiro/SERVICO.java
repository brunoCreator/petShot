/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financeiro;

import servico.PROFISSIONAL;

/**
 *
 * @author rotch
 */
public class SERVICO {
    private int id;
    private String nome;

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    private PROFISSIONAL profissionais[];
    private String equipamentos;

    public SERVICO(int id, String nome, PROFISSIONAL[] profissionais, String equipamentos) {
        this.id = id;
        this.nome = nome;
        this.profissionais = profissionais;
        this.equipamentos = equipamentos;
    }

    

    
    public PROFISSIONAL[] getProfissionais() {
        return profissionais;
    }

    public void setProfissionais(PROFISSIONAL[] profissionais) {
        this.profissionais = profissionais;
    }

    public String getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(String equipamentos) {
        this.equipamentos = equipamentos;
    }
}
