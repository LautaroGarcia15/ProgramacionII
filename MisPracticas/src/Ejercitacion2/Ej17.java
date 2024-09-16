package Ejercitacion2;
import java.util.Scanner;

public class Ej17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero mayor que 1 y menor que 10: ");
        int numero = scanner.nextInt();

        if (numero > 1 && numero < 10) {
            System.out.println("Cuenta regresiva desde " + numero + ":");
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
        } else {
            System.out.println("El número ingresado no está dentro del rango permitido.");
        }
    }
}

