import java.util.Scanner;

public class Ejercicio5 {
    /*Mostrar la nómina simplificada de un empleado a partir de la información introducida. El salario bruto depende de la cantidad de horas trabajadas y su tarifa por hora:

Las horas inferiores a 169 horas se pagan aplicando su tarifa horaria.

Las horas comprendidas entre 169 y 180 horas se pagan aplicando un incremento del 50 % sobre su tarifa horaria.

Las horas superiores a 180 horas se pagan aplicando un incremento del 60 %.

La prima familiar se calcula de la siguiente manera:

1 hijo: 20 €

2 hijos: 50 €

Por encima de 2 hijos : 70 € +20 € por cada hijo adicional

A continuación se muestra un ejemplo de posibles visualizaciones y entradas durante una ejecución del algoritmo (los valores introducidos por el usuario están escritos en negrita y cursiva):

¿Apellido de la persona?

Camino

¿Nombre de la persona?

Gerardo

¿Puesto?

1 - Agente de servicio

2 - Empleado de oficina

3 - Directivo

1

Número de horas trabajadas

190

¿Tarifa horaria?

9,76

¿Número de hijos?

4

Nómina de Gerardo Camino

Estado : Agente de servicio

Salario bruto: 1.966,64 € (169 horas sin incremento, 11 horas con incremento del 50 %, 10 horas con incremento del 60 %)

Cálculo de deducciones:

Contribución para el pago de la deuda social y contingencias comunes imponible

1.966,64 € × 3,49 % = 68,64 €

Contribución de contingencias comunes no imponible

1.966,64 € × 6,15 % = 120,95 €

Seguro médico

1.966,64 € × 0,95 % = 18,68 €

Fondo de pensiones

1.966,64 € × 8,44 % = 165,98 €

Seguro de desempleo

1.966,64 € × 3,05 % = 59,98 €

Pensión complementaria (Entidad privada)

1.966,64 € × 3,81 % = 74,93 €

Contribución de jubilación anticipada

1.966,64 € × 1,02 % = 20,06 €

Deducciones totales de los empleados: 529,22 €

Salario neto: 1.437,42 €

Prima familiar: 110 €

Salario neto a pagar: 1.547,42 €

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Apellido de la persona?");
        String apellido = scanner.nextLine();
        System.out.println("¿Nombre de la persona?");
        String nombre = scanner.nextLine();
        System.out.println("¿Puesto?");
        System.out.println("1 - Agente de servicio\n2 - Empleado de oficina\n3 - Directivo");
        int puesto = scanner.nextInt();
        System.out.println("Número de horas trabajadas");
        int horas = scanner.nextInt();
        System.out.println("¿Tarifa horaria?");
        double tarifa = scanner.nextDouble();
        System.out.println("¿Número de hijos?");
        int hijos = scanner.nextInt();
        double salarioBruto = 0;
        double salarioNeto = 0;
        double deducciones = 0;
        double primaFamiliar = 0;
        double salarioNetoPagar = 0;
        String estado = "";
        if (horas < 169) {
            salarioBruto = horas * tarifa;
        } else if (horas >= 169 && horas <= 180) {
            salarioBruto = (169 * tarifa) + ((horas - 169) * (tarifa * 1.5));
        } else if (horas > 180) {
            salarioBruto = (169 * tarifa) + ((horas - 180) * (tarifa * 1.6)) + (((horas - 169) - (horas-180)) * (tarifa * 1.5));
        }
        switch (puesto) {
            case 1:
                estado = "Agente de servicio";
                break;
            case 2:
                estado = "Empleado de oficina";
                break;
            case 3:
                estado = "Directivo";
                break;
            default:
                estado = "Puesto no válido";
                break;
        }
        if (hijos == 1) {
            primaFamiliar = 20;
        } else if (hijos == 2) {
            primaFamiliar = 50;
        } else if (hijos > 2) {
            primaFamiliar = 70 + ((hijos - 2) * 20);
        }
        deducciones = (salarioBruto * 0.0349) + (salarioBruto * 0.0615) + (salarioBruto * 0.0095) + (salarioBruto * 0.0844) + (salarioBruto * 0.0305) + (salarioBruto * 0.0381) + (salarioBruto * 0.0102);
        salarioNeto = salarioBruto - deducciones;
        salarioNetoPagar = salarioNeto + primaFamiliar;
        System.out.println("Nómina de " + nombre + " " + apellido);
        System.out.println("Estado : " + estado);
        System.out.println("Salario bruto: " + salarioBruto + " € (" + (horas - (horas - 169)) + " horas sin incremento, " + ((horas - 169)-(horas-180)) + " horas con incremento del 50 %, " + (horas - 180) + " horas con incremento del 60 %)");
        System.out.println("Cálculo de deducciones:");
        System.out.println("Contribución para el pago de la deuda social y contingencias comunes imponible");
        System.out.println(salarioBruto + " € × 3,49 % = " + (salarioBruto * 0.0349) + " €");
        System.out.println("Contribución de contingencias comunes no imponible");
        System.out.println(salarioBruto + " € × 6,15 % = " + (salarioBruto * 0.0615) + " €");
        System.out.println("Seguro médico");
        System.out.println(salarioBruto + " € × 0,95 % = " + (salarioBruto * 0.0095) + " €");
        System.out.println("Fondo de pensiones");
        System.out.println(salarioBruto + " € × 8,44 % = " + (salarioBruto * 0.0844) + " €");
        System.out.println("Seguro de desempleo");
        System.out.println(salarioBruto + " € × 3,05 % = " + (salarioBruto * 0.0305) + " €");
        System.out.println("Pensión complementaria (Entidad privada)");
        System.out.println(salarioBruto + " € × 3,81 % = " + (salarioBruto * 0.0381) + " €");
        System.out.println("Contribución de jubilación anticipada");
        System.out.println(salarioBruto + " € × 1,02 % = " + (salarioBruto * 0.0102) + " €");
        System.out.println("Deducciones totales de los empleados: " + deducciones + " €");
        System.out.println("Salario neto: " + salarioNeto + " €");
        System.out.println("Prima familiar: " + primaFamiliar + " €");
        System.out.println("Salario neto a pagar: " + salarioNetoPagar + " €");
    }
}
