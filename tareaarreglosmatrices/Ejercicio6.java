/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaarreglosmatrices;

import java.util.Scanner;

/**
 * @author Cristhian Joao Gorozabel Roldan
 */
public class Ejercicio6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[3][4];

        for (int fila = 0; fila < 3; fila++) {

            for (int columna = 0; columna < 4; columna++) {

                System.out.print("Ingrese el valor de la fila "
                        + fila + " y columna " + columna + ": ");

                matriz[fila][columna] = entrada.nextInt();
            }
        }

        System.out.println("\nMatriz ingresada:");

        for (int fila = 0; fila < 3; fila++) {

            for (int columna = 0; columna < 4; columna++) {
                System.out.print(matriz[fila][columna] + "\t");
            }

            System.out.println();
        }

        entrada.close();
    }
}
