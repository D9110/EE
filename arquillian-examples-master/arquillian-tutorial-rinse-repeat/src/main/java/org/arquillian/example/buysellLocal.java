package org.arquillian.example;

import javax.ejb.Local;

@Local
public interface buysellLocal {
   
   void initialize(User user);
   void add(Product product);
   
   

}

