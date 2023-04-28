/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_try_catch;

/**
 *
 * @author Alonso
 */
public class EVA3_3_TRY_CATCH {

    public static void main(String[] args) {
        int x = 5, y = 0;
        try {
            //seccion de codigo que potencial mente genera una excepxion
        int resu = x/y;
        System.out.println("resultado = " + resu);
        }catch(ArithmeticException e){//se genera un objeto excepcion llamado e
            System.out.println("se produjo un error:  " + e.getMessage());
        }
        System.out.println("programa terminado");
    }
}
