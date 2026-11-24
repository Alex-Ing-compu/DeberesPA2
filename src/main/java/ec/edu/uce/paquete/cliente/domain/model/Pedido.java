package ec.edu.uce.paquete.cliente.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table(name="pedido")
public class Pedido {

    @Id 
    @SequenceGenerator(name="pedi_seq", sequenceName="pedi_seq_db", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="pedi_seq")
    @Column(name="pedi_id")
    private Integer id;
    @Column(name="pedi_nombre")
    private String nombre;
    @Column(name="pedi_precio")
    private Double precio;
    @Column(name="pedi_stock")
    private Integer stock;
    @Column(name="pedi_categoria")
    private String categoria;

    public Pedido(){

    }
    public Pedido(String categoria, String nombre, Double precio, Integer stock) {
        this.categoria = categoria;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    

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

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String toString() {
        return "Pedido [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", categoria="
                + categoria + "]";
    }

   
}
