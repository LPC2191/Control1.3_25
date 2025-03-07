//uvus:lpc2191
//pass:1741335161

package us.dit;

public class Control {

    public static void main(String[] args) {
        int n = 10; // Número de términos que quieres generar en la sucesión

        System.out.println("Sucesión de Fibonacci hasta el término " + n + ":");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Método recursivo para calcular el enésimo término de la sucesión de Fibonacci
    public static int fibonacci(int num) {
        if (num <= 1) {
            return num;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
