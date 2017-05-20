/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Point1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Data {
    String[] datos = new String[6];
    Codigo c=new Codigo();
    double salario;
    double[] salarios = new double[3];
    public void leer() throws FileNotFoundException{
        double suma=0;
        Scanner input = new Scanner(new File("datos.txt"));
        input.useDelimiter(",");
        datos[0] = input.next();
        while (input.hasNext()) {

            switch (datos[0]) {
                case "STUDENT":
                    datos[1] = input.next();
                    datos[2] = input.next();
                    datos[3] = input.next();
                    salario = input.nextDouble();
                    Student student1 = new Student(c.descifrar(datos[1]), c.descifrar(datos[2]), salario, c.descifrar(datos[3]));
                    System.out.println(student1.listarInfo());
                    salarios[0] = student1.calcularSalario();
                    datos[0] = input.next();

                case "FACULTY":

                    datos[1] = input.next();
                    datos[2] = input.next();
                    datos[3] = input.next();
                    datos[4] = input.next();
                    datos[5] = input.next();
                    salario = input.nextDouble();
                    Faculty faculty1 = new Faculty(c.descifrar(datos[1]), datos[2], datos[3], c.descifrar(datos[4]), c.descifrar(datos[5]), salario);
                    System.out.println(faculty1.listarInfo());
                    salarios[1] = faculty1.calcularSalario();
                    datos[0] = input.next();

                case "STAFF":
                    datos[1] = input.next();
                    datos[2] = input.next();
                    datos[3] = input.next();
                    datos[4] = input.next();
                    datos[5] = input.next();
                    salario = input.nextDouble();
                    Staff staff1 = new Staff(c.descifrar(datos[1]), datos[2], datos[3], c.descifrar(datos[4]), c.descifrar(datos[5]), salario);
                    System.out.println(staff1.listarInfo());
                    salarios[2] = staff1.calcularSalario();
                    
            }
        }
         for (int i = 0; i < salarios.length; i++) {
            suma+=salarios[i];
        }
        System.out.println("La suma de los salarios de los miembros de toda la Universidad es:" +suma);
        
    }

}