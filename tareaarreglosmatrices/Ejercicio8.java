/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaarreglosmatrices;

import java.util.Scanner;

/**
 * @author Cristhian Joao Gorozabel Roldan
 */
public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int sumaDiagonal = 0;

        for (int fila = 0; fila < 4; fila++) {

            for (int columna = 0; columna < 4; columna++) {

                System.out.print("Ingrese el valor de la fila "
                        + fila + " y columna " + columna + ": ");

                matriz[fila][columna] = entrada.nextInt();
            }
        }

        System.out.println("\nElementos de la diagonal principal:");

        for (int i = 0; i < 4; i++) {
            System.out.println("Posicion [" + i + "][" + i + "]: "
                    + matriz[i][i]);

            sumaDiagonal = sumaDiagonal + matriz[i][i];
        }

        System.out.println("Suma de la diagonal principal: "
                + sumaDiagonal);

        entrada.close();
    }
}
