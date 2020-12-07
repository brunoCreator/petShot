/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import financeiro.ITEM;
import java.util.Map;


public class EstoqueController {
    Map<Integer,ITEM> itens;
    
    public EstoqueController(Map<Integer,ITEM> itens) {
        this.itens = itens;
    }
    
    public void add(int id ,ITEM item){
        itens.put(id, item);
    }
    public ITEM get(int id){
        return itens.get(id);
    }
    
    public void remove(int id){
        itens.remove(id);
    }
    
    public Map<Integer,ITEM> getAll(){
        return itens;
    }
}
