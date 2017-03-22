
package vehiculo;

public class Ejecutar {
    public static void main(String[] args) {
        
        Auto obj_a = new Auto ("Hiunda","Veloster");
        Rueda obj_r = new Rueda ("firestone","X223");
        obj_a.agregarRueda(obj_r);
        System.out.println(obj_a.getMarca());
    }
}
