/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejemplo_1;

import java.util.Scanner;

/**
 *
 * @author onair
 */
public class Operaciones {
    
    public static void main(String [] args) {
        
        int a=0,b=0,resultado=0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        
        a=sc.nextInt();
        
        System.out.println("Ingrese otro numero: ");
        
        b=sc.nextInt();
        
        resultado = a + b;
        
        System.out.println("El resultado es: " +resultado);
        
    }
    
}
