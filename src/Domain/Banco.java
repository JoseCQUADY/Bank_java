
package Domain;
import java.util.ArrayList;


public class Banco {
 private String nombre;
 private String direccion;
 private String telefono;
 private ArrayList<Cliente> clientes = new ArrayList<>();
 private static Banco bancoc;
 private Cuenta cuenta;
 
 
 private Banco(String Nombre, String Direccion,String Telefono){
 this.nombre = Nombre;
 this.direccion = Direccion;
 this.telefono = Telefono; 
 }

 public static Banco getInstance(String Nombre, String Direccion,String Telefono){
   
    if(bancoc == null){
    bancoc = new Banco(Nombre,Direccion,Telefono);   
   }
     return bancoc;
 }
 
  public void addCustomer(String nombre,String apellido){
    
     clientes.add(new Cliente(nombre,apellido));
    }
 
 public void SetCliente(Cliente cliente){
    clientes.add(cliente);
    }
}
         
     

 
 

