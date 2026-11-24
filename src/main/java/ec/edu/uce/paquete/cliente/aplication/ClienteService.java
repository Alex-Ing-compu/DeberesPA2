package ec.edu.uce.paquete.cliente.aplication;

import ec.edu.uce.paquete.cliente.domain.model.Cliente;
import ec.edu.uce.paquete.cliente.domain.repository.ClienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class ClienteService {

    @Inject 
    private ClienteRepository clienteRepository;

    public void guardar(Cliente cliente){
        this.clienteRepository.crear(cliente);
    }

    public  Cliente buscarPorId(Integer id){
        return this.clienteRepository.read(id);
    }

    public void actualizar(Cliente cliente){
        this.clienteRepository.actualizar(cliente);
    }

    public void eliminar(Integer id){
        this.clienteRepository.eliminar(id);
    }

}
