
package vehiculo;

public class Rueda {
     
    private String fabricante;
    private String numero_serie;

    public Rueda(String fabricante, String numero_serie) {
        this.fabricante = fabricante;
        this.numero_serie = numero_serie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }
    
           
}
