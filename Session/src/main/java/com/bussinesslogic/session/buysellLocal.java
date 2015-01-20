package com.bussinesslogic.session;

import javax.ejb.Local;

import com.shopping.products.Product;
import com.shopping.users.User;

@Local
public interface buysellLocal {
   
   void initialize(User user);
   void add(Product product);
   
   

}
