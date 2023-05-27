/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva3_10_estructura_archivos_txt;

import java.io.BufferedWriter;
import java.io.File;
import static java.io.FileDescriptor.out;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Logger;

/**
 *
 * @author ProBook
 */
public class EVA3_10_ESTRUCTURA_archivos_TXT {

    public static void main(String[] args) {
      String ruta="D:\\archivos\\";
      try{
      writeUsingFiles(ruta,"prueba de escritura de archivos");
      writeUsingFileWriter(ruta,"prueba de escrritura wirter");
     writeUsingBufferedWriter(ruta,"prueba de escritura buffered");
      
      }catch(IOException ex){
          Logger.getLogger(EVA3_10_ESTRUCTURA_archivos_TXT.class.getName());          
      }
    }
    public static void writeUsingFiles(String ruta,String datos) throws IOException{
        Path path=Paths.get(ruta+"arhivosFiles.txt");
        Files.write(path,datos.getBytes());
    }
    public static void writeUsingFileWriter(String ruta,String datos) throws IOException{
        File file=new File(ruta+"archivoFileWriter.txt");
            FileWriter filewriter=new FileWriter(file);
            filewriter.append(datos);
            filewriter.close();
    }
    public static void writeUsingBufferedWriter(String ruta,String datos) throws IOException{
       Path path=Paths.get(ruta+"arhivoBufferedWriter.txt");
        OutputStream out= Files.newOutputStream(path);
        OutputStreamWriter osWriter = new OutputStreamWriter(out);
        BufferedWriter bufWriter=new BufferedWriter(osWriter);
        for (int i = 0; i < 10; i++) {//escribimos 10 lineas almenos
            bufWriter.write((i+1)+""+datos);
            
            bufWriter.write("\n");
        }
        bufWriter.close();
        osWriter.close();
    }
            
}
