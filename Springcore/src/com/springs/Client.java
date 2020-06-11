package com.springs;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object created by us
		/*Employee em= new Employee();
		em.setAddress("Latur");
		em.setId(1);
		em.setName("SANDIP");
		System.out.println(em);
		*/
		//by IOC
		System.out.println("After IOC");
		Resource resource=(Resource) new ClassPathResource("Application.xml");  
	    BeanFactory factory=new XmlBeanFactory((org.springframework.core.io.Resource) resource);  
	      
	 Employee e1=(Employee) factory.getBean("em");
	 System.out.println(e1);
	   
	}


}
