package models;

import java.io.Serializable;

public class Atendente implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String id;
    private String nome;

    public Atendente(String id, String nome) {
        this.id = id;
        this.nome = nome;
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
}