
package prueba;
import datos.Equipos;
import javax.swing.JOptionPane;
class testing {
    public static void main(String[] args) {
        Equipos e = new Equipos("Juventus","Italiana", 35, 8);
        JOptionPane.showMessageDialog(null,"Nombre: "+e.getNombre()+"\n"+"Liga: "+e.getLiga()+"\npuntos: "+e.puntos());
        JOptionPane.showMessageDialog(null,"Nombre: "+e.getNombre()+"\n"+"Partidos ganados: "+e.getGanados()+"\n"+"Partidos empatados: "+e.getEmpatados());
   
      
        Equipos e2 = new Equipos("Barcelona","BBVA", 28, 15);
        JOptionPane.showMessageDialog(null,"Nombre: "+e2.getNombre()+"\n"+"Liga: "+e2.getLiga()+"\npuntos: "+e2.puntos());
        JOptionPane.showMessageDialog(null,"Nombre: "+e2.getNombre()+"\n"+"Partidos ganados: "+e2.getGanados()+"\n"+"Partidos empatados: "+e2.getEmpatados());
    
        Equipos e3 = new Equipos("Real Madrid","BBVA", 40, 3);
        JOptionPane.showMessageDialog(null,"Nombre: "+e3.getNombre()+"\n"+"Liga: "+e3.getLiga()+"\npuntos: "+e3.puntos());
        JOptionPane.showMessageDialog(null,"Nombre: "+e3.getNombre()+"\n"+"Partidos ganados: "+e3.getGanados()+"\n"+"Partidos empatados: "+e3.getEmpatados());
    
    
    }
}
