/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author shiba
 */
public class DeptVentas extends Persona{
    private int ventas;

    public int getVentas() {
        return ventas;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    
    @Override
    public String devolverDescripcion() {
        return "El departamento de ventas se encarga de la gestión de las ventas en la empresa.";
    }
    
}
