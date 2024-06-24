/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import models.Produto;
import utils.FileManager;

import java.util.List;
/**
 *
 * @author Guilherme
 */
public class ProdutoService {
    
    private static final String FILE_PATH = "data/produto.ser";
    
    public void adicionarProduto(Produto produto){
        List<Produto> produtos = FileManager.readFromFile(FILE_PATH);
        produtos.add(produto);
        FileManager.writeToFile(FILE_PATH, produtos);
    }
    
    public Produto buscarProduto(String id){
        List<Produto> produtos = FileManager.readFromFile(FILE_PATH);
        for(Produto produto : produtos){
            if(produto.getId().equals(id)){
                return produto;
            }
            
        }
        return null;
    }
    
    public void removerProduto(String id){
        List<Produto> produtos = FileManager.readFromFile(FILE_PATH);
        for(Produto produto : produtos){
            if(produto.getId().equals(id)){
                produtos.remove(produto);
                return;
            }
        }
    }
    
    public void atualizarProduto(String id, Produto produto){
        removerProduto(id);
        adicionarProduto(produto);
    }

    
}
