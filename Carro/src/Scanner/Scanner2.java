
package Scanner;
import java.util.Scanner;
public class Scanner2 {
    public static void main(String[] args) {
       
        Scanner rosca = new Scanner(System.in);
        System.out.println("Escribe algo: ");
        String y = rosca.nextLine();
        System.out.println("Usted escribió: "+y);
        System.out.println("Da un número: ");
        int x = rosca.nextInt();
        System.out.println("Su numero es: "+x);
        System.out.println("Escribe un Float: ");
        Float m = rosca.nextFloat();
        System.out.println("Su Float es: "+m);
        System.out.println("Usted escribio "+y+"\n"+"Su numero es "+x+"\n"+"Su Float es "+m);
    }
}
