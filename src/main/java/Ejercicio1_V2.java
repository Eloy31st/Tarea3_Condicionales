public class Ejercicio1_V2 {
   /* Modificar el algoritmo anterior para mostrar un mensaje según la temperatura:

    Temperatura

            Mensaje

    t < 2

    Riesgo de hielo

2 ≤ t < 15

    Hace frío

15 ≤ t < 30

    Buena temperatura

    t ≥ 30

    Demasiado calor

    */
    public static void main(String[] args) {
        int temperatura = 1;
        if (temperatura < 2) {
            System.out.println("Riesgo de hielo");
        } else if (temperatura < 15) {
            System.out.println("Hace frío");
        } else if (temperatura < 30) {
            System.out.println("Buena temperatura");
        } else {
            System.out.println("Demasiado calor");
        }
    }
}
