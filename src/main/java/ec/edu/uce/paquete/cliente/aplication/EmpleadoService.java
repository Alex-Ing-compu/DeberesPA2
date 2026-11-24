package ec.edu.uce.paquete.cliente.aplication;

import ec.edu.uce.paquete.cliente.domain.model.Empleado;
import ec.edu.uce.paquete.cliente.domain.repository.EmpleadoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class EmpleadoService {

    @Inject 
    private EmpleadoRepository empleadoRepository;

    public void guardar(Empleado empleado){
        this.empleadoRepository.crear(empleado);
    }

    public Empleado buscarPorId(Integer id){
        return this.empleadoRepository.read(id);
    }

    public void actualizar(Empleado empleado){
        this.empleadoRepository.actualizar(empleado);
    }

    public void eliminar(Integer id){
        this.empleadoRepository.eliminar(id);
    }

}
