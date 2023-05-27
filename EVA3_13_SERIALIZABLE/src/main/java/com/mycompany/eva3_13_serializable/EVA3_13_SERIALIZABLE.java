/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_13_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alonso
 */
public class EVA3_13_SERIALIZABLE {

    public static void main(String[] args) throws IOException {
        try{
        String ruta = "C:\\archivos\\archivosObjetos.per";
        persona per = new persona ("juan","perez",10);
        //guardar objeto
        guardarObj(per,ruta);
        //leer objeto
        persona resu = leerObj(ruta);
            System.out.println("nombre" +  resu.getNombre());
            System.out.println("apellido" + resu.getApellido());
            System.out.println("edad" + resu.getEdad());
        }catch (IOException){
           Logger.getLogger(EVA3_13_SERIALIZABLE.class.getName()).log(Level.SEVERE, null,ex);
        }catch(ClassNotFoundException){
            Logger.getLogger(EVA3_13_SERIALIZABLE.class.getName());
        }

    }
    public static void guardarObj(persona per, String ruta) throws IOException{
        FileOutputStream foStream = new FileOutputStream(ruta);
        ObjectOutputStream ooStream = new ObjectOutputStream(foStream); 
        ooStream.writeObject(per);
        ooStream.close();
        
    }
    public static persona leerObj(String ruta) throws IOException, ClassNotFoundException{
        persona per = null;
        FileInputStream fiStream = new FileInputStream(ruta);
        ObjectInputStream oiStream = new ObjectInputStream(fiStream); 
        per =(persona)oiStream.readObject();
        return per;
    }
}
class persona implements Serializable{
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

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}