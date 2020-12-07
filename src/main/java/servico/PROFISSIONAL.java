/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

/**
 *
 * @author rotch
 */
public class PROFISSIONAL {
    private double id;
    private String name;
    private String especialidade;

    public PROFISSIONAL(double id, String name, String especialidade) {
        this.id = id;
        this.name = name;
        this.especialidade = especialidade;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
