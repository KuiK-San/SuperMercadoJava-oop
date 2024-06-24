package models;

import java.io.Serializable;

public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String id;
    private String nome;
    private String cpf;

    public Cliente(String id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getId(){
        return this.id;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
}