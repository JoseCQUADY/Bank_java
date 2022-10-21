
package Test;

import Domain.*;

public class MainBanco {

    
    public static void main(String[] args) {
      
// Banco banco = new Banco("Arkham","Calle 10","9995101565");
       Banco banco = Banco.getInstance("Arkham","Calle 10","9995101565");
      
       
       Cliente cliente1 = new Cliente("Patrick","Diaz");
       System.out.println("Creando al cliente " + cliente1.GetNombre()+" "+cliente1.GetApellido());
       Cliente cliente2 = new Cliente("Paolo","Herrera");
       System.out.println("Creando al cliente " + cliente2.GetNombre()+" "+cliente2.GetApellido());
       Cliente cliente3 = new Cliente("Ibai","Llanos");
       System.out.println("Creando al cliente " + cliente3.GetNombre()+" "+cliente3.GetApellido());
      
       banco.SetCliente(cliente1);
       banco.SetCliente(cliente2);
       Cuenta cuentaahorro1 = new CuentaAhorro(500,3);
       Cuenta cuentacheques1 = new CuentaCheques(500,500);
       Cuenta cuentacheques2 = new CuentaCheques(500);
       
       System.out.println("Creando la cuenta de ahorros de " + cliente1.GetNombre()+" "+cliente1.GetApellido() + " con 500 y 3% de interes");
       cliente1.SetCuentaAhorros((CuentaAhorro) cuentaahorro1);
       System.out.println("Creando la cuenta de cheques de " + cliente2.GetNombre()+" "+cliente2.GetApellido() + " con 500 y 500 de sobregiro");
       cliente2.SetCuentaCheques((CuentaCheques) cuentacheques1);
       System.out.println("Creando la cuenta de cheques de " + cliente3.GetNombre()+" "+cliente3.GetApellido() + " con 250 y sobregiro por defecto");
       cliente3.SetCuentaCheques((CuentaCheques) cuentacheques2);
       System.out.println("\nRecuperando la cuenta de ahorros de " + cliente1.GetNombre()+" "+cliente1.GetApellido());
       System.out.println("Retiro de 150 : " + cliente1.GetCuentaAhorros().retirar(150));
       System.out.println("Deposito de 22.50 : " + cliente1.GetCuentaAhorros().depositar(22.50));
       System.out.println("Retiro de 47.62 : " + cliente1.GetCuentaAhorros().retirar(47.62));
       System.out.println("Retiro de 400 : " + cliente1.GetCuentaAhorros().retirar(400));
       System.out.println("Cliente " +cliente1.GetNombre()+" "+cliente1.GetApellido()+" tiene un balance de " + cliente1.GetCuentaAhorros().getBalance());
       
       System.out.println("\nRecuperando la cuenta de cheques de " + cliente2.GetNombre()+" "+cliente2.GetApellido());
       System.out.println("Retiro de 150 : " + cliente2.GetCuentaCheques().retirar(150));
       System.out.println("Deposito de 22.50 : " + cliente2.GetCuentaCheques().depositar(22.50));
       System.out.println("Retiro de 47.62 : " + cliente2.GetCuentaCheques().retirar(47.62));
       System.out.println("Retiro de 400 : " + cliente2.GetCuentaCheques().retirar(400));
       System.out.println("Cliente " +cliente2.GetNombre()+" "+cliente2.GetApellido()+" tiene un balance de " + cliente2.GetCuentaCheques().getBalance());
       
       System.out.println("\nRecuperando la cuenta de cheques de " + cliente3.GetNombre()+" "+cliente3.GetApellido());
       System.out.println("Deposito de 150 : " + cliente3.GetCuentaCheques().depositar(150));
       System.out.println("Retiro de 750 : " + cliente3.GetCuentaCheques().retirar(750));
       System.out.println("Cliente " +cliente3.GetNombre()+" "+cliente3.GetApellido()+" tiene un balance de " + cliente3.GetCuentaCheques().getBalance());
       
    }
    
}
