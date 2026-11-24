package ec.edu.uce.paquete.cliente.infraestructure.persistence.repository;

import ec.edu.uce.paquete.cliente.domain.model.Cliente;
import ec.edu.uce.paquete.cliente.domain.repository.ClienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class ClienteRepositoryImpl implements ClienteRepository{

    @Inject 
    private EntityManager entityManager;

    @Override
    public void crear(Cliente cliente) {
        this.entityManager.persist(cliente);
    }

    @Override
    public Cliente read(Integer id) {
        return this.entityManager.find(Cliente.class, id);
    }

    @Override
    public void actualizar(Cliente cliente) {
        this.entityManager.merge(cliente);
    }

    @Override
    public void eliminar(Integer id) {
        Cliente cliente = this.read(id);
        this.entityManager.remove(cliente);
    }

}
