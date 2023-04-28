/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_capturar_datos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EVA3_5_CAPTURAR_DATOS {

    public static void main(String[] args) {
        int valor;
        do{
            try{
                Scanner input = new Scanner (System.in);
                System.out.println("introduce un valor (numero entero)");
                valor = input.nextInt();
                break;
            }catch(InputMismatchException e){
                System.out.println("el valor es erroneo ,el valor no se puede convertir a numero");
            }
        }while(true);
        System.out.println("el valor capturado es: " +valor);
    }
}
