/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contara;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class App {

    public static void main(String[] args) {
    String palabra;
    int letraA = 0, numeroL;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la palabra que quiera");
        palabra = teclado.nextLine();
        System.out.println("Ingresa el numero de letras que tiene la palabra");
        numeroL = teclado.nextInt();
        for (int i = 0; i < numeroL - 1; i++) {
            if( palabra.charAt(i) == 'a'){
            letraA = letraA + 1; 
            System.out.println("EL nuemro de letras A es: ");
            System.out.println(letraA);
            }
            
        }
    }
}
