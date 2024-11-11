/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.factorial;

import java.util.Scanner;

/**
 *
 * @author Valeria
 */
public class Factorial {

    public static void main(String[] args) {
    int n;
    double factorial = 1;
    Scanner teclado = new Scanner(System.in);
    do{
        System.out.println("Introduce un numero entero >= 0: ");
        n = teclado.nextInt();
        
    }while(n < 0);
    
    for(int i = 1; i <=n; i ++){
        factorial = factorial * i;
    }
        System.out.println(factorial);
    }
}
