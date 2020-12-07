/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atendimento;

/**
 *
 * @author rotch
 */
public class FISICA extends CLIENTE {
    private String cnpj;

    public FISICA(String cnpj, double id, String nome, String logradouro, int numero, String complemento, String bairro, String municipio, String estado, String telefone, ANIMAL[] animais) {
        super(id, nome, logradouro, numero, complemento, bairro, municipio, estado, telefone, animais);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
}
