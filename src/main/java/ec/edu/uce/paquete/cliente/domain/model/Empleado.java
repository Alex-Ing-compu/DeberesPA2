package ec.edu.uce.paquete.cliente.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table(name="empleado")
public class Empleado {

    @Id 
    @SequenceGenerator(name="empleado_seq", sequenceName="empleado_seq_db", allocationSize=1) 
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="empleado_seq") 
    @Column(name="empl_id")
    private Integer id;
    @Column(name="empl_cedula")
    private String cedula;
    @Column(name="empl_nombre")
    private String nombre;
    @Column(name="empl_cargo")
    private String cargo;
    @Column(name="empl_sueldo")
    private Double sueldo;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", cargo=" + cargo + ", sueldo="
                + sueldo + "]";
    }
    
    
}
