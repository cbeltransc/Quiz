/*
 * Welcome Master.
 */
package Point1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Johan
 */
public class Main {

   public static void main(String[] args) {
       Data u=new Data();
       
       try{
       u.leer();
       }catch(FileNotFoundException e){
           System.out.println("El archivo no existe.");
       }
       
        

    }
}