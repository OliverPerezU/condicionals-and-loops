import java.util.Scanner;

public class Enteros {
    public static void main(String[] args) {
        System.out.println("\033[H\033[2J");
        System.out.flush();
        int numero = solicitudNumero();
        validationNumber(numero);

    }

    // Método para solicitar un número
    public static int solicitudNumero() {
        try {
            // Uso de libreía para recibir un número por medio de la terminal
            Scanner scanner = new Scanner(System.in);
            // Mensaje para solicitud de ingreso de número al usuario
            System.out.print("Ingrese un número: ");
            // Declaración de variable y almacenamiento de número ingresado por el usuario
            int numero = scanner.nextInt();
            // Cierre de la lectura de la terminal para asegurarse de que no se bloquee
            scanner.close();
            // Retorno del número ingresado
            return numero;

        } catch (Exception e) {
            // Si no se ingreso un número, se muestra un mensaje para ingresar nuevamente un
            // número
            System.out.println("Error: Ingrese un número válido.");
            return solicitudNumero();
        }
    }

    public static void validationNumber(int number) {
        if (number > 0) {
            System.out.println("El número ingresado es positivo: " + number);
        } else if (number < 0) {
            System.out.println("El número ingresado es negativo: " + number);
        } else {
            System.out.println("El número ingresado es cero: " + number);
        }
    }
}