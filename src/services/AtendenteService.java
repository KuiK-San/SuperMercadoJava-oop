/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import models.Atendente;
import utils.FileManager;

import java.util.List;
/**
 *
 * @author Guilherme
 */
public class AtendenteService {
    
    private static final String FILE_PATH = "data/atendente.ser";
    
    public void adicionarAtendente(Atendente atendente){
        List<Atendente> atendentes = FileManager.readFromFile(FILE_PATH);
        atendentes.add(atendente);
        FileManager.writeToFile(FILE_PATH, atendentes);
    }
    
    public Atendente buscarAtendente(String id){
        List<Atendente> atendentes = FileManager.readFromFile(FILE_PATH);
        for(Atendente atendente : atendentes){
            if(atendente.getId().equals(id)){
                return atendente;
            }
            
        }
        return null;
    }
    
    public void removerAtendente(String id){
        List<Atendente> atendentes = FileManager.readFromFile(FILE_PATH);
        for(Atendente atendente : atendentes){
            if(atendente.getId().equals(id)){
                atendentes.remove(atendente);
                return;
            }
        }
    }
    
    public void atualizarAtendente(String id, Atendente atendente){
        removerAtendente(id);
        adicionarAtendente(atendente);
    }

    
}
