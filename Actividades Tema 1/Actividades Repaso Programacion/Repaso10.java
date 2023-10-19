import java.util.*;
/**
 * @author Samuel Vergara Martín 
 */
public class Repaso10 {
    public static void main(String[] args) {
        double input, result;
        final double value1MbToKb = 1024;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingrese la cantidad en MB: ");
        input = sc.nextDouble();

        result = input * value1MbToKb;
        
        System.out.println(input +  " MB son " + result + " KB.");

        sc.close();

        System.exit(0);
    }
}
