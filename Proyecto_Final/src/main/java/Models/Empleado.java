package Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "empleados")
public class Empleado extends Model {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(name = "telefono")
    private String telefono;

    @Column(name = "fecha_entrada")
    private Date fechaEntrada;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "dire_residencia")
    private String dirResidencia;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "estado_civil")
    private String estadoCivil;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "num_hijos")
    private int numHijos;

    @Column(name = "salario_mensual")
    private double salarioMensual;

    @Column(name = "departamento_id")
    private int departamentoId;

    public Empleado(String telefono, Date fechaEntrada,
            String nombre, String dirResidencia, String sexo, String estadoCivil,
            Date fechaNacimiento, int numHijos, double salarioMensual, int departamentoId) {
        this.telefono = telefono;
        this.fechaEntrada = fechaEntrada;
        this.nombre = nombre;
        this.dirResidencia = dirResidencia;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
        this.numHijos = numHijos;
        this.salarioMensual = salarioMensual;
        this.departamentoId = departamentoId;
    }

    public Empleado() {

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("id=").append(id);
        sb.append(super.toString());
        sb.append(", telefono=").append(telefono);
        sb.append(", fechaEntrada=").append(fechaEntrada);
        sb.append(", nombre=").append(nombre);
        sb.append(", dirResidencia=").append(dirResidencia);
        sb.append(", sexo=").append(sexo);
        sb.append(", estadoCivil=").append(estadoCivil);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", numHijos=").append(numHijos);
        sb.append(", salarioMensual=").append(salarioMensual);
        sb.append(", departamentoId=").append(departamentoId);

        sb.append('}');
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirResidencia() {
        return dirResidencia;
    }

    public void setDirResidencia(String dirResidencia) {
        this.dirResidencia = dirResidencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public int getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(int departamentoId) {
        this.departamentoId = departamentoId;
    }

}
