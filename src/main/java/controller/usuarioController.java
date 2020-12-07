/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.USUARIO;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author rotch
 */
public class usuarioController {
    Map<Integer,USUARIO> usuarios;
    Cipher cipher;
    Key chave;
    SecretKey secretKey;
    
    
    public usuarioController(String key,Map<Integer,USUARIO> usuarios) {
        this.usuarios = usuarios;
        geraChave(key);        
    }

    public boolean add(int id,String nome, String senha){
        usuarios.put(id, new USUARIO(id,nome,criptografar(senha)));
        return true;
    }
    
    public boolean update(int id,String nome, String senha){
        usuarios.replace(id, new USUARIO(id,nome,criptografar(senha)));
        return true;
    }
    
    public String[] getUser(int id){
        return new String[]{(String)usuarios.get(id).getNome(),
                (String)descriptografar(new String(usuarios.get(id).getSenha()))};
    }
    
    public USUARIO get(int id){
        return usuarios.get(id);
    }
    
    public boolean remove(int id){
        usuarios.remove(id);
        return true;
    }
    
    public boolean login(String userName,String senha){
        for(USUARIO user : usuarios.values()){
            if(user.getNome().equals(userName)){
                if(user.getSenha().equals(criptografar(senha))){
                    return true;
                }
            }
        }
        return false;
    }

    public void geraChave(String key){
        try{
            chave = new SecretKeySpec(key.getBytes(), "AES");
            cipher = Cipher.getInstance("AES"); 
        }catch(Exception e){
        }
    }
    
    String criptografar(String senha){
        byte[] criptografado = null;
        try{
           cipher.init(Cipher.ENCRYPT_MODE, chave);
           criptografado = cipher.doFinal(senha.getBytes());
        }catch(Exception e){
        }
        return new String(criptografado);
    }
    
    String descriptografar(String senha){
        byte[] encriptado = senha.getBytes();
        String descriptogrado = null;
        try {
            cipher.init(Cipher.DECRYPT_MODE, chave);
            descriptogrado = new String(cipher.doFinal(encriptado));
        } catch (Exception e) {
        }
        return descriptogrado;
    }
    
}
