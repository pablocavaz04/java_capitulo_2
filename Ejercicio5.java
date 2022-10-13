import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduzca una cantidad de pesetas: ");
        double pesetas = sc.nextDouble();
        System.out.println("La cantidad introducida de "+pesetas+" pesetas, equivale a la cantidad de "+(int)(pesetas/166)+" €");
        sc.close();
    }
}
