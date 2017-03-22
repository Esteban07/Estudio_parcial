
package Cuentilla;

import static java.time.Clock.system;

public class main{
    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta("Jorge Ramos", 11);
        Cuenta cuenta2 = new Cuenta("Vicente Fernandez", 12);
        Cuenta cuenta3 = new Cuenta("James Rodríguez", 13);
        
        cuenta1.ingresar(5);
        cuenta2.ingresar(-10);
        cuenta3.ingresar(1);
        cuenta1.retirar(3);
        cuenta2.retirar(13);
        cuenta3.retirar(5);
        
        cuenta1.toString();
        cuenta2.toString();
        cuenta3.toString();
        
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);    }
       
    
}
