package models;

import java.io.Serializable;

public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String id, String nome, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
        public String getId(){
            return this.id;
        }
    
        public String getNome(){
            return this.nome;
        }
        public double getPreco(){
            return this.preco;
        }
        public int getQuantidade(){
            return this.quantidade;
        }
    
        public void setNome(String nome){
           this.nome = nome;
        }
        
        public void setPreco(Double preco){
            this.preco = preco;
        }
        
        public void setQuantidade(int quantidade){
            this.quantidade = quantidade;
        }
}