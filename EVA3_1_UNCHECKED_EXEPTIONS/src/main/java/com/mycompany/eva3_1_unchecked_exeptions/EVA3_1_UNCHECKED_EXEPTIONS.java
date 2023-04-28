/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_1_unchecked_exeptions;

import java.util.Scanner;

/**
 *
 * @author Alonso
 */
public class EVA3_1_UNCHECKED_EXEPTIONS {

    public static void main(String[] args) {
        /*System.out.println("iniciar programa");
        System.out.println("declarando variables");
        int x = 5, y = 0;
        System.out.println("intentar la divicion");
        int resu = x / y;// aqui se genera la excepcion
                        //si no se atiende el programa se termina.
        System.out.println("Resultado:  " + resu);//ya no se ejecute*/
        //inputmismatch exeption
        Scanner input = new Scanner(System.in);
        System.out.println("introduce un numero");
        int nume = input.nextInt();//si el usuario captura una cadena que no se puede enumerar se crea una excepcion y termina el programa
        
        System.out.println("el numero es : " + nume);
        
        //
        int[]arreglo = new int [5];//arreglo con 5 pociciones
        arreglo[0]=100;
        arreglo[1]=200;
        arreglo[2]=300;
        arreglo[3]=400;
        arreglo[4]=500;
        arreglo[5]=600;//<--? 5  no es un indice valido
       Prueba objprueba = null;//el objeto no existe
        System.out.println("valor de x = " + objprueba.x);
        
    }
}
class Prueba{
    int x = 100;
}