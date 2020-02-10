/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package felix;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class dos {

    public static void main(String[] args) {
        //variables
        double ventas[];//vector ventas
        int cVent;//cantidad de ventas
        double sum;//suma
        double prom;//promedio
        double vmay;//venta mayor
        double vmen;//venta menor
        int posMy;//posicion mayor
        int posMn;//posicion menor
        int vSProm;//contar promedios
        double vSPro[];//vector promedio superiores

        //lectura por consola
        Scanner leer = new Scanner(System.in);

        //inicializacion
        System.out.print("Ingrese numero de ventas:");
        cVent = leer.nextInt();
        ventas = new double[cVent];

        //leer ventas
        System.out.println("Registro de ventas");
        for (int i = 0; i < ventas.length; i++) {
            System.out.print("La venta " + (i + 1) + ":");
            ventas[i] = leer.nextInt();

        }

        //promedio de ventas
        sum = 0;

        for (int i = 0; i < ventas.length; i++) {
            sum = sum + ventas[i];//suma de ventas
        }

        prom = sum / ventas.length;

        System.out.println("La suma total de ventas:" + sum);
        System.out.println("El promedio de ventas:" + prom);

        //venta mayor y venta menor
        vmay = ventas[0];
        posMy = 0;
        vmen = ventas[0];
        posMn = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] > vmay) {
                vmay = ventas[i];
                posMy = i;
            } else {
                if (ventas[i] < vmen) {
                    vmen = ventas[i];
                    posMn = i;
                }
            }
        }

        System.out.println("La venta mayor:" + vmay);
        System.out.println("La venta menor:" + vmen);
        
        //ventas por encima del promedio}
        vSProm = 0;
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] >= prom) {
                vSProm++;
            }
        }
        
        vSPro = new double[vSProm];
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] >= prom) {
                for (int j = 0; j < vSPro.length; j++) {
                    vSPro[j] = ventas[i];
                }
            }
        }
        
        for (int i = 0; i < vSPro.length; i++) {
            System.out.print("Las ventas por encima del promedio:" + vSPro[i] + "\n");
        }
    }
}
