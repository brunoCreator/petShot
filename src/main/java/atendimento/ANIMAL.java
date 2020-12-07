/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atendimento;

import java.time.LocalDate;

/**
 *
 * @author rotch
 */
public class ANIMAL {
    private int id;
    private String nome;
    private LocalDate dataNascimento;
    private String raca;
    private float peso;
    private float altura;
    private byte[] foto;

    public ANIMAL(int id, String nome, LocalDate dataNascimento, String raca, float peso, float altura, byte[] foto) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.raca = raca;
        this.peso = peso;
        this.altura = altura;
        this.foto = foto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
}
