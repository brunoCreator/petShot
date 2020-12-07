/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financeiro;

import atendimento.CLIENTE;
import java.time.LocalDate;

/**
 *
 * @author rotch
 */
public class CONTA {
    private int id;
    private CLIENTE cliente;
    private LocalDate data;
    private float total;
    private ITEM itens[];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CONTA(int id, CLIENTE cliente, LocalDate data,ITEM[] itens, float total) {
        this.id = id;
        this.cliente = cliente;
        this.data = data;
        this.total = total;
        this.itens = itens;
    }

    public CLIENTE getCliente() {
        return cliente;
    }

    public void setCliente(CLIENTE cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public ITEM[] getItens() {
        return itens;
    }

    public void setItens(ITEM[] itens) {
        this.itens = itens;
    }

    
    
    
}
