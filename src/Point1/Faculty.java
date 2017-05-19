/*
 * Welcome Master.
 */
package Point1;

/**
 *
 * @author Johan
 */
public class Faculty extends Employee {

    private String rango;

    public Faculty(String rango, String oficina, String fechaCreacion, String nombre, String apellido, double salario) {
        super(oficina, fechaCreacion, nombre, apellido, salario);
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    @Override
    public String listarInfo() {
       return "Empleados tipo Faculty : "+this.getNombre()+" "+this.getApellido()+", con el rango  "+this.getRango()+"\n"
               + "Su oficina es la "+this.getOficina()+", fecha de contratacion "+this.getFechaCreacion()+", salario: "+this.getSalario();
    }

    @Override
    public double calcularSalario() {
        return this.getSalario();
    }

}
