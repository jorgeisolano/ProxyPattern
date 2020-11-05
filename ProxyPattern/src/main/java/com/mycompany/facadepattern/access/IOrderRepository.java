/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.facadepattern.access;

import com.mycompany.facadepattern.domain.Order;

/**
 *
 * @author Jorge Ivan- Juan Pablo Solarte
 */
public interface IOrderRepository {

    void createOrder(Order order);
    
}
