/*
 * Welcome Master.
 */
package Point1;

/**
 *
 * @author Johan
 */
public abstract class Person implements Obligaciones {
    
    protected String nombre;
    protected String apellido;
    protected double salario;

    public Person(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSalario() {
        return salario;
    }
    
    
    
    
    
}