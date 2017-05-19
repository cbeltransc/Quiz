/*
 * Welcome Master.
 */
package Point1;

/**
 *
 * @author Johan
 */
public abstract class Employee extends Person {
   protected String oficina;
   protected String fechaCreacion;

    public Employee(String oficina, String fechaCreacion, String nombre, String apellido, double salario) {
        super(nombre, apellido, salario);
        this.oficina = oficina;
        this.fechaCreacion = fechaCreacion;
    }

    public String getOficina() {
        return oficina;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }
   
   
}
