
package Domain;


public class Cliente {
private String Nombre;
private String Apellido;
private CuentaCheques cuentacheques;
private CuentaAhorro cuentaahorro;

public Cliente (String Nombre,String Apellido){
   this.Nombre = Nombre;
   this.Apellido = Apellido;
}
public String GetNombre(){
    return Nombre;
}
public String GetApellido(){
    return Apellido;
    
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


