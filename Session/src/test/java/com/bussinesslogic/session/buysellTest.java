package com.bussinesslogic.session;

import java.util.List;

import javax.ejb.EJB;
import javax.inject.Inject;

import junit.framework.Assert;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.shopping.products.Product;
import com.shopping.users.User;

@RunWith(Arquillian.class)
public class buysellTest
{

   @Deployment
   public static JavaArchive createDeployment() {
       return ShrinkWrap.create(JavaArchive.class)
           .addClass(buysell.class)
           .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
              
   }

   @Inject
   buysell bs;
   
   @Before
   public void setup()
   {
      User user=new User();
      user.setId(1);
      user.setName("One");
      
      Product product;
      
      bs.initialize(user);
      
      for(int i=0;i<=5;i++)
      {
         product=new Product();
         product.setId(i);
         product.setCost(i*1000);
      bs.add(product);
      }
      
   }
 
   @Test
   public void testbs()
   {
      
      List<Product> l;
      
      l=bs.getList();
      
      
  Assert.assertNotNull( bs.getUser().getId());   
      
//      for(Product p:l)
//      {
//         
//         System.out.println(p.getId());
//         System.out.println(p.getCost());
//           
//         
//      }
   }
   
   
}
