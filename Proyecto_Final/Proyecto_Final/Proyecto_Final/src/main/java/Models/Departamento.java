package Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamentos")
public class Departamento extends Model {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "presu_anual")
    private Double presuAnual;

    @Column(name = "centro_id")
    private int centroId;

    public Departamento(String nombre, Double presuAnual, int centroId) {
        this.nombre = nombre;
        this.presuAnual = presuAnual;
        this.centroId = centroId;
    }

    public Departamento() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Departamento{");
        sb.append(super.toString());
        sb.append(", id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", presuAnual=").append(presuAnual);
        sb.append(", centroId=").append(centroId);
        sb.append('}');
        return sb.toString();
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

    public Double getPresuAnual() {
        return presuAnual;
    }

    public void setPresuAnual(Double presuAnual) {
        this.presuAnual = presuAnual;
    }

    public int getCentroId() {
        return centroId;
    }

    public void setCentroId(int centroId) {
        this.centroId = centroId;
    }

}
