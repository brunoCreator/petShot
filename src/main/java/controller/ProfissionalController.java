/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import financeiro.SERVICO;
import java.util.Map;
import servico.PROFISSIONAL;

/**
 *
 * @author rotch
 */
public class ProfissionalController {
    Map<Integer,PROFISSIONAL> prof;
    
    public ProfissionalController(Map<Integer,PROFISSIONAL> prof) {
        this.prof = prof;
    }
    
    public void add(int id,PROFISSIONAL pro){
        prof.put(id,pro);
    }
    public PROFISSIONAL get(int id){
        return prof.get(id);
    }
    
    public void remove(int id){
        prof.remove(id);
    }
}
