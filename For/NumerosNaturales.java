public class NumerosNaturales {
    public static void main(String[] args) {
        impresionNumeros();
    }

    // Método para imprimir números naturaless
    public static void impresionNumeros() {
        System.out.println("Numeros naturales desde 1 hasta 10:");
        // Se inicia un ciclo for para imprimir los números naturales desde 1 hasta 10
        for (int i = 1; i <= 10; i++) {
            // Se imprime el número en pantalla en cada iteración del ciclo for
            System.out.println(i);
        }
    }
}