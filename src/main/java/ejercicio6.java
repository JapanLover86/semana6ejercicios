/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class ejercicio6 {

    /**
     * @param args the command line arguments
     */
    //Crea un método que calcule el número de fibonacci a partir de un número pasado como parámetro
    public static void main(String[] args) {
        // TODO code application logic here
        //numero de fibonacci
    int num = 5;

    System.out.println("Fibonacci de "+num+" es "+fibonacci1(num));
    System.out.println("Fibonacci de "+num+" es "+fibonacci2(num));
    System.out.println("Fibonacci de "+num+" es "+fibonacci3(num));
}
//solución 1
static int fibonacci1(int n)
{
    if (n>1)  return fibonacci1(n-1) + fibonacci1(n-2);  //función recursiva
    else if (n==1)
        return 1;
    else
        return 0;
}
//solución 2
static int fibonacci2(int n)
{
    if (n>1)
    return fibonacci2(n-1) + fibonacci2(n-2);  //función recursiva
    else return n;
}
//solución 3
static int fibonacci3(int n)
{
    if (n<2)
    return n;
    else return fibonacci3(n-1) + fibonacci3(n-2);  //función recursiva
}
}
