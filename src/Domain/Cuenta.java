
package Domain;


public class Cuenta {
    protected double balance;
    private boolean montocorrecto = false;
  
    
    public boolean retirar(double montoretiro){
    
         if(montoretiro > 0 ){
        this.balance = this.balance - montoretiro; 
        if(balance > 0 ){
         montocorrecto = true;   
        }else{
       montocorrecto = false;
       this.balance = this.balance + montoretiro;
       } 
     }
        return montocorrecto;
    }
    
    
     public boolean depositar(double montobalance){
      if(montobalance > 0){
        this.balance = this.balance + montobalance;    
        montocorrecto = true;
      }else{
       montocorrecto = false;
      }    
      return montocorrecto;
     }
     
    
    
    
    
}
