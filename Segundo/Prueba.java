import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
String nombre= "Miguel Angel";
        System.out.println("mi nombre es: "+ nombre);
        System.out.println("mi nombre es: "+ nombre); // copiar y pegar Ctrl + D
        System.out.println("mi nombre es: "+ nombre.toUpperCase());
        LocalDate hoy= LocalDate.now(); //el ide automaticamente te importa la api que necesitas
        int a=5;
        int b=6;
        int c=a+b;
        System.out.println("El valor de c es "+c);
        c= c-a; //c=6 -> la variable puede cambiar de valor mientras se ejecuta un programa
            System.out.println("Ahora c vale " +c);
            // CONSTANTES -> al valor una vez declarado no cambia mientras se ejecuta el programa//
            final int MAYORDEEDAD= 18;
            //MAYORDEEDAD=4; el numero de la CONSTANTE es el que no cambia, el numero final//
            //el numero VARIABLE es el que puede ir cambiando su valor//
            LocalTime hora= LocalTime.now();
            System.out.println("La hora es " + hora);
            Double calculo=Math.pow(5,3); //
            System.out.println(calculo);
            //para calcular la raiz cuadrada de un número es Math.sqrt(numero)
        Double raizcuadrada=Math.sqrt(16); //raiz cuadrada= 4
        System.out.println("La raiz cuadrada de 16 es " + raizcuadrada);
        System.out.println(); //con ln hay salto de línea
        System.out.print(""); // no hay salto de linea
        /* Entrada de datos por consola con la Clase Scanner*/
        Scanner entrada=new Scanner(System.in);
//        System.out.println("Indica tu nombre ->");
//        // la siguiente linea lo que indica es que los que escriba el usuario se guardara en la variable NombreUsuario
//        String nombreUsuario=entrada.nextLine();
//        short edad= entrada.nextShort();
//        System.out.println("Tu edad es "+ edad);
//        int nuevaEdad= edad+1;
//        short anioNac=entrada.nextShort();
//        short edadCalculada= (short) (2024 -anioNac);
//        System.out.println("Tu edad calculada es "+edadCalculada+ "años");

        System.out.print("Indica el precio del artículo -> ");
        Double precio= entrada.nextDouble();




    }
}
