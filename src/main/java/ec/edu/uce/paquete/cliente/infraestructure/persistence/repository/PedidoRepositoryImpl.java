package ec.edu.uce.paquete.cliente.infraestructure.persistence.repository;

import ec.edu.uce.paquete.cliente.domain.model.Pedido;
import ec.edu.uce.paquete.cliente.domain.repository.PedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class PedidoRepositoryImpl implements PedidoRepository {

     @Inject 
    private EntityManager entityManager;

    @Override
    public void crear(Pedido pedido) {
        this.entityManager.persist(pedido);
    }

    @Override
    public Pedido read(Integer id) {
        return this.entityManager.find(Pedido.class, id);
    }

    @Override
    public void actualizar(Pedido pedido) {
        this.entityManager.merge(pedido);
    }

    @Override
    public void eliminar(Integer id) {
        Pedido pedido = this.read(id);
        this.entityManager.remove(pedido);
    }

}
