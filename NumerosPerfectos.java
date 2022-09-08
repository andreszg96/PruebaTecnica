/*
 * @author 
 * Andrés Zapata Gallego
 * Tecnico en sistemas
 */
import java.util.Scanner;

public class NumerosPerfectos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int desde, hasta, suma = 0;
        System.out.print("Escoja el rango desde: ");
        desde = leer.nextInt();
        System.out.print("Escoja el rango hasta: ");
        hasta = leer.nextInt();
        System.out.print("Los numeros perfectos del " + desde 
                         + " hasta el " + hasta + " son: ");
        for (int i = desde; i <= hasta; i++) { //Ciclo para el rango
            suma = 0;                          //Se reinicia la uma
            for (int j = 1; j < i; j++) {      //Ciclo para comprobar divisores
                if (i % j == 0) {              //Se comprueban residuos
                    suma = suma + j;
                }
            }
            if ((suma) == i && i != 1) {       //Se verifica valor total de suma
                System.out.print((suma) + " ");
            }
        }

        System.out.println("");
    }
}
