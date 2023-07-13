/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author shiba
 */
public class Clientes extends Persona{
    private String DNI;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    @Override
    public String devolverDescripcion(){
        return "El cliente es de las personas más importante para la empresa y a quien se debe cuidar y tratar.";
    }
}
