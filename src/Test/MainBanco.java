
package Test;

import Domain.*;

public class MainBanco {

    
    public static void main(String[] args) {
      
// Banco banco = new Banco("Arkham","Calle 10","9995101565");
       Banco banco = Banco.getInstance("Arkham","Calle 10","9995101565");
       
       
       
       
       
       Cliente cliente1 = new Cliente("Patrick","Diaz");
       Cliente cliente2 = new Cliente("Paolo","Herrera");
       
       
       banco.SetCliente(cliente1);
       banco.SetCliente(cliente2);
      
       CuentaAhorro cuentaahorro1 = new CuentaAhorro(500,1);
       cliente1.SetCuentaAhorros(cuentaahorro1);
       CuentaCheques cuentacheques1 = new CuentaCheques(8000,100);
       cliente1.SetCuentaCheques(cuentacheques1);
       cliente1.GetCuentaAhorros().ganarintereses();
       cliente1.GetCuentaCheques().depositar(250);
       
       
       
       CuentaAhorro cuentaahorro2 = new CuentaAhorro(500,1);
       cliente2.SetCuentaAhorros(cuentaahorro2);
       CuentaCheques cuentacheques2 = new CuentaCheques(8000,100);
       cliente2.SetCuentaCheques(cuentacheques2);
       cliente2.GetCuentaAhorros().ganarintereses();
       cliente2.GetCuentaCheques().depositar(250);
       
    
       banco.GenerarReporte();
       
       
       
       
   
    }
    
}
