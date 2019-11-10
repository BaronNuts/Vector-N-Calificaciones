package ejemplo3vector;
import java.util.Scanner;
/*Programa  que crea un vector para leer n calificaciones de un alumno, calcular su
su promedio y mostrar las calificaciones iguales o mayores a 90, realizar 3 recorrridos del vector
e imprimir las calificaciones igual o mayores a 90
*/
public class Ejemplo3Vector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,s=0;
        double prom;
        System.out.println("Cuántas calificaciones son?");
        n=sc.nextInt();
        double cal[]=new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Deme la calificAción "+i);
            cal[i]=sc.nextDouble();
            s+=cal[i];
            if (cal[i]>=90) {
                System.out.println("La calificación "+i+" es mayor o igual a 90 "+cal[i]);
            }   
        }
        prom=s/n;
        System.out.println("Tu promedio es de: "+prom);
    }
}
