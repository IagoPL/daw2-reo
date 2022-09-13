// Para importar el escaner.
import java.util.Scanner;

public class Main {
    // Para permitir poder utilizar el escaner
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        // Mensaje que saldra al inicio del programa
        System.out.print("Hola, dime tu nombre");
        // Atributo que sera el nombre que hemos escrito por pantalla
        String nombre = teclado.nextLine();
        // Parte donde se hacen los pasos para mostrar un mensaje predeterminado segun el nombre escrito
        if (nombre.equals("Iago")) {
            System.out.println("Lo siento, no aceptamos amantes de linux aquí");
        } else if (nombre.equals("Bryan")){
            System.out.println("Bienvenido de nuevo, admin");
        } else {
            System.out.println("Nombre no registrado en la BDD, iniciando protocolo de llamar a la policia");
        }
    }
}
