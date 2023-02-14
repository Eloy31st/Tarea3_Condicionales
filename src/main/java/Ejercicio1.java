import java.util.Scanner;

public class Ejercicio1 {
    /* Escriba un algoritmo que muestre "riesgo de hielo", si la temperatura introducida es inferior a 2°C.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la temperatura: ");
        int temperatura = scanner.nextInt();
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        }
    }
}
