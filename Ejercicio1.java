/***
 * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
los valores 144 y 999 respectivamente. A continuación, muestra por pantalla el valor de cada variable, la suma , la resta, la división y la multiplicación

Author:Pablo Camino Vázquez*/

public class Ejercicio1 {
    public static void main(String[] args) {
    int x; //Estamos declarando x como entero 
    int y; // Definimos y como entero 
    x=144; // Asignamos el valor 144 a x 
    y=999; // Asignamos el valor 999 a y 
    
    System.out.println("x = "+x+" y = "+y);
    System.out.println("x + y = "+(x+y));
    System.out.println("x - y = "+(x-y));
    System.out.println("x / y = "+(x/y));
    System.out.println("x * y = "+(x*y));
    }
}