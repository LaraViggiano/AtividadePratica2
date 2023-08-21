/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepratica2;

/**
 *
 * @author Larar
 */
public class money {
    class Money  {
   protected int amount;
   
   public boolean equals(Object object) {
      Money money = (Money) object;
      return amount == money.amount && getClass().equals(money.getClass());
   } 
   
}
    static Dollar dollar(int amount)  {
      return new Dollar(amount);
   }
	
   abstract Money times(int multiplier);  
   static Money dollar(int amount)  {
      return new Dollar(amount);
   }
   
   static Money franc(int amount) {
      return new Franc(amount);
    }
}
