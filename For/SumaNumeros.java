
import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        // Se pide un número al usuario
        int numero = peticionNumero();
        // Se realiza la sumatoria de los números
        sumatoria(numero);
    }

    // Método para pedir un número al usuario y verificar que sea entero
    public static int peticionNumero() {
        try {
            // Solicita número al usuario
            Scanner scanner = new Scanner(System.in);
            // Muestra mensaje para ingreso de un número
            System.out.print("Ingrese un número entero: ");
            // Se almacena el número ingresado por el usuario
            int numero = scanner.nextInt();
            // Cierra el scanner
            scanner.close();
            // Retorna el número ingresado por el usuario
            return numero;
        } catch (Exception e) {
            System.out.println("Debe ingresar un número entero");
            // Vuelve a pedir un número al usuario
            return peticionNumero();
        }
    }

    // Método para realizar sumatoria
    public static void sumatoria(int numero) {
        // Se declara variable para almacenar la sumatoria de los numeros
        int sumatoria = 0;
        // Se inicia un ciclo for para sumar los números desde 1 hasta el número
        // ingresado
        for (int i = 0; i <= numero; i++) {
            // Se suma el número en cada iteración del ciclo for
            sumatoria += i;
        }
        // Se imprime la sumatoria en pantalla
        System.out.println("La sumatoria de los números es: " + sumatoria);
    }
}