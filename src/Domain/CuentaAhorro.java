/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author a17000597
 */
public class CuentaAhorro {
    private double Balance;
    private double tasainteres;
    
    
    public CuentaAhorro(double balance,double tasainteres){
        this.Balance = balance;
        this.tasainteres = tasainteres;
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
        this.Balance = this.Balance - montoretiro;   
       }else{
        System.out.println("No se puede retirar salgo negativo");   
       }   
    }
    public void ganarintereses(){
        
     this.Balance = this.Balance + (this.Balance * tasainteres);   
        
    }
   
    public double ImprimirBalance(){
      return Balance;
        
    }
    
    
}
