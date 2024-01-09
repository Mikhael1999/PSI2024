package unidad1;

import java.util.Scanner;

public class Actividad1_2 {
    public static void main(String[] args) {
        int num=23; //en la variable num guardaremos el número que se introduzca
        System.out.print("Escriba un número: "); //salida por consola: mensaje
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt(); //entrada por consola
        //ahora mostraremos el valor de la variable num
        System.out.println("Valor introducido: " + num); //salida: mensaje +
        //variable. Utilizando + podemos concatenar en la salida por consola
        //tantos mensajes y variables como necesitemos
    }
}
