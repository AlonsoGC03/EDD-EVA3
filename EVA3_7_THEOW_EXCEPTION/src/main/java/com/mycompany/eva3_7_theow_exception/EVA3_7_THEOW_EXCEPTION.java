/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_theow_exception;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alonso
 */
public class EVA3_7_THEOW_EXCEPTION {

    public static void main(String[] args) {
        
        do{
            try {
                Scanner input = new Scanner (System.in);
                System.out.println("introduce un valor (positivo)");
                int valor = input.nextInt();
                prueba obj = new prueba();
                obj.setValor(valor);
                break;
                //objeto no existe fuera del bloque try
            } catch (Exception ex) {//es la super calse de las excepciones por lo que cubre todas la excepciones
                
                System.out.println(ex.getMessage());
            }
        }while(true);
    }
}
class prueba{
    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) throws Exception {

        if (valor<0)
            throw new Exception("el valor " + valor + "  es invalido. deve ser mayor o igual a 0");
        else
        this.valor = valor;
    }
    
}