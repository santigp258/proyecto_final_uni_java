package Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "hijos_empleados")
public class HijoEmpleado extends Model {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "empleado_id")
    private int empleadoId;

    public HijoEmpleado(String nombre, Date fechaNacimiento, int empleadoId) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.empleadoId = empleadoId;
    }

    public HijoEmpleado() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HijoEmpleado{");
        sb.append("id=").append(id);
        sb.append(super.toString());
        sb.append("nombre=").append(nombre);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", empleadoId=").append(empleadoId);
        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
