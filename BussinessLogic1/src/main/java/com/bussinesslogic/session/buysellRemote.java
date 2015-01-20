package com.bussinesslogic.session;

import javax.ejb.Remote;

import com.shopping.products.Product;
import com.shopping.users.User;

@Remote
public interface buysellRemote {
   
   void initialize(User user);
   void add(Product product);
   
   

}
