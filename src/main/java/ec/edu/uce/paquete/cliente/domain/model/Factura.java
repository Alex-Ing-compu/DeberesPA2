package ec.edu.uce.paquete.cliente.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table(name="factura")
public class Factura {

    @Id 
    @SequenceGenerator(name="factura_seq", sequenceName="factura_seq_db", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="factura_seq")
    @Column(name="fact_id")
    private Integer id;
    @Column(name="fact_ruc")
    private String ruc;
    @Column(name="fact_subtotal")
    private Double subtotal;
    @Column(name="fact_iva")
    private Double iva;
    @Column(name="fact_total_pagar")
    private Double totalPagar;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(Double totalPagar) {
        this.totalPagar = totalPagar;
    }

    @Override
    public String toString() {
        return "Factura [id=" + id + ", ruc=" + ruc + ", subtotal=" + subtotal + ", iva=" + iva + ", totalPagar="
                + totalPagar + "]";
    }

    
    
}
