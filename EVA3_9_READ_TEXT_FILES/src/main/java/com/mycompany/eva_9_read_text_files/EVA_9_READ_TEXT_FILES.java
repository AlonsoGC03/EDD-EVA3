/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_9_read_text_files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Alonso
 */
public class EVA_9_READ_TEXT_FILES {

    public static void main(String[] args) {
        String ruta ="C:\\archivos\\prueba.txt";//windows
        try{
            readUsingFiles(ruta);//lee arcgivos completos
            readingUsingBufferedReading(ruta);//opcion para leer archivos de tecto
            readUsingFileReader(ruta);////conbinacion de archivos y buffer reader
            readUsingScanner(ruta);//scanner es una herramienta general para entradas(inputs)
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void readUsingFiles(String ruta)throws IOException{
        System.out.println("archivos usando fallas");
                
        Path path = Paths.get(ruta);
         List<String> contenidoArch=Files.readAllLines(path);
         for (int i = 0; i < contenidoArch.size(); i++) {
             System.out.println(contenidoArch.get(i));
        }
         //System.out.println(contenidoArch.toString());
    
       
}
 public static void readingUsingBufferedReading (String ruta) throws FileNotFoundException, IOException{
        System.out.println("");
        System.out.println("lectura de archivos usando buffered reader");
        File file = new File(ruta);//ruta del archivo
        FileInputStream is = new FileInputStream(file);//abre el archivo
        InputStreamReader isReader = new InputStreamReader(is);//lee el archivo como bites
        BufferedReader breader = new BufferedReader(isReader);//interpreta los bites como carapteres
        String line;
        while((line=breader.readLine()) !=null){
            System.out.println(line);
        }
        breader.close();
 }
    public static void readUsingFileReader(String ruta) throws IOException{
        System.out.println("");
        System.out.println("usando file reader");
        File file = new File(ruta);
        FileReader fileReader = new FileReader(file);
        BufferedReader breader = new BufferedReader(fileReader);//interpreta los bites como carapteres
        String line;
        while((line=breader.readLine()) !=null){
            System.out.println(line);
        }
        breader.close();
        fileReader.close();
    }
    public static void readUsingScanner(String ruta) throws IOException{
        System.out.println("");
        System.out.println("lectura de archivos usando scanner");
        Path source = Paths.get(ruta);
        Scanner scanner = new Scanner(source);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
