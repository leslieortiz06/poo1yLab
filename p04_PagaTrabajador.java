// Calcular la paga de un trabajador 

import java.util.Scanner;

public class p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa, impuesto, pagabruta, paganeta;
        Scanner obj = new Scanner(System.in);
        //Entrada
        System.out.println("Nombre del Trabajador: "); nombre = obj.nextLine();
        System.out.println("Horas Trabajadas: "); horas = obj.nextInt();
        System.out.println("Paga x Horas: "); paga = obj.nextFloat();
        tasa = 0.03;
        //Calculo
        pagabruta = horas * paga;
        impuesto = pagabruta * tasa;
        paganeta = pagabruta - impuesto;
        //Salida
        System.out.println("\nResumen de pagos\n");
        System.out.println(String.format("El trabajador %s, tarbajo %d horas, a una paga de %.2f pesos la hora, con una tasa de impuesto de %.2f",nombre,horas,paga,tasa));
        System.out.println(String.format("Paga Bruta = %.2f",pagabruta));
        System.out.println(String.format("Impuestos = %.2f",impuesto));
        System.out.println(String.format("Paga Neta = %.2f",paganeta));
    }
}
