package com.shopping.products;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Product implements Serializable
{

   private static final long serialVersionUID = -5136865249113906201L;
   
   @Id
   private int id;
   private int cost;
   public int getId()
   {
      return id;
   }
   public void setId(int id)
   {
      this.id = id;
   }
   public int getCost()
   {
      return cost;
   }
   public void setCost(int cost)
   {
      this.cost = cost;
   }
   
   
}
