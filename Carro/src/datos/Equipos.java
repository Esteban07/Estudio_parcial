
package datos;

public class Equipos {
    private String nombre;
    private String liga;
    private int ganados;
    private int empatados;

    public Equipos(String nombre, String liga, int ganados, int empatados) {
        this.nombre = nombre;
        this.liga = liga;
        this.ganados = ganados;
        this.empatados = empatados;
    }

    public Equipos(String nombre, int ganados) {
        this.nombre = nombre;
        this.ganados = ganados;
    }
    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the liga
     */
    public String getLiga() {
        return liga;
    }

    /**
     * @param liga the liga to set
     */
    public void setLiga(String liga) {
        this.liga = liga;
    }

    /**
     * @return the ganados
     */
    public int getGanados() {
        return ganados;
    }

    /**
     * @param ganados the ganados to set
     */
    public void setGanados(int ganados) {
        this.ganados = ganados;
    }

    /**
     * @return the empatados
     */
    public int getEmpatados() {
        return empatados;
    }

    /**
     * @param empatados the empatados to set
     */
    public void setEmpatados(int empatados) {
        this.empatados = empatados;
    }
    public int puntos(){
        return ganados*3+empatados;
    }
}