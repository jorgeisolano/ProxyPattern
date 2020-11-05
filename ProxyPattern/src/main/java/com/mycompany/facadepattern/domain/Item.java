/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.facadepattern.domain;

/**
 *Objeto del dominio
 * @author Jorge Ivan- Juan Pablo Solarte
 */
public class Item {
    private Dish dish;
    private int amount;
    
    public Item(){
        
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
