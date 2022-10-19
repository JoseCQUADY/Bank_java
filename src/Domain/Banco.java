/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;


public class Banco {
 private String Nombre;
 private String Direccion;
 private String Telefono;
 private Cliente clientes[];
 private static Banco bancoc;
 
 
 private Banco(String Nombre, String Direccion,String Telefono){
 this.Nombre = Nombre;
 this.Direccion = Direccion;
 this.Telefono = Telefono; 
 clientes = new Cliente[8];
 }

 public static Banco getInstance(String Nombre, String Direccion,String Telefono){
   
    if(bancoc == null){
    bancoc = new Banco(Nombre,Direccion,Telefono);   
   }
     return bancoc;
 }
 
 
 public void SetCliente(Cliente cliente){
    
      int i = 0;
        while(clientes[i]!= null){
        i++;
        }
        clientes[i] = cliente;
    }
 
public Cliente GetCliente(String Nombre, String Apellido){
   int i = 0;
   while(clientes[i] != null ){
   if(clientes[i].GetNombre().equals(Nombre) && clientes[i].GetApellido().equals(Apellido)){    
   
       return clientes[i];   
       
   }
   
}
  return null;
}
 
 
 
 

 public void GenerarReporte(){
      int i = 0;
        while(clientes[i]!= null){
        System.out.println("=================================================");
        System.out.println("Bienvenido al banco" + Nombre);
        System.out.println(clientes[i].GetNombre() +" "+ clientes[i].GetApellido());
        System.out.println("Su balance de su cuenta de ahorros es : " + clientes[i].GetCuentaAhorros().ImprimirBalance());
        System.out.println("Si balance de su cuenta de cheques es : " + clientes[i].GetCuentaCheques().ImprimirBalance());
        i++;
        }
     
     
 }         
     
 }
 

     
         
     

 
 

