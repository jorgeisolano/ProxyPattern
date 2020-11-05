
package com.mycompany.facadepattern.domain;

/**
 *Objeto del dominio
 * @author Jorge Ivan - Juan Pablo Solarte
 */
public class Customer {
    private int id;
    private String name;
    private String address;
    private String mobile;
    private String city;

    public Customer(int id, String name, String address, String mobile, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.city = city;
    }
    

}
