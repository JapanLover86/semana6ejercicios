
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    //Crea un método que imprima los dígitos desde 1 hasta N. Se debe pasar como parámetro el número N
    public static void main(String[] args) {
        // TODO code application logic here
        //declaración de variables
        int n1, n2;
        Scanner sc = new Scanner(System.in);

        //leer el primer número
        System.out.println("Introduce un número entero: ");
        n1 = sc.nextInt();      //lee un entero por teclado

        //leer el segundo número
        System.out.println("Introduce otro número entero: ");
        n2 = sc.nextInt();      //lee un entero por teclado
        
        //mostrar resultado
        System.out.println("Ha introducido los números: " + n1 + " y " + n2);                      

    }
}
