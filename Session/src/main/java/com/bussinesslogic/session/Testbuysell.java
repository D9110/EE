package com.bussinesslogic.session;

import java.util.List;

import com.shopping.products.Product;
import com.shopping.users.User;

public class Testbuysell
{

   public static void main(String[] args)
   {
     buysell bs =new buysell();
     
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
     
     List<Product> l;
     
     l=bs.getList();
     
     System.out.println(bs.getUser().getId());
     
     for(Product p:l)
     {
        
        System.out.println(p.getId());
        System.out.println(p.getCost());
          
        
     }
     
   }

}
