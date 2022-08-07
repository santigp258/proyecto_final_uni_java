package Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleados_habilidades")
public class EmpleadosHabilidades extends Model {

    @Column(name = "empleado_id")
    private int empleadoId;

    @Column(name = "habilidad_id")
    private int habilidadId;

    public EmpleadosHabilidades(int empleadoId, int habilidadId) {
        this.empleadoId = empleadoId;
        this.habilidadId = habilidadId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EmpleadoHabilidad{");
        sb.append(super.toString());
        sb.append("empleadoId=").append(empleadoId);
        sb.append(", habilidadId=").append(habilidadId);
        sb.append('}');
        return sb.toString();
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public int getHabilidadId() {
        return habilidadId;
    }

    public void setHabilidadId(int habilidadId) {
        this.habilidadId = habilidadId;
    }

}
