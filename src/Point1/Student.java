/*
 * Welcome Master.
 */
package Point1;

/**
 *
 * @author Johan
 */
public class Student extends Person {

    private String status;

    public Student(String nombre, String apellido, double salario, String status) {
        super(nombre, apellido, salario);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String listarInfo() {
       return "Estudiante "+this.getNombre()+" "+this.getApellido()+", con status "+this.getStatus()+""
               + " y salario "+this.getSalario();
    }

    @Override
    public double calcularSalario() {
        return this.getSalario();
    }

}
