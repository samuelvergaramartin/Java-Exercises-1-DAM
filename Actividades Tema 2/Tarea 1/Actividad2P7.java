/**
 * @author Samuel Vergara Martin
 */
import java.util.Scanner;
public class Actividad2P7 {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca un numero: ");
        n1 = sc.nextInt();

        System.out.print("Introduzca un numero: ");
        n2 = sc.nextInt();

        System.out.print("Introduzca un numero: ");
        n3 = sc.nextInt();

        if(n1 > n2 && n2 > n3) {
            System.out.println(n1 + ", " + n2 + ", " + n3);
        }
        else if(n1 > n3 && n3 > n2) {
            System.out.println(n1 + ", " + n3 + ", " + n2);
        }
        else if(n2 > n1 && n1 > n3) {
            System.out.println(n2 + ", " + n1 + ", " + n3);
        }
        else if(n2 > n1 && n3 > n1) {
            System.out.println(n2 + ", " + n3 + ", " + n1);
        }
        else if(n3 > n1 && n1 > n2) {
            System.out.println(n3 + ", " + n1 + ", " + n2);
        }
        else if(n3 > n2 && n2 > n1) {
            System.out.println(n3 + ", " + n2 + ", " + n1);
        }

        sc.close();

        System.exit(0);
    }
}
