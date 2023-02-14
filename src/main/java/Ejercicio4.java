import java.util.Scanner;

public class Ejercicio4 {
    /*Sabiendo que:

Para cocinar 500 gramos de carne de vacuno, se necesita:

10 minutos si quieres una cocción casi cruda

17 minutos si quieres una cocción al punto

25 minutos si quieres una cocción bien hecha

Para cocinar 400 gramos de cordero se necesita:

15 minutos si quieres una cocción casi cruda

25 minutos si quieres una cocción al punto

40 minutos si quieres una cocción bien hecha

El tiempo de cocción es proporcional al peso.

Dependiendo de la información introducida por el usuario (tipo de carne, modo de cocción y peso), mostrar el tiempo de cocción de una carne en segundos.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Qué carne quieres cocinar? (vacuno, cordero)");
        String carne = scanner.nextLine();
        System.out.println("¿Cómo quieres cocinarla? (crudo, punto, bien)");
        String coccion = scanner.nextLine();
        System.out.println("¿Cuántos gramos de carne quieres cocinar?");
        int peso = scanner.nextInt();
        int tiempo = 0;
        switch (carne) {
            case "vacuno":
                switch (coccion) {
                    case "crudo":
                        tiempo += 10 * (peso / 500);
                        System.out.println(tiempo * 60 + " segundos");
                        break;
                    case "punto":
                        tiempo += 17 * (peso / 500);
                        System.out.println(tiempo * 60 + " segundos");
                        break;
                    case "bien":
                        tiempo += 25 * (peso / 500);
                        System.out.println(tiempo * 60 + " segundos");
                        break;
                    default:
                        System.out.println("Modo de cocción no válido");
                        break;
                }
                break;
            case "cordero":
                switch (coccion) {
                    case "crudo":
                        tiempo += 15 * (peso / 400);
                        System.out.println(tiempo * 60 + " segundos");
                        break;
                    case "punto":
                        tiempo += 25 * (peso / 400);
                        System.out.println(tiempo * 60 + " segundos");
                        break;
                    case "bien":
                        tiempo += 40 * (peso / 400);
                        System.out.println(tiempo * 60 + " segundos");
                        break;
                    default:
                        System.out.println("Modo de cocción no válido");
                        break;
                }
                break;
            default:
                System.out.println("Carne no válida");
                break;
        }
    }
}
