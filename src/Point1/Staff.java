/*
 * Welcome Master.
 */
package Point1;

/**
 *
 * @author Johan
 */
public class Staff extends Employee{
    
    private String titulo;

    public Staff(String titulo, String oficina, String fechaCreacion, String nombre, String apellido, double salario) {
        super(oficina, fechaCreacion, nombre, apellido, salario);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    
    
    

    @Override
    public String listarInfo() {
        return "Empleados tipo Staff : "+this.getNombre()+" "+this.getApellido()+", con el titulo de "+this.getTitulo()+""
                + "Su oficina es la "+this.getOficina()+", fecha de contratacion "+this.getFechaCreacion()+", salario : "+this.getSalario();
    }

    @Override
    public double calcularSalario() { //Misma clase gerente??
        return this.getSalario();
    }
    
}
