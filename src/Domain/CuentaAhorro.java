
package Domain;

/**
 *
 * @author a17000597
 */
public class CuentaAhorro extends Cuenta{
    private double tasainteres;
    
    
    public CuentaAhorro(double balance,double tasainteres){
        this.balance = balance;
        this.tasainteres = tasainteres;
    }
   
    public void ganarintereses(){ 
     this.balance = this.balance + (this.balance * tasainteres);      
    }
    public double ImprimirBalance(){
      return balance; 
    }
    
    
}
