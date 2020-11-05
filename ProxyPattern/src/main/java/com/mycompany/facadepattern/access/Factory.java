/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.facadepattern.access;

/**
 *fabrica que devuelve la respectiva implementacion de repositorio
 * 
 * @author Jorge Ivan- Juan Pablo Solarte
 */
public class Factory {
    
    static Factory instance;
    
    /**
     * patron Singleton
     * @return Factory unica instancia de tipo Factory
     */
    public static Factory getInstance(){
        if (instance==null){
            instance = new Factory();
        }
        return instance;
    }
    
    /**
     * 
     * @param typeRepository Especificacion del repositorio deseado
     * @return Repositorio requerido
     */
    public IOrderRepository getRepository(String typeRepository){
        IOrderRepository repo = null;
        if (typeRepository == "default"){
            repo = new ArrayRepository();
        }
        return repo;
    }
}
