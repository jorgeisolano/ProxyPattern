/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.facadepattern.access;

/**
 *
 * @author Jorge Ivan- Juan Pablo Solarte
 */
public class Factory {
    static Factory instance;
    public static Factory getInstance(){
        if (instance==null){
            instance = new Factory();
        }
        return instance;
    }
    public IOrderRepository getRepository(String typeRepository){
        IOrderRepository repo = null;
        if (typeRepository == "default"){
            repo = new ArrayRepository();
        }
        return repo;
    }
}
