package com.shopping.users;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class TestUser
{
   
   private static SessionFactory sessionFactory;
   private static ServiceRegistry serviceRegistry;
   
   public static SessionFactory createSessionFactory() {
      Configuration configuration = new Configuration();
      configuration.configure();
      serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
               configuration.getProperties()).build();
      sessionFactory = configuration.buildSessionFactory(serviceRegistry);
      return sessionFactory;
  }

   public static void main(String[] args)
   {
    User user=new User();
    user.setId(1);
    user.setName("user 1");
    
    //Hibernate API persistence
    
    //1. Make SessionFactory (one per session)
    //2. Make session from the factory
    
     SessionFactory sessionFactory=createSessionFactory();
     Session session=sessionFactory.openSession();
     
     session.beginTransaction();
     session.save(user);
     session.getTransaction().commit();
    
   }
   



}
