/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author a17000597
 */
public class CuentaCheques {
    private double Balance;
    private double Montosobregiro = 50;
    
    
    public CuentaCheques(double balance, double montosobregiro){
        this.Balance = balance;
        this.Montosobregiro = montosobregiro;
    }
    public void depositar(double montobalance){
      if(montobalance > 0){
        this.Balance = this.Balance + montobalance;    
      }else{
       System.out.println("Disculpe pero no puede depositar un valor negativo");   
      }    
    }
    public void retirar(double montoretiro){
       if(montoretiro > 0 ){
          if(this.Balance + Montosobregiro >= montoretiro ){
            if(montoretiro > this.Balance ){
            this.Montosobregiro = this.Montosobregiro-(montoretiro - this.Balance);     
            this.Balance = 0;
                   
                
            }else{
                this.Balance = this.Balance-montoretiro;
            }          
          }else{
              System.out.println("Saldo insuficiente");
          }     
       }else{
        System.out.println("No se puede retirar salgo negativo");   
       }   
    }
    
    public double ImprimirBalance(){
        return Balance;
        
    }
    
    
}
