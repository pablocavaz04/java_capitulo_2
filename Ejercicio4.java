import java.util.Scanner;

/*
*Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
convertir deberá estar almacenada en una variable.*/
import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Introduzca una cantidad de euros: ");
        double euros = sc.nextDouble();
        System.out.println("La cantidad introducida de "+euros+" €, equivale a la cantidad de "+(euros*166)+" pesetas.98");
    }
}
