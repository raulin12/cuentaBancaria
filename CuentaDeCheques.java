/*
 * EjemploCodigo.com
 * 
 * 
 */
package banco;

/**
 *
 * @author Javier Crego
 */
public class CuentaDeCheques {
    
	 // Definición de las propiedades de la clase
    private int numeroCuenta;
    private double saldo;
    
    public CuentaDeCheques(int cuenta, double inicial) {
        numeroCuenta = cuenta;
        saldo = inicial;
    } // Fin del constructor cuenta

    public void depositar(double cantidad) {
        saldo = saldo + cantidad;
    } // Fin del método depositar

    public void retirar(double cantidad) {
        saldo = saldo - cantidad;
    } // Fin del método retirar

    public double saldo() {
        return saldo;
    } // Fin del método saldo    
    
}