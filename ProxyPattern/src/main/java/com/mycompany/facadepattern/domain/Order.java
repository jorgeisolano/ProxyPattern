/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.facadepattern.domain;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jorge Ivan- Juan Pablo Solarte
 */
public class Order {
    public int despatch;
    private Customer customer;
    private LocalDate date;
    private State state;
    private List<Item> details;

    public Order(Customer customer) {
        this.customer=customer;
        this.details = new ArrayList<Item>();
    }
    
    public void addDish(Dish dish , int amount){
        Item item = new Item();
        item.setDish(dish);
        item.setAmount(amount);
        details.add(item);
    }
    public int calculateTotal(){
        int total=0;
        this.despatch = 1500;
        for (Item item : details ) {
            total+=(item.getDish().getPrice()*item.getAmount()); 
        }
        return total+despatch;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public List<Item> getDetails() {
        return details;
    }

    public void setDetails(List<Item> details) {
        this.details = details;
    }
}
