/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaarreglosmatrices;

import java.util.Scanner;

/**
 * @author Cristhian Joao Gorozabel Roldan
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][5];
        int numero;

        for (int fila = 0; fila < 3; fila++) {

            for (int columna = 0; columna < 5; columna++) {

                System.out.print("Ingrese el valor de la fila "
                        + fila + " y columna " + columna + ": ");

                numero = entrada.nextInt();

                matriz[fila][columna]
                        = numero + (fila * columna);
            }
        }

        System.out.println("\nMatriz modificada:");

        for (int fila = 0; fila < 3; fila++) {

            for (int columna = 0; columna < 5; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }

            System.out.println();
        }

        entrada.close();
    }
}
