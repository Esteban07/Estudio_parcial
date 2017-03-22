
package poo;

public class Carro {
  private String llantas;
  private String color;
  private String marca;

    public Carro(String llantas, String color, String marca) {
        this.llantas = llantas;
        this.color = color;
        this.marca = marca;
    }
    
    public Carro(){
        
    }
          public void Arrancar(String direccion){
        System.out.println("El carro Arranca"+direccion);
        
    }
      public void Retroceder(String lugar){
        System.out.println("El Carro Retrocede"+lugar);
         
    }
     public void informarcaracterísticas(){
        System.out.println("El carro tiene"+llantas); 
        System.out.println("El carro es"+color);
        System.out.println("El carro es"+marca); 
}
    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
  
    
    }
}


