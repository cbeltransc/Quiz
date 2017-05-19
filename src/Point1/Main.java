/*
 * Welcome Master.
 */
package Point1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Johan
 */
public class Main {

    public static String descifrar(String cifrado) {
        String s = cifrado;
        int[] desencriptando = new int[s.length()];
        char[] encriptado = new char[s.length()];

        for (int j = 0; j < s.length(); j++) {
            encriptado[j] = s.charAt(j);
        }
        char[] abc = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for (int j = 0; j < s.length(); j++) {
            for (int k = 0; k < 26; k++) {
                if (encriptado[j] == abc[k]) {
                    desencriptando[j] = k;
                }
            }
        }
        for (int j = 0; j < s.length(); j++) {
            switch (desencriptando[j]) {
                case 0:
                    desencriptando[j] = 23 % 26;
                    break;
                case 1:
                    desencriptando[j] = 24 % 26;
                    break;
                case 2:
                    desencriptando[j] = 25 % 26;
                    break;
                default:
                    desencriptando[j] = (desencriptando[j] - 3) % 26;
                    break;
            }

        }

        for (int j = 0; j < s.length(); j++) {
            for (int k = 0; k < 26; k++) {
                if (desencriptando[j] == k) {
                    encriptado[j] = abc[k];

                }
            }
        }
        s = String.valueOf(encriptado);
        return s;
    }

    public static void main(String[] args) throws FileNotFoundException {
        String[] datos = new String[6];
        double salario;
        double[] salarios = new double[3];
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
                    Student student1 = new Student(descifrar(datos[1]), descifrar(datos[2]), salario, descifrar(datos[3]));
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
                    Faculty faculty1 = new Faculty(descifrar(datos[1]), datos[2], datos[3], descifrar(datos[4]), descifrar(datos[5]), salario);
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
                    Staff staff1 = new Staff(descifrar(datos[1]), datos[2], datos[3], descifrar(datos[4]), descifrar(datos[5]), salario);
                    System.out.println(staff1.listarInfo());
                    salarios[2] = staff1.calcularSalario();

            }

        }System.out.println("Salario total de todos los integrantes de la universidad : "+(salarios[0]+salarios[1]+salarios[2]));

    }

}
