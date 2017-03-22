
package poo;

public class Test {
   
    public static void main(String[] args){
            
          Carro carro = new Carro();
        
     carro.setLlantas(" cuatro llantas");
            carro.setColor(" color verde");
            carro.setMarca(" Ferrari");
            
            
            carro.Arrancar(" a la izquierda 4 metros");
            carro.Retroceder(" directo 1 metro");
            System.out.println();
            carro.informarcaracterísticas();   
            
     }
}
