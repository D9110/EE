package org.arquillian.example;


import javax.ejb.Remote;



@Remote
public interface buysellRemote {
   
   void initialize(User user);
   void add(Product product);
   
   

}
