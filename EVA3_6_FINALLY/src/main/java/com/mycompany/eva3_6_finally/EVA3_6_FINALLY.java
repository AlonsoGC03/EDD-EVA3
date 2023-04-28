/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_finally;

/**
 *
 * @author Alonso
 */
public class EVA3_6_FINALLY {

    public static void main(String[] args) {
        int x = 5, y = 5;
        try{
            int resu = x/y;
            
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("siempre me ejecute");
        }
    }
}
