package com.basic.SpringModules;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
    
        Emp emp = new Emp();
        emp.setEmpName("Michael");
        emp.setMobile(958468567);
        

    	em.getTransaction().begin();
    	em.persist(emp);
    	em.getTransaction().commit();
    	System.out.println(emp);

    }
}
