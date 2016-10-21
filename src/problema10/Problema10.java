/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema10;
import java.util.*;
/**
 *Este programa te despliega los primeros n numeros de la sucesion de fibonacci
 * @author JorgeRicardo
 */
public class Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // num es el numero de números de la sucesión que quieres que se despliegen
    int num;
    num=pedirNum();
    muestraNum(num);//Aqui se forman y despliegan la sucesion de fibonacci
     }
     public static int pedirNum(){
     int n;//aqui pido un numero 
     System.out.print("Ingresa cuantos numeros de la sucesión fibonacci quieres: " ); 
     Scanner teclado = new Scanner(System.in);
     n=teclado.nextInt();
     while (n==1){/*si me da 1 le digo cual es el primer digito de 
                  la sucesion y le pido que pida otro número*/
     System.out.print("Si solo quieres conocer el primer número de la sucesión fibonacci es 0 si no" );
         System.out.println("");
     System.out.print("Ingresa la cantidad de numeros que quieres: " ); 
     n=teclado.nextInt();
     }
     return n;
     }
     public static void muestraNum(int num){
     int f1=1,f2=1;
     System.out.println("Los primeros "+num+" números de la serie de Fibonacci son: ");
     System.out.print("0 "+f1+" ");/*por eso no se podria pedir solo un numero 
                                     de la sucesion por que al principio se 
                                     tienen que desplegar esos 2*/
     
     for(int i=2;i<num;i++){/*este proceso se hace un n numero 
                              de veces el que quiera el usuario*/
         
     System.out.print(f2+" ");/*aqui ya se van desplegando los demas numero 
                                de la sucesion*/
     f2 = f1 + f2;
     f1 = f2 - f1;
         }
     }
}
     