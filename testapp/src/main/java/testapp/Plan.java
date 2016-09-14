package testapp;

public abstract class Plan{  
         protected double rate;  
         abstract void getRate(); 
         public abstract String getPlanName();
   
         public void calculateBill(int units){  
              System.out.println(units*rate);  
          }  
}