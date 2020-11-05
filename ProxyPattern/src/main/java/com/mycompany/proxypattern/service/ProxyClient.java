/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proxypattern.service;
import com.mycompany.facadepattern.access.Factory;
import com.mycompany.facadepattern.access.IOrderRepository;


/**
 *
 * @author Jorge Ivan- Juan Pablo Solarte
 */
public class ProxyClient {
    private IOrderService orderService;
    
    public ProxyClient(IOrderService orderService){
        this.orderService = orderService;
    }
    public void createOrder(){
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        orderService.save(repo);
    }
}
