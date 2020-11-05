/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proxypattern.service;
import com.mycompany.facadepattern.access.IOrderRepository;
import com.mycompany.facadepattern.app.Main;
import com.mycompany.facadepattern.domain.*;
import java.util.logging.Logger;
/**
 * 
 * @author Jorge Ivan - Juan Pablo Solarte
 */
public class OrderServiceLogger implements IOrderService {
    private OrderFacade orderFacade;
    Logger logger = Logger.getLogger(Main.class.getName());
    public OrderServiceLogger(OrderFacade orderFacade){
        this.orderFacade = orderFacade;
    }

    /**
     * guardar en repositorio
     * @param repo repositorio de la aplicacion
     */
    @Override
    public void save(IOrderRepository repo) {
        repo.createOrder(orderFacade.getOrder());
        String message = "Pedido guardado en la DataBase";
        logger.info(message);
    }
}
