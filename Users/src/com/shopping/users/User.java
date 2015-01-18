package com.shopping.users;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity (name="User")   //Give new name for entity.
@Table  (name="UserTable")  //Give new tablename 
public class User implements Serializable
{

   @Id //either on ID or on the getter(Usually industry does it on the getter)
   private int id;
   
   @Column (name="UserName",nullable=true)
   private String name;

   public int getId()
   {
      return id;
   }

   public void setId(int id)
   {
      this.id = id;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   private static final long serialVersionUID = 1L;

   public User()
   {
      super();
   }

}
