import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        sumar();
    }

    // Método para sumar de números
    public static void sumar() {
        // Declaración de variable para guardar la suma de los números
        int sumatoria = 0;
        // Declaración de variable para guardar el número ingresado
        int ingresado = ingresoNumero();
        // Mientras el número ingresado sea mayor o igual a 0 va a volver a solicitar un
        // número para sumar
        while (ingresado >= 0) {
            // En esta operación se suma el número ingresado a la sumatoria, la expresión +=
            // se refiere a que la operación es igual a sumatoria + ingresado
            sumatoria += ingresado;
            // Se vuelve a solicitar un número
            ingresado = ingresoNumero();
        }

        // Luego de ingresar un número negativo se imprime la sumatoria
        System.out.println("La suma de los números es: " + sumatoria);
    }

    // Método para ingresar número
    public static int ingresoNumero() {
        try {
            // Librería para obtenr un número
            Scanner scanner = new Scanner(System.in);
            // Mensaje para ingreso de datos
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();
            return numero;
        } catch (Exception e) {
            System.out.println("Ingresa un número válido.");
            return ingresoNumero();
        }
    }

}