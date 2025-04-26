import java.util.Date;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        opciones();
        int opcion = solicitudNumero();
        validacionMenu(opcion);
    }

    // Método muestra de opciones del menú
    public static void opciones() {
        System.out.println("---- Menú ----");
        System.out.println("1. Bienvenida");
        System.out.println("2. Fecha Actual");
        System.out.println("3. Salir");
    }

    // Método para solicitar un número
    public static int solicitudNumero() {
        try {
            // Uso de librería para solicitar un número
            Scanner scanner = new Scanner(System.in);
            // Mensaje para pedir ingreso de número al usuario
            System.out.print("Ingrese un número: ");
            // Se declara una variable para almacenar el número ingresado
            int numero = scanner.nextInt();
            // Se cierra el scanner
            scanner.close();
            // Se retorna el número ingresado
            return numero;
        } catch (Exception e) {
            System.out.println("Debe ingresar un número entero");
            return solicitudNumero();
        }
    }

    public static void validacionMenu(int opcion) {
        // Se utiliza un switch para comparar el número ingresado con los valores
        // correspondientes
        switch (opcion) {
            case 1:
                System.out.println("¡Bienvenido!");
                break;
            case 2:
                System.out.println("La fecha es: " + obtenerFecha());
                break;
            case 3:
                System.out.println("\nSaliendo... ¡Hasta luego!");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }

    // Método para obtener la fecha actual
    public static Date obtenerFecha() {
        // Se utiliza el método 'new Date()' para obtener la fecha actual
        return new Date();
    }

}
