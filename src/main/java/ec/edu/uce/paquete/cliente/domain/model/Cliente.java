package ec.edu.uce.paquete.cliente.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table(name="cliente")
public class Cliente {

    @Id 
    @SequenceGenerator(name="cliente_seq",sequenceName="cliente_seq_db",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cliente_seq")
    @Column(name="clie_id") 
    private Integer id;

    @Column(name="clie_nombre")
    private String nombre;

    @Column(name="clie_correo")
    private String correo;

    @Column(name="clie_telefono")
    private String telefono;

    @Column(name="clie_direccion")
    private String direccion;

    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
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
    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono
                + ", direccion=" + direccion + "]";
    }
    
    
}
