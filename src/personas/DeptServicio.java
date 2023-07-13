/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personas;

/**
 *
 * @author shiba
 */
public class DeptServicio extends Persona{
    private String tipoServicio;

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    
    
    @Override
    public String devolverDescripcion() {
        return "El departamento de servicios se encarga de ofrecer servicio personalizado a nuestro clientes.";
    }
    
}
