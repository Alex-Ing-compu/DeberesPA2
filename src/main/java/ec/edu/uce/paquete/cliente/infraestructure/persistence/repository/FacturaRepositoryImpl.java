package ec.edu.uce.paquete.cliente.infraestructure.persistence.repository;

import ec.edu.uce.paquete.cliente.domain.model.Factura;
import ec.edu.uce.paquete.cliente.domain.repository.FacturaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class FacturaRepositoryImpl implements FacturaRepository{

     @Inject 
    private EntityManager entityManager;

    @Override
    public void crear(Factura factura) {
        this.entityManager.persist(factura);
    }

    @Override
    public Factura read(Integer id) {
        return this.entityManager.find(Factura.class, id);
    }
    
    @Override
    public void actualizar(Factura factura) {
        this.entityManager.merge(factura);
    }

    @Override
    public void eliminar(Integer id) {
         Factura factura = this.read(id);
        this.entityManager.remove(factura);
    }

}
