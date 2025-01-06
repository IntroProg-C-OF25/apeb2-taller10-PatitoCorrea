
import java.util.Scanner;

/***
 *El primer ciclo paralelo C, cuenta con 28 estudiantes, de los cuáles al finalizar el periodo, 
 * la Dirección de la carrera de Computación a solicitado las siguientes estadísticas de la materia INTRODUCCIÓN A LA PROGRAMACIÓN 
 * en función a los promedios por estudiante, dichos promedios se deben calcular (ponderar, ya que el docente ingresa todo sobre 10pts.) de 3 calificaciones 
 * (ACD que representa el 35% de la nota, APE del 35% y la nota del AA con un peso del 30%). En resumen, los requerimientos son los siguientes:
 *Registre los nombres de cada estudiante de dicho paralelo.
 *Genere aleatoriamente las notas ACD, APE, AA, para cada uno de los 28 estudiantes de 0-10 pts.
 *Calcule el promedio de cada uno de los estudiantes del paralelo dada la siguiente ponderación: ACD->35%, APE->35%, y el AA->30%.
 *Obtenga el promedio del curso, del paralelo C.
 *Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por encima del promedio del curso.
 *Liste los nombres de los estudiantes y su nota, que hayan obtenido un promedio por debajo del promedio del curso.
 *Muestre el estudiante con su calificación, si es el del mayor promedio (el más alto de la clase).
 *Muestre el estudiante con su calificación, si es el del menor promedio (el más bajo de la clase).
 */
public class Ejercicio03_Promedios {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int totalEstudiantes = 28;
        double sumaTotal = 0, promedioCurso;
        String[] nombres = new String[totalEstudiantes];
        double[] acd = new double[totalEstudiantes]; // ACD (35%)
        double[] ape = new double[totalEstudiantes]; // APE (35%)
        double[] aa = new double[totalEstudiantes];  // AA (30%)
        double[] promedios = new double[totalEstudiantes];
        System.out.println("Ingrese los nombres de los " + totalEstudiantes + " estudiantes:");
        for (int i = 0; i < totalEstudiantes; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            nombres[i] = tcl.nextLine();
        }
        for (int i = 0; i < totalEstudiantes; i++) {
            acd[i] = Math.random() * 10;
            ape[i] = Math.random() * 10;
            aa[i] = Math.random() * 10;
            promedios[i] = acd[i] * 0.35 + ape[i] * 0.35 + aa[i] * 0.30;
            sumaTotal += promedios[i];
        }
        promedioCurso = sumaTotal / totalEstudiantes;
        System.out.println("\nPromedio del curso: " + promedioCurso);
        System.out.println("\nEstudiantes por encima del promedio del curso:");
        for (int i = 0; i < totalEstudiantes; i++) {
            if (promedios[i] > promedioCurso) {
                System.out.println(nombres[i] + " - Promedio: " + promedios[i]);
            }
        }
        System.out.println("\nEstudiantes por debajo del promedio del curso:");
        for (int i = 0; i < totalEstudiantes; i++) {
            if (promedios[i] < promedioCurso) {
                System.out.println(nombres[i] + " - Promedio: " + promedios[i]);
            }
        }
        int indiceMayor = 0, indiceMenor = 0;
        for (int i = 1; i < totalEstudiantes; i++) {
            if (promedios[i] > promedios[indiceMayor]) {
                indiceMayor = i;
            }
            if (promedios[i] < promedios[indiceMenor]) {
                indiceMenor = i;
            }
        }
        System.out.println("\nEstudiante con el mayor promedio:");
        System.out.println(nombres[indiceMayor] + " - Promedio: " + promedios[indiceMayor]);

        System.out.println("\nEstudiante con el menor promedio:");
        System.out.println(nombres[indiceMenor] + " - Promedio: " + promedios[indiceMenor]);
    }
}
/***
 * Ingrese los nombres de los 28 estudiantes:
Estudiante 1: pepe
Estudiante 2: maria
Estudiante 3: carlos
Estudiante 4: jose
Estudiante 5: tinoco
Estudiante 6: pablo
Estudiante 7: cesar
Estudiante 8: rodrigo
Estudiante 9: benjamin
Estudiante 10: andres
Estudiante 11: david
Estudiante 12: rafael
Estudiante 13: patricio
Estudiante 14: tiago
Estudiante 15: cassandra
Estudiante 16: alexandra
Estudiante 17: sofia
Estudiante 18: jazmin
Estudiante 19: marcos
Estudiante 20: joaquin
Estudiante 21: alfonso
Estudiante 22: julian
Estudiante 23: eduardo
Estudiante 24: michael
Estudiante 25: jeremias
Estudiante 26: jeremy
Estudiante 27: salome
Estudiante 28: anita

Promedio del curso: 5.546166098067259

Estudiantes por encima del promedio del curso:
pepe - Promedio: 8.560820508522909
jose - Promedio: 7.300115348836692
pablo - Promedio: 7.639171432362202
cesar - Promedio: 5.7354990241446036
rodrigo - Promedio: 7.165518856410086
benjamin - Promedio: 5.640487347489881
andres - Promedio: 5.965256465856232
david - Promedio: 7.711351710644713
cassandra - Promedio: 6.730153616370721
alexandra - Promedio: 5.736293510372571
marcos - Promedio: 6.05380972853905
alfonso - Promedio: 5.561151138384547
michael - Promedio: 6.857842015265522
jeremias - Promedio: 5.710872905831804
salome - Promedio: 5.992456316645466
anita - Promedio: 7.106209878887659

Estudiantes por debajo del promedio del curso:
maria - Promedio: 4.693759599082487
carlos - Promedio: 4.802411922495485
tinoco - Promedio: 3.3863439246604177
rafael - Promedio: 5.45413740004333
patricio - Promedio: 5.071542923395487
tiago - Promedio: 3.7418211835278363
sofia - Promedio: 2.7321477549798274
jazmin - Promedio: 4.963142009787971
joaquin - Promedio: 5.298853874996109
julian - Promedio: 3.9105592152357795
eduardo - Promedio: 3.8681132027437592
jeremy - Promedio: 1.9028079303700616

Estudiante con el mayor promedio:
pepe - Promedio: 8.560820508522909

Estudiante con el menor promedio:
jeremy - Promedio: 1.9028079303700616
 */