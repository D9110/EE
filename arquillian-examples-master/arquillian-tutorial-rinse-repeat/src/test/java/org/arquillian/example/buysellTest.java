package org.arquillian.example;

import java.util.List;

import javax.ejb.EJB;
import javax.inject.Inject;

import junit.framework.Assert;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;




@RunWith(Arquillian.class)
public class buysellTest
{

   @Deployment
   public static JavaArchive createDeployment() {
       return ShrinkWrap.create(JavaArchive.class,"test.jar")
           .addClasses(buysell.class,buysellRemote.class,buysellLocal.class,Product.class,User.class)
           .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
              
   }

   @EJB
   buysell bs;
   
   
   @Inject
   User user;
 
   
  
//   public void setup()
//   {
//      User user=new User();
//      user.setId(1);
//      user.setName("One");
//      
//      Product product=new Product();;
//     
//      bs=new buysell();
//      
//      bs.initialize(user);
//      
//      for(int i=0;i<=5;i++)
//      {
//         product=new Product();
//         product.setId(i);
//         product.setCost(i*1000);
//     bs.add(product);
//      }
//      
//   }
 
   @Test
   public void testbs()
   {
     // setup();
      
      User user=new User();
      user.setId(1);
      user.setName("One");
      
      Product product=new Product();;
     
      bs=new buysell();
      
      bs.initialize(user);
      
      for(int i=0;i<=5;i++)
      {
         product=new Product();
         product.setId(i);
         product.setCost(i*1000);
     bs.add(product);
      }
            
      
      List<Product> l;
      
      l=bs.getList();
      
      
  Assert.assertNull( bs.getUser().getId());   
      
      for(Product p:l)
      {
         
         System.out.println(p.getId());
         System.out.println(p.getCost());
           
         
      }
   }
  
   
}