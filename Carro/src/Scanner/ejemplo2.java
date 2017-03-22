
package Scanner;

import java.io.InputStream;
import java.util.Scanner;

public class ejemplo2 {
    public static void main(String[] args) {
        Scanner roscuu = new Scanner (System.in);
        System.out.println("Ingrese número 1");
        int x = roscuu.nextInt();
        System.out.println("Ingrese número 2");
        int m = roscuu.nextInt();
        int suma = x+m;
          System.out.println("la suma es"+suma);
    }
}
