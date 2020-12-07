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
public class ServicoController {

    Map<Integer,SERVICO> servicos;
    Map<Integer,PROFISSIONAL> profs;
    
    public ServicoController(Map<Integer,SERVICO> servico,Map<Integer,PROFISSIONAL> prof) {
        this.servicos = servico;
        this.profs = prof;
    }
    
    public void add(int id,SERVICO ser){
        servicos.put(id, ser);
    }
    
    public SERVICO get(int id){
        return servicos.get(id);
    }
    
    public void remove(int id){
        servicos.remove(id);
    }
    
    public Map<Integer,PROFISSIONAL> allProf(){
        return profs;
    }
    public PROFISSIONAL getProf(int id){
        return profs.get(id);
    }
    
    public Map<Integer,SERVICO> getAllServ(){
        return servicos;
    }
}
