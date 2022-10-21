
package Domain;


public class CuentaCheques extends Cuenta {
    private double Montosobregiro = 50;
    private boolean montocorrecto = false;
    
    public CuentaCheques(double balance){
     this.balance = balance;
     this.Montosobregiro = 50;
        
    }
    public CuentaCheques(double balance, double montosobregiro){
        this.balance = balance;
        this.Montosobregiro = montosobregiro;
    }
    
   @Override
    public boolean retirar(double montoretiro){
       if(montoretiro > 0){
          if(this.balance + Montosobregiro >= montoretiro ){
            if(montoretiro > this.balance ){
            this.Montosobregiro = this.Montosobregiro-(montoretiro - this.balance);     
            this.balance = 0;
        
            }else{
                this.balance = this.balance-montoretiro;    
            }
            montocorrecto = true;
          }else{
            montocorrecto = false;
          }     
       }  
        return montocorrecto;
    }
    
    
    public double getBalance(){
        return balance;
        
    }
    
    
}
