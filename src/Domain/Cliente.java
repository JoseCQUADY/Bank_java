
package Domain;


public class Cliente {
private String nombre;
private String apellido;
private CuentaCheques cuentacheques;
private CuentaAhorro cuentaahorro;

public Cliente (String Nombre,String Apellido){
   this.nombre = Nombre;
   this.apellido = Apellido;
}
public String GetNombre(){
    return nombre;
}
public String GetApellido(){
    return apellido;
    
}

public void SetCuentaAhorros(CuentaAhorro cuenta){
    
 this.cuentaahorro = cuenta;   
     
}
public void SetCuentaCheques(CuentaCheques cuenta){

this.cuentacheques = cuenta;

}

public CuentaAhorro GetCuentaAhorros(){

    return cuentaahorro;

}


public CuentaCheques GetCuentaCheques(){
    
    return cuentacheques;
}




}


