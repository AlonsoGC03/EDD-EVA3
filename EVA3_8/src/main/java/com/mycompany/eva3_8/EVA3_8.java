/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8; 

/**
 *
 * @author Alonso
 */
public class EVA3_8 {

    public static void main(String[] args) throws DatoIncorrectoCheckedEx {
        persona per = new persona();
        per.setNombre("maicol");
        per.setApellido("yacson");
        try{
        per.setEdad(-50);
        }catch (DatoIncorrectoCheckedEx e){
            System.out.println(e.getMessage());
        }
    }
}
class persona{
    private String nombre;
    private String apellido;
    private int edad;

    public persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoIncorrectoCheckedEx {
        if (edad<0)
            //throw new DatoIncorrectoException(); unchecked exception
            throw new DatoIncorrectoCheckedEx();
        this.edad = edad;
    }
    
}
class DatoIncorrectoException extends RuntimeException{

    public DatoIncorrectoException() {
        super("Dato incorrecto!! El valor introducido no puede ser negativo");
    }
    
}
class DatoIncorrectoCheckedEx extends Exception{

    public DatoIncorrectoCheckedEx() {
        super("Dato incorrecto!! El valor introducido no puede ser negativo");
        

    }
    
}