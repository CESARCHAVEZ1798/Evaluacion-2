/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author César Aljandro Chávez Villa 18550351
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco bMiCuenta = new Banco();
        System.out.println("Nombre del cliente:  " +bMiCuenta.getNombreCliente() );
        System.out.println("Saldo del cliente:  " +bMiCuenta.getSaldo() );
        System.out.println("");
        Banco bMiCuenta2 = new Banco("Cesar chavez ",5000);
        System.out.println("Nombre del cliente: " + bMiCuenta2.getNombreCliente());
        System.out.println("Nombre del cliente: " + bMiCuenta2.getSaldo());
    }
    
    

}
class Banco{
private String NombreCliente;
private double saldo;

    public Banco() {
        NombreCliente = "Irving Gerardo Mancera Mejia";
        saldo= 10000;
    }

    public Banco(String NombreCliente, double saldo) {
        this.NombreCliente = NombreCliente;
        this.saldo = saldo;
        
    }



    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}