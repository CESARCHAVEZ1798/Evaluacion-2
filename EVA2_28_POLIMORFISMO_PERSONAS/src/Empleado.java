/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author César Alejandro Chávez Villa 18550351
 */
public class Empleado extends Persona {
    private String rfc;

    @Override
    public void imprimirNombre() {
        System.out.println("Empleado: " + getNombre() + " " + getApellido() + " " +getRfc());
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    
}
