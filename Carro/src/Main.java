/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);
    System.out.println("Nombre Primer Pasajero");
    String nombrepasajero1 = teclado.next();
    
    System.out.println("Apellido del primer pasajero");
    String apellidopasajero1 = teclado.next();
    
    System.out.println("Nombre Conductor");
    String nombreconductor = teclado.next();
    
    System.out.println("Apellido Conductor");
    String apellidoconductor = teclado.next();
    
    System.out.println("Nombre otro pasajero");
    String nombreotropasajero = teclado.next();
    
     System.out.println("Apellido otro pasajero");
    String apellidootropasajero = teclado.next();
    
    Person pasajero 1= new person(nombrepasajero1, apellidopasajero1);
    Person pasajero 2= new person(nombreotropasajero, apellidootropasajero); 
    Person conductor= new person(nombreconductor, apellidoconductor);
    
    Car carro = new Car();
    carro.setPassanger(pasajero 1);
    carro.setOtherpassanger(pasajero 2);
    carro.setDriver(conductor);
    
    System.out.println("Imprimir nombre pasajeros");
    String[] nombres= carro.getPassangers();
       for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
        
        System.out.println("Conductor"); 
        System.out.println(carro.getDriver().getName());
            }
}