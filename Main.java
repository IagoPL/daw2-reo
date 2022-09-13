import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        String nombre = new String();
        System.out.print("Hola, dime tu nombre");
        nombre = teclado.nextLine();
        if (nombre.equals("Iago")) {
            System.out.println("Lo siento, no aceptamos amantes de linux aquí");
        } else if (nombre.equals("Bryan")){
            System.out.println("Bienvenido de nuevo, admin");
        } else {
            System.out.println("Nombre no registrado en la BDD, iniciando protocolo de llamar a la policia");
        }
    }
}