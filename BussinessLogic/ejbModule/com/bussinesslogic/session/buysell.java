package com.bussinesslogic.session;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;
import javax.inject.Inject;

import com.shopping.products.Product;
import com.shopping.users.User;

@Stateful
@LocalBean
public class buysell implements buysellRemote, buysellLocal
{

   @Inject
   User usr;

   public buysell()
   {

      usr.setId(9);
      usr.setName("name");

   }

   public static void main(String args[])
   {
      new buysell().work();

   }

   private void work()
   {
      System.out.println(usr.getName());

   }

   @Override
   public void initialize(User user)
   {
      // TODO Auto-generated method stub
      
   }

   @Override
   public void add(Product product)
   {
      // TODO Auto-generated method stub
      
   }

}
