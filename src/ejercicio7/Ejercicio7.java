/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;


public class Ejercicio7 {


    public static void main(String[] args) {
        double A, B;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un valor de A:");
        A = teclado.nextDouble();

        System.out.println("Ingrese un valor de B:");
        B = teclado.nextDouble();

        if (A > B) {
            System.out.println("A es mayor que B");
        } 
        else if (A == B) {
             
            System.out.println("A es igual que B");
            } else {
                System.out.println("A es menor que B");

            }
        }

    }

