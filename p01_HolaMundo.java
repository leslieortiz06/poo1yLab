// Envia un saludo a la pantalla

public class p01_HolaMundo {
    public static void main(String[] args) {
        String amiga = "Karla";
        String hermana = "Nancy";
        String mensaje = String.format("Tanto %s como %s desean aprender Java",amiga,hermana);

        System.out.println("Hola Mundo desde el Lenguaje Java");
        System.out.println("\nHola amigo " + amiga + " bienvenido a Java");
        System.out.println("\nMi amigo es " + amiga + " mi hermana es " + hermana);
        System.out.println("\n" + mensaje);
    }
}