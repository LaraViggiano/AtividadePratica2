/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepratica2;

/**
 *
 * @author Larar
 */
public class Dolar {
    class Dollar {
   private int amount;
   Dollar(int amount)  {
      this.amount = amount;
      currency = "USD";
   }
   Dollar(int amount) {
      this.amount= amount;
   }
   void times(int multiplier) {
      amount= amount * multiplier;
   }
   Dollar times(int multiplier) {
      return new Dollar(amount * multiplier);
   }
   public boolean equals(Object object)  {
   Dollar dollar = (Dollar) object;
   return amount == dollar.amount;
}
   Money times(int multiplier)  {
      return new Dollar(amount * multiplier);
   }		
   String currency() {
       return "USD";
    }
    Money times(int multiplier)  {
      return Money.dollar(amount * multiplier);
   }
}
 class Dollar extends Money {
	
   Dollar(int amount, String currency)  {
      this.amount = amount;
      this.currency = currency;
   }
}
}
