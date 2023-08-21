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
   protected String currency;
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
   abstract String currency();
   String currency() {
      return currency;
   }
   static Money dollar(int amount)  {
      return new Dollar(amount, "USD");
   }
   
   static Money franc(int amount) {
      return new Franc(amount, "CHF");
   }
   abstract class Money {
   private String currency; 

   static Money dollar(int amount)  {
      return new Dollar(amount, "USD");
   }

   static Money franc(int amount) {
      return new Franc(amount, "CHF");
   }

   Money(int amount, String currency) {
      this.amount = amount;
      this.currency = currency;
   }
}

class Franc extends Money {	
   Franc(int amount, String currency) {
      super(amount, currency);
   }
     
   Money times(int multiplier)  {
      return Money.franc(amount * multiplier);
   }
}

class Dollar extends Money {	
   Dollar(int amount, String currency)  {
      super(amount, currency);
   }
	
   Money times(int multiplier)  {
      return Money.dollar(amount * multiplier);
   }
   
}
