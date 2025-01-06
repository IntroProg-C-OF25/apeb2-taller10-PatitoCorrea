
/** *
 *Dada una matriz cuadrada (m X m) de valores enteros aleatorios, desarrollar su procesamiento para presentar los elementos:
 * De la diagonal principal.
 * De la diagonal segundaria.
 * Ubicados bajo la diagonal principal.
 * Ubicados sobre la diagonal principal.
 * Ubicados bajo la diagonal secundaria.
 * Ubicados sobre la diagonal secundaria.
 *
 * @author patito
 */
import java.util.Scanner;

public class Ejercicio01_RecorridoMatrices {

    public static void main(String[] args) {
        int Tmatriz = 0;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme el Tamaño de la matriz: ");
        Tmatriz = tcl.nextInt();
        int matriz[][] = new int[Tmatriz][Tmatriz];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("DIAGONAL PRINCIPAL OBVIA:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("DIAGONAL PRINCIPAL EFICIENTE:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + "\t");
        }
        System.out.println("");
        System.out.println("DIAGONAL SECUNDARIA OBVIA:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i + j) == matriz.length - 1) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("DIAGONAL SECUNDARIA EFICIENTE:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][matriz.length - 1 - i] + "\t");
        }
        System.out.println("");
        System.out.println("BAJO LA DIAGONAL PRINCIPAL:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i > j) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("BAJO LA DIAGONAL PRINCIPAL EFICIENTE:");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("");
        System.out.println("SOBRE LA DIAGONAL PRINCIPAL:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j > i) {
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("SOBRE LA DIAGONAL PRINCIPAL EFICIENTE:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("");
        System.out.println("BAJO LA DIAGONAL SECUNDARIA:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i + j > matriz.length - 1) { 
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        System.out.println("BAJO LA DIAGONAL SECUNDARIA EFICIENTE:");
        for (int i = 1; i < matriz.length; i++) {
            for (int j = matriz.length - i; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("");
        System.out.println("SOBRE LA DIAGONAL SECUNDARIA:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i + j < matriz.length - 1) { 
                    System.out.print(matriz[i][j] + "\t");
                }
            }
        }
        System.out.println("");
        
        System.out.println("SOBRE LA DIAGONAL SECUNDARIA EFICIENTE:");
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz.length - 1 - i; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
        }
        System.out.println("");
    }
}
/***
 * Deme el Tamaño de la matriz: 3
5	3	5	
7	8	9	
6	6	9	

DIAGONAL PRINCIPAL OBVIA:
5	8	9	
DIAGONAL PRINCIPAL EFICIENTE:
5	8	9	
DIAGONAL SECUNDARIA OBVIA:
5	8	6	
DIAGONAL SECUNDARIA EFICIENTE:
5	8	6	
BAJO LA DIAGONAL PRINCIPAL:
7	6	6	
BAJO LA DIAGONAL PRINCIPAL EFICIENTE:
7	6	6	
SOBRE LA DIAGONAL PRINCIPAL:
3	5	9	
SOBRE LA DIAGONAL PRINCIPAL EFICIENTE:
3	5	9	
BAJO LA DIAGONAL SECUNDARIA:
9	6	9	
BAJO LA DIAGONAL SECUNDARIA EFICIENTE:
9	6	9	
SOBRE LA DIAGONAL SECUNDARIA:
5	3	7	
SOBRE LA DIAGONAL SECUNDARIA EFICIENTE:
5	3	7	
 */
