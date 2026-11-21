/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaarreglosmatrices;

import java.util.Scanner;

/**
 * @author Cristhian Joao Gorozabel Roldan
 */
public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int suma = 0;

        for (int fila = 0; fila < 4; fila++) {

            for (int columna = 0; columna < 4; columna++) {

                System.out.print("Ingrese el valor de la fila "
                        + fila + " y columna " + columna + ": ");

                matriz[fila][columna] = entrada.nextInt();
                suma = suma + matriz[fila][columna];
            }
        }

        System.out.println("Suma total de los elementos: " + suma);

        entrada.close();
    }
}