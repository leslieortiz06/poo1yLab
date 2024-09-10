/**
 * pe01_PrimerExamenParcial
 */
import java.util.Scanner;

public class pe01_PrimerExamenParcial {
    public static void main(String[] args) {
        String nombre;
        int edad, totalDin, alumnosC, docentesC, trabajadoresC, rechazados, aceptados, cobro;
        char resp, sexo, tipoPar;
        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        totalDin = rechazados = aceptados = cobro = 0;
        alumnosC = 40;
        docentesC = 60;
        trabajadoresC = 80; 

        System.out.print("Dame tu nombre: ");
        nombre = obj.nextLine();
        System.out.print("Dame tu edad  : ");
        edad = obj.nextInt();
        System.out.print("Dame tu sexo [H] o [M]: ");
        sexo = obj.next().charAt(0);
        sexo = Character.toUpperCase(sexo);
        System.out.print("Dame el tipo de participante [A]lumno  [D]ocente  [T]rabajador: ");
        tipoPar = obj.next().charAt(0);
        tipoPar = Character.toUpperCase(tipoPar);

        if (edad < 23) {
            rechazados++;
        } 

        if (sexo == 'M') {
            
        } else {
            
        }

        if (tipoPar == 'A') {
            cobro += alumnosC;
        } else if (tipoPar == 'D') {
            cobro += docentesC;
        } else if (tipoPar == 'T') {
            cobro += trabajadoresC;
        }


        /*if (totalDin < 50) {
            System.out.println("El evento concluye con ganancias BAJAS");
        } else if (totalDin > 50 & totalDin <1000) {
            System.out.println("El evento concluye con ganancias MODERADAS");
        } else if (totalDin > 1000) {
            System.out.println("El evento concluye con BUENAS ganancias.");
        }**/
    }
}