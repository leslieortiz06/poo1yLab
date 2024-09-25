package Actividades;
/**
 * p86_ArregloMostrar - Muestra un arreglo y lo eleva al cuadrado usando funciones
 */
public class p86_ArregloMostrar {
    public static void Mostrar(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static void Cuadrado(int[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * x[i];
        }
    }

    public static void main(String[] args) {
        int[] A = {2,4,6,8,10,12};
        int[] B = {1,3,5,7,11,13};

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.println("Arreglo A:");
        Mostrar(A);
        System.out.println("Arreglo B:");
        Mostrar(B);

        System.out.println("Arreglo A elevado al cuadrado");
        Cuadrado(A);
        Mostrar(A);
        System.out.println("Arreglo B elevado al cuadrado");
        Cuadrado(B);
        Mostrar(B);
    }
}