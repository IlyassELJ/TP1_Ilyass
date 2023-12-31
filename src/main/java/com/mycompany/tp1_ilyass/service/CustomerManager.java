/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp1_ilyass.service;
import com.mycompany.tp1_ilyass.entity.Customer;
import jakarta.enterprise.context.RequestScoped;
import java.util.List;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
/**
 *
 * Gère la persistance des Customers
 */

@RequestScoped
public class CustomerManager {

    @PersistenceContext(unitName = "customerPU")
    private EntityManager em;
    
    public List<Customer> getAllCustomers() {  
        Query query = em.createNamedQuery("Customer.findAll");
       return query.getResultList(); 
    }  
    @Transactional
    public Customer update(Customer customer) {
      return null;  
    }   
    
    @Transactional
     public void persist(Customer customer) {
       em.persist(customer);
    }

    public Customer findById(int idCustomer) {  
        return em.find(Customer.class, idCustomer);  
    }
}