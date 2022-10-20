
package Domain;


public class Cuenta {
    protected double balance;
  
     public void depositar(double montobalance){
      if(montobalance > 0){
        this.balance = this.balance + montobalance;    
      }else{
       System.out.println("Disculpe pero no puede depositar un valor negativo");   
      }    
    }
    public void retirar(double montoretiro){
       if(montoretiro > 0 ){
        this.balance = this.balance - montoretiro;   
       }else{
        System.out.println("No se puede retirar salgo negativo");   
       }   
    }
    
    
    
}
