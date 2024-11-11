/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conteonum;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class App {

    public static void main(String[] args) {
    int n, numero, menores = 0 , iguales = 0, mayores = 0;
    Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa cantidad de numeros a analizar");
        n = teclado.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(i);
            System.out.println("Escribe el numero");
            numero = teclado.nextInt();
            if(numero == 0 ){
                iguales = iguales + 1;    
            }
            if(numero < 0){
                menores = menores + 1;
            }
            if(numero > 0){
                mayores = mayores + 1;
            }
        }
        System.out.println("Los numeros iguales a 0 son: ");
        System.out.println(iguales);
        System.out.println("Los numeros menores a 0 son: ");
        System.out.println(menores);
        System.out.println("Los numeros mayores a 0 son: ");
        System.out.println(mayores);
        
    }
}























