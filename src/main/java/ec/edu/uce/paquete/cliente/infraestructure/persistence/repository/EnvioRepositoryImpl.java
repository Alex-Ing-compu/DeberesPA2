package ec.edu.uce.paquete.cliente.infraestructure.persistence.repository;

import ec.edu.uce.paquete.cliente.domain.model.Empleado;
import ec.edu.uce.paquete.cliente.domain.model.Envio;
import ec.edu.uce.paquete.cliente.domain.repository.EnvioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class EnvioRepositoryImpl implements EnvioRepository{

    @Inject 
    private EntityManager entityManager;

    @Override
    public void crear(Envio envio) {
         this.entityManager.persist(envio);
    }

    @Override 
    public Envio read(Integer id) {
        return this.entityManager.find(Envio.class, id);
    }

    @Override
    public void actualizar(Envio envio) {
       this.entityManager.merge(envio);
    }

    @Override
    public void eliminar(Integer id) {
         Envio envio = this.read(id);
        this.entityManager.remove(envio);
    }

}
