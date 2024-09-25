package Practicas;
/**
 * p91_MayoresPromedio
 */

import java.util.Scanner;

public class p91_MayoresPromedio {

    public static void Mostrar(float[] x) {
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            System.out.print("Calificaciones: ");
            System.out.print(x[i] + " ");
        }
    }

    public static void guardarCalificaciones(Scanner obj, float[] cal, int n) {
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Calificación " + (i + 1) + ": ");
            cal[i] = obj.nextFloat();
        }
    }

    public static float Suma(float[] cals) {
        float suma = 0;
        for (float cal : cals) {
            suma += cal;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Scanner obj = new Scanner(System.in);
        
        System.out.print("Cuantas calificaciones vas a ingresar?: ");
        int n = obj.nextInt();
        float [] cal = new float[n];

        guardarCalificaciones(obj, cal, n);
        Mostrar(cal);
    }
}