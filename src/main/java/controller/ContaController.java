/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import financeiro.CONTA;
import java.util.Map;

/**
 *
 * @author rotch
 */
public class ContaController {

    Map<Integer,CONTA> contas;
    
    public ContaController(Map<Integer,CONTA> contas) {
        this.contas = contas;
    }
    
    public void add(int id, CONTA conta){
        contas.put(id, conta);
    }
    
    public CONTA get(int id){
        return contas.get(id);
    }
    
    public void del(int id){
        contas.remove(id);
    }
}
