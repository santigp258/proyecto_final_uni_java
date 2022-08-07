package Models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "centro_de_trabajos")
public class CentroTrabajo extends Model {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "ciudad")
    private String ciudad;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "dirigente_id", nullable = true)
    private Integer dirigenteId = null;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Empleado dirigente;

    public CentroTrabajo(String nombre, String ciudad, String telefono, String direccion) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public CentroTrabajo() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CentroTrabajo{");
        sb.append(super.toString());
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", ciudad=").append(ciudad);
        sb.append(", telefono=").append(telefono);
        sb.append(", direccion=").append(direccion);
        sb.append(", dirigenteId=").append(dirigenteId);
        sb.append(", dirigente=").append(dirigente);
        sb.append('}');
        return sb.toString();
    }

    public Empleado getDirigente() {
        return dirigente;
    }

    public void setDirigente(Empleado dirigente) {
        this.dirigente = dirigente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getDirigenteId() {
        return dirigenteId;
    }

    public void setDirigenteId(Integer dirigenteId) {
        this.dirigenteId = dirigenteId;
    }

}
