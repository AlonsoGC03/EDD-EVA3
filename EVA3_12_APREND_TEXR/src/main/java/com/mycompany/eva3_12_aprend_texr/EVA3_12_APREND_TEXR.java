/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_12_aprend_texr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ProBook
 */
public class EVA3_12_APREND_TEXR {

    public static void main(String[] args) {
        
        try {
            String ruta="D:\\archivos\\";
            writeUsingBufferedWriter(ruta,"PRUEBA");
        } catch (IOException ex) {
            Logger.getLogger(EVA3_12_APREND_TEXR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void writeUsingBufferedWriter(String ruta,String datos) throws IOException{
       
       File file= new File(ruta + "arhivoBufferedWriter.txt");
       FileWriter filewriter = new FileWriter(file,true);
       
        BufferedWriter bufWriter=new BufferedWriter(filewriter);
        for (int i = 0; i < 10; i++) {//escribimos 10 lineas almenos
            bufWriter.write((i+1)+""+datos);
            
            bufWriter.write("\n");
        }
        bufWriter.close();
        filewriter.close();
    }
}
