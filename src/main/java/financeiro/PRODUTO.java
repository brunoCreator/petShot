/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financeiro;

import java.time.LocalDate;

/**
 *
 * @author rotch
 */
public class PRODUTO extends ITEM{
    private LocalDate validade;
    private String marca;
    private char modelo;

    public PRODUTO(int id,LocalDate validade, String marca, char modelo,  String descricao, float preco) {
        super(id, descricao, preco);
        this.validade = validade;
        this.marca = marca;
        this.modelo = modelo;
    }

    

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public char getModelo() {
        return modelo;
    }

    public void setModelo(char modelo) {
        this.modelo = modelo;
    }
}
