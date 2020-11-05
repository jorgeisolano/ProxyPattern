
package com.mycompany.facadepattern.access;

import com.mycompany.facadepattern.domain.Order;

/**
 * Interfaz con metodos de repositorio
 * @author Jorge Ivan- Juan Pablo Solarte
 */
public interface IOrderRepository {

    void createOrder(Order order);
    
}
