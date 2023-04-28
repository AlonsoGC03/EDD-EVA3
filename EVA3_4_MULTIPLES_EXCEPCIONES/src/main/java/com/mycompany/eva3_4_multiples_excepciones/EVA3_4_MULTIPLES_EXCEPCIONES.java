/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_multiples_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Alonso
 */
public class EVA3_4_MULTIPLES_EXCEPCIONES {

    public static void main(String[] args) {
        int x, y;
        do{
            try{
                Scanner input = new Scanner (System.in);
                System.out.println("introduce el valor de X (numero entero)");
                x = input.nextInt();
                System.out.println("introduce el valor de Y (numero entero)");
                y = input.nextInt();
                int re = x / y;
                System.out.println("resutado de  " + x + "/" + y + ":" + re);
                break;
            }catch(InputMismatchException e){
                System.out.println("captura de formato incorrecta,  nose puede convertir a formato numerico");
            }catch(ArithmeticException e){
                System.out.println("no se puede dividir entre 0");
            }
        }while(true);
        System.out.println("programa terminado");
    }
}
