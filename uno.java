/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class uno {
    public static void main(String[] args) {
        //variables
        int [] v;//vector
        int k;//tamaño del vector
        int l;//leer vector
        int m;//elemento de la ultima posicion
        int n;//recorrer el vector
        
        //lectura por consola
        Scanner leer = new Scanner(System.in);
        
        //inicializacion
        System.out.print("Ingrese le tamaño del vector");
        k = leer.nextInt();
        v = new int[k];
        
        //leer vector
        for (l = 0; l < v.length; l++) {
            System.out.print("Ingrese la posicion " + l + " del vector:");
            v[l] = leer.nextInt();
        }
        
        //inicializacion
        m = k - 1;
        
        //proceso
        for (n = 0; n < (k/2); n++) {
            int pos = v[n];
            v[n] = v[m];
            v[m] = pos;
            m--;
        }
        
        //escribir vector
        for (int i = 0; i < v.length; i++) {
            System.out.println("El elemento de  la posicion " + l + " del vector:" + v[i]);
        }
    }
}
