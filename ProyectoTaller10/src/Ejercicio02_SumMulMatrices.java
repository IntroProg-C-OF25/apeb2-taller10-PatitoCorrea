
import java.util.Scanner;

/***
 *Dadas dos matrices (cuadradas y/o rectangulares) de valores enteros aleatorios, desarrollar su procesamiento para calcular y presentar:
 *La suma de las dos matrices (considerar las restricciones matemáticas para ello).
 *La multiplicación de las dos matrices (considerar las reglas matemáticas para ello).
 */
public class Ejercicio02_SumMulMatrices {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.print("Número de filas de la Matriz 1: ");
        int filas1 = tcl.nextInt();
        System.out.print("Número de columnas de la Matriz 1: ");
        int columnas1 = tcl.nextInt();
        System.out.print("Número de filas de la Matriz 2: ");
        int filas2 = tcl.nextInt();
        System.out.print("Número de columnas de la Matriz 2: ");
        int columnas2 = tcl.nextInt();
        int[][] matriz1 = new int[filas1][columnas1];
        int[][] matriz2 = new int[filas2][columnas2];
        System.out.println("Llenando la Matriz 1");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Llenando la Matriz 2");
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                matriz2[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println("Matriz 1:");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                System.out.print(matriz1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Matriz 2:");
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.print(matriz2[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("");
        if (filas1 == filas2 && columnas1 == columnas2) {
            System.out.println("Suma de las matrices:");
            int[][] suma = new int[filas1][columnas1];
            for (int i = 0; i < filas1; i++) {
                for (int j = 0; j < columnas1; j++) {
                    suma[i][j] = matriz1[i][j] + matriz2[i][j];
                    System.out.print(suma[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("No se pueden sumar las matrices porque tienen diferentes dimensiones.");
        }
        System.out.println("");
        if (columnas1 == filas2) {
            System.out.println("Multiplicación de las matrices:");
            int[][] producto = new int[filas1][columnas2];
            for (int i = 0; i < filas1; i++) {
                for (int j = 0; j < columnas2; j++) {
                    producto[i][j] = 0;
                    for (int k = 0; k < columnas1; k++) {
                        producto[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                    System.out.print(producto[i][j] + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("No se pueden multiplicar las matrices porque sus dimensiones son incompatibles.");
        }
    }
}
/***
 * Número de filas de la Matriz 1: 3
Número de columnas de la Matriz 1: 3
Número de filas de la Matriz 2: 3
Número de columnas de la Matriz 2: 3
Llenando la Matriz 1
Llenando la Matriz 2
Matriz 1:
8	2	8	
9	2	7	
2	8	7	

Matriz 2:
4	1	3	
0	2	7	
5	8	8	

Suma de las matrices:
12	3	11	
9	4	14	
7	16	15	

Multiplicación de las matrices:
72	76	102	
71	69	97	
43	74	118	
 */

