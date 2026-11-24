package ec.edu.uce.paquete.cliente.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table(name="envio")
public class Envio {

    @Id 
    @SequenceGenerator(name="envio_seq", sequenceName="envio_seq_db", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="envio_seq")
    @Column(name="envi_id")
    private Integer id;

    @Column(name="envi_empresa_transporte")
    private String empresaTransporte;

    @Column(name="envi_numero_guia")
    private String numeroGuia;

    @Column(name="envi_fecha_estimada")
    private String fechaEstimada;
    
    @Column(name="envi_estado_envio")
    private String estadoEnvio;
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpresaTransporte() {
        return empresaTransporte;
    }

    public void setEmpresaTransporte(String empresaTransporte) {
        this.empresaTransporte = empresaTransporte;
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public void setNumeroGuia(String numeroGuia) {
        this.numeroGuia = numeroGuia;
    }

    public String getFechaEstimada() {
        return fechaEstimada;
    }

    public void setFechaEstimada(String fechaEstimada) {
        this.fechaEstimada = fechaEstimada;
    }

    public String getEstadoEnvio() {
        return estadoEnvio;
    }

    public void setEstadoEnvio(String estadoEnvio) {
        this.estadoEnvio = estadoEnvio;
    }

    @Override
    public String toString() {
        return "Envio [id=" + id + ", empresaTransporte=" + empresaTransporte + ", numeroGuia=" + numeroGuia
                + ", fechaEstimada=" + fechaEstimada + ", estadoEnvio=" + estadoEnvio + "]";
    }
    
    
}
