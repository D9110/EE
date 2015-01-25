package org.arquillian.example;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Stateful;



/* 
 * Another way without implementing the interfaces would be to add annotations
 * @Remote({buysellRemote.class})
 * @Local({buysellLocal.class})
 */



@Stateful
@LocalBean
public class buysell implements buysellRemote, buysellLocal
{

   
   User user;
   List<Product> list=new ArrayList<Product>();
   
   
   
   public User getUser()
   {
      return user;
   }

   public List<Product> getList()
   {
      return list;
   }

   public buysell()
   {
      
     user=new User();
      list=new ArrayList<Product>();
   }

   public static void main(String args[])
   {
      new buysell().work();

   }

   private void work()
   {
      System.out.println(user.getName());

   }

   @Override
   public void initialize(User user)
   {
     this.user=user;
   }

   @Override
   public void add(Product product)
   {
      list.add(product);
   }
   
   @PostConstruct
   void initialize() {
      user=new User();
      list=new ArrayList<Product>();
   }

}

