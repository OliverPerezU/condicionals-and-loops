import java.util.Scanner;

public class Dias {
    public static void main(String[] args) {
        int numero = solicitudNumero();
        validacionDia(numero);
    }

    // Método para solicitar un número
    public static int solicitudNumero() {
        try {
            // Uso de librería para solicitar un número
            Scanner scanner = new Scanner(System.in);
            // Mensaje para pedir ingreso de número al usuario
            System.out.print("Ingrese un número del 1 al 7: ");
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

    public static void validacionDia(int dia) {
        // Se utiliza un switch para comparar el número ingresado con los valores
        // correspondientes a cada día de la semana
        switch (dia) {
            case 1:
                System.out.println("El día es Lunes");
                break;
            case 2:
                System.out.println("El día es Martes");
                break;
            case 3:
                System.out.println("El día es Miércoles");
                break;
            case 4:
                System.out.println("El día es Jueves");
                break;
            case 5:
                System.out.println("El día es Viernes");
                break;
            case 6:
                System.out.println("El día es Sábado");
                break;
            case 7:
                System.out.println("El día es Domingo");
                break;
            default:
                System.out.println("El número ingresado no pertenece a un día de la semana");
                break;
        }
    }
}