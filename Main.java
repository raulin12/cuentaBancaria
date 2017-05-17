/*
 * 
 * 
 * 
 */
package banco;
import java.util.Scanner;

/**
 *
 * @author raul alfonso reyes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double totalCuenta;

       
         int seguir = 1;
         CuentaDeCheques  Cuenta1;
        Cuenta1 = new CuentaDeCheques(1,1);
         
         while (seguir == 1){
             
         int  usuario = 0;
         
             
        Scanner sc = new Scanner(System.in);
        System.out.println("introdusca la operacion a realizar:");
        System.out.println("opcion 1 para consultar saldo");
        System.out.println("opcion 2 para depositar ");
        System.out.println("opcion 3 para retirar ");
               
        usuario = sc.nextInt();
        
        
        if (usuario == 1){
           // Consultamos el saldo
        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " $");
            
        }else if (usuario == 2){
            // hacemos un ingreso en la cuenta
            System.out.println("Cantidad del cheque a depositar");
            double ingreso = sc.nextInt();
            System.out.println("Se ingresan en la cuenta: " + ingreso + " $ ");
              Cuenta1.depositar(ingreso); 
              totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " $");
        
        }else if (usuario == 3){
            //hacemos un retiro de la cuenta
            System.out.println("cuanto desea retirar:");
            double ingreso = sc.nextInt();
            totalCuenta = Cuenta1.saldo();
            
            if( totalCuenta < ingreso){
                System.out.println("usted no puede retirar esa cantidad");
                totalCuenta = Cuenta1.saldo();
                System.out.println("Total actual en la cuenta: " + totalCuenta + " $");
                
             }else{
            System.out.println("se retiro de la cuenta:" + ingreso + " $" );
            Cuenta1.retirar(ingreso);
            totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta + " $");      
         
            }
        }
       
         System.out.println( );
         System.out.println("------------------------------------------------------ ");
         System.out.println("Desea realizar otra accion? ");
         System.out.println(" use 1 Para si o 2 Para no");
         seguir = sc.nextInt();
    }
}
}