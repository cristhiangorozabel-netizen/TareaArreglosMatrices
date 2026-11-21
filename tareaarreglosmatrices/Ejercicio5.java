/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaarreglosmatrices;

import java.util.Scanner;

/**
 * @author Cristhian Joao Gorozabel Roldan
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[12];
        int numero;

        for (int i = 0; i < 12; i++) {

            do {
                System.out.print("Ingrese un numero positivo para la posicion "
                        + i + ": ");
                numero = entrada.nextInt();
            } while (numero <= 0);

            numeros[i] = numero + i;
        }

        System.out.println("\nArreglo modificado:");

        for (int i = 0; i < 12; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        }

        entrada.close();
    }
}