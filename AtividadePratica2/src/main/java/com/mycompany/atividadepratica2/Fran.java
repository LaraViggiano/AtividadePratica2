/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepratica2;

/**
 *
 * @author Larar
 */
public class Franc {
    class Franc {   
   private int amount;	
   Franc(int amount) {
      this.amount = amount;
      currency = "CHF"; 
   }
   Franc(int amount) {      
      this.amount= amount;
    }					
    Franc times(int multiplier)  {      
       return new Franc(amount * multiplier);					
    }   
    public boolean equals(Object object) {					
       Franc franc = (Franc) object;      
       return amount == franc.amount;					
     }
     Money times(int multiplier)  {
      return new Franc(amount * multiplier);
   }
      String currency() {
      return "CHF";
   }
      Money times(int multiplier)  {
      return Money.franc(amount * multiplier);
   }
}
class Franc extends Money {
	
   Franc(int amount, String currency) {
      this.amount = amount;
      this.currency = currency;
   }
}
}
