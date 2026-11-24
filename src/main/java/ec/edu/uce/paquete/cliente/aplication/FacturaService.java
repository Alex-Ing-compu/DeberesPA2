package ec.edu.uce.paquete.cliente.aplication;

import ec.edu.uce.paquete.cliente.domain.model.Factura;
import ec.edu.uce.paquete.cliente.domain.repository.FacturaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class FacturaService {

    @Inject 
    private FacturaRepository facturaRepository;

    public void guardar(Factura factura){
        this.facturaRepository.crear(factura);
    }

    public Factura buscarPorId(Integer id){
        return this.facturaRepository.read(id);
    }

    public void actualizar(Factura factura){
        this.facturaRepository.actualizar(factura);
    }

    public void eliminar(Integer id){
        this.facturaRepository.eliminar(id);
    }

    
}
