/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import atendimento.ANIMAL;
import atendimento.CLIENTE;
import atendimento.FISICA;
import atendimento.JURIDICA;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rotch
 */
public class cadastroController {
    Map<Integer,CLIENTE> clientes;
    Map<Integer,ANIMAL> animais;
    
    public cadastroController(Map<Integer,CLIENTE> clientes,Map<Integer,ANIMAL> animais) {
        this.clientes = clientes;
        this.animais = animais;
    }
    
    public void setCliAni(int id, ANIMAL[] animal){
        clientes.get(id).setAnimais(animal);
    }
    
    public void add(int id,CLIENTE cliente){
        clientes.put(id, cliente);
    }
    public CLIENTE get(int id){
        return clientes.get(id);
    }
    public void addAni(int id,ANIMAL animal){
            animais.put(id, animal);
    }
    public ANIMAL getAni(int id){
        return animais.get(id);
    }
    public void delcli(int id){
        clientes.remove(id);
    }
    public void delAni(int id){
        animais.remove(id);
    }
    public Map<Integer,CLIENTE> getAll(){
        return clientes;
    }
}
