package Actividades;
import java.util.Scanner;

public class p52_Numeros1aN {
    public static void main(String[] args) {
        int n, p; 
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();

        System.out.println("Numeros de 1 a n con paso de p\n");
        System.out.print("Hasta donde?: ");
        n = obj.nextInt();
        System.out.print("\nPaso?: ");
        p = obj.nextInt();

        for (int i = 1; i < n; i+=p) {
            System.out.printf("%d ", i);
        }
    }
} 
