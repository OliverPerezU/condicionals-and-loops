import java.util.Scanner;

public class Bisiestos {

    public static void main(String[] args) {
        int anio = solicitudAnio();
        System.out.println(esBisiesto(anio) ? "El año " + anio + " es bisiesto" : "El año " + anio + " no es bisiesto");
    }

    // Método para solicitar un número
    public static int solicitudAnio() {
        try {
            // Uso de librería para recibir un número por medio de la terminal
            Scanner scanner = new Scanner(System.in);
            // Mensaje para solicitud de ingreso de número al usuario
            System.out.print("Ingrese un año: ");
            // Declaración de variable y almacenamiento de número ingresado por el usuario
            int anio = scanner.nextInt();
            // Cierre de scanner
            scanner.close();
            // Retorno de número ingresado por el usuario
            return anio;
        } catch (Exception e) {
            // Si no se ingreso un número, se muestra un mensaje para ingresar nuevamente un
            // número
            System.out.println("Ingrese un año válido");
            return solicitudAnio();
        }
    }

    // Método para verificar si un año es bisiesto
    // Retorna 'true' si es bisiesto caso contrario retorna un 'false'
    public static boolean esBisiesto(int anio) {
        // Se evalua si el año es bisiesto dividiendo el año entre 4 y si el residuo es
        // 0 pasa a la siguiente validación para evaluar si el año no es divisible
        // dentro de 100, si es así, el año es bisiesto
        boolean validacion1 = (anio % 4 == 0 && anio % 100 != 0);

        // Si el año es divisible entre 400 y el residuo es cero el año es bisiesto
        boolean validacion2 = (anio % 400 == 0);

        // Retorna el resultado de alguna de la validacioness
        // Validación simplificada (anio % 400 == 0 && anio % 100 != 0) || anio % 4 == 0
        return validacion1 || validacion2;
    }

}
