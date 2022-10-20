/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author a17000597
 */
public class CuentaCheques extends Cuenta {
    private double Montosobregiro = 50;
    
    
    public CuentaCheques(double balance, double montosobregiro){
        this.balance = balance;
        this.Montosobregiro = montosobregiro;
    }
    
   @Override
    public void retirar(double montoretiro){
       if(montoretiro > 0 ){
          if(this.balance + Montosobregiro >= montoretiro ){
            if(montoretiro > this.balance ){
            this.Montosobregiro = this.Montosobregiro-(montoretiro - this.balance);     
            this.balance = 0;
                   
                
            }else{
                this.balance = this.balance-montoretiro;
            }          
          }else{
              System.out.println("Saldo insuficiente");
          }     
       }else{
        System.out.println("No se puede retirar salgo negativo");   
       }   
    }
    
    public double ImprimirBalance(){
        return balance;
        
    }
    
    
}
