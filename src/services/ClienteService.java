/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import models.Cliente;
import utils.FileManager;

import java.util.List;
/**
 *
 * @author Guilherme
 */
public class ClienteService {
    
    private static final String FILE_PATH = "data/clientes.ser";
    
    public void adicionarCliente(Cliente cliente){
        List<Cliente> clientes = FileManager.readFromFile(FILE_PATH);
        clientes.add(cliente);
        FileManager.writeToFile(FILE_PATH, clientes);
    }
    
    public Cliente buscarCliente(String id){
        List<Cliente> clientes = FileManager.readFromFile(FILE_PATH);
        for(Cliente cliente : clientes){
            if(cliente.getId().equals(id)){
                return cliente;
            }
            
        }
        return null;
    }
    
    public void removerCliente(String id){
        List<Cliente> clientes = FileManager.readFromFile(FILE_PATH);
        for(Cliente cliente : clientes){
            if(cliente.getId().equals(id)){
                clientes.remove(cliente);
                return;
            }
        }
    }
    
    public void atualizarCliente(String id, Cliente cliente){
        removerCliente(id);
        adicionarCliente(cliente);
    }

    
}
