package ec.edu.uce.paquete.cliente.infraestructure.persistence.repository;

import ec.edu.uce.paquete.cliente.domain.model.Empleado;
import ec.edu.uce.paquete.cliente.domain.repository.EmpleadoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;

@ApplicationScoped 
public class EmpleadoRepositoryImpl implements EmpleadoRepository{

    @Inject 
    private EntityManager entityManager;

    @Override
    public void crear(Empleado empleado) {
        this.entityManager.persist(empleado);
    }

    @Override
    public Empleado read(Integer id) {
        return this.entityManager.find(Empleado.class, id);
    }

    @Override
    public void actualizar(Empleado empleado) {
        this.entityManager.merge(empleado);
    }

    @Override
    public void eliminar(Integer id) {
        Empleado empleado = this.read(id);
        this.entityManager.remove(empleado);
        
    }

}
