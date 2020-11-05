/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.facadepattern.domain;

import com.mycompany.facadepattern.access.IOrderRepository;
import com.mycompany.facadepattern.domain.State;
import com.mycompany.facadepattern.domain.Order;
import com.mycompany.facadepattern.domain.Dish;
import com.mycompany.facadepattern.domain.Customer;
import com.mycompany.proxypattern.service.IOrderService;


/**
 * Fachada de Gestion de ordenes
 * @author Jorge Ivan- Juan Pablo Solarte
 */
public class OrderFacade implements IOrderService {
    
    private Order order;
    
    /**
     * creacion de nueva orden
     * @param customer cliente de la nueva orden creada
     */
    public void createOrder(Customer customer){
        order = new Order(customer);
        order.setState(State.NEW);
    }
    public void addDish(Dish dish, int amount){
        order.addDish(dish, amount);
    }
    public void changeState(State state){
        order.setState(state);
    }
    public void cancelOrder(){
        order.setState(State.CANCELLED);
    }
    public int calculateTotal(){
        return order.calculateTotal();
    }
    public Order getOrder(){
        return this.order;
    }
    public int totalDishes(){
        return order.getDetails().size();
    }

    @Override
    public void save(IOrderRepository repo) {
        repo.createOrder(order);
    }

}
