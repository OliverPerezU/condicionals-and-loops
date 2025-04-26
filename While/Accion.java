
import java.util.Date;
import java.util.Scanner;

public class Accion {
    public static void main(String[] args) {
        // Se agrega la librería para obtener lo ingresado
        Scanner scanner = new Scanner(System.in);
        // Se agrega método para contar acciones
        contadorAcciones(scanner);
        // Se cierra el scanner
        scanner.close();
    }

    // Método para mostrar la fecha
    public static void muestraFecha() {
        // Se obtiene la fecha actual con el método 'new Date()'
        Date fechaActual = new Date();
        System.out.println("La fecha es: " + fechaActual);
    }

    public static void contadorAcciones(Scanner scanner) {
        // Se declara variable en la cual se guardaran el total de acciones del usuario
        int total = 0;
        // Se declara vairable a la cual esta manejara la activación del while
        boolean seguir = true;
        while (seguir) {
            // Muestra de fecha actual
            muestraFecha();
            String letra = obtenerLetra(scanner);
            // Se pregunta al usuario si desea continuar
            seguir = continuar(letra);
            // Se incrementa el total de acciones si la letra es "s"
            if (seguir) {
                total++;
            }
        }
        // Se imprime el total de acciones
        System.out.println("El usuario ha vuelto a realizar " + total + " acciones.");
    }

    public static boolean continuar(String letra) {
        // Valida si la letra ingresada es diferente de "s" para terminar el proceso
        if (!letra.equals("s")) {
            return false;
        }
        // Se retorna true para continuar el proceso
        return true;
    }

    // Método para devolver la letra ingresada
    public static String obtenerLetra(Scanner scanner) {
        // Mensaje para pedir la letra al usuario
        System.out.print("¿Deseas continuar? (s/n): ");
        // Se obtiene la letra ingresada
        String letra = scanner.next();
        // Se retorna la letra
        return letra;
    }
}
