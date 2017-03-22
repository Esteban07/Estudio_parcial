
package vehiculo;

public class Auto {
    private String marca;
    private String modelo;
    private final Rueda [] ruedas;

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ruedas = new Rueda[4];
        
    }
    public void CambiarRueda(Rueda obt_r, int pos){
        Rueda obt_ru = (obt_r.getFabricante(),obj_r.getNumero_serie())
        this.ruedas[pos] = obj_ru;
    }
    public void Agregarllanta(Rueda obt_r){
        
        this.ruedas[this.ruedas.length-1] = obj_r;
        ruedas[3].setFabricante("Ford");
    }
    public String getMarca(){
        return marca;
        
    }
    public String getModelo(){
        return modelo;
    }
    
    public Rueda[] getRueda(){
        return ruedas;
    }
   
    
    
    
    
    
}

   