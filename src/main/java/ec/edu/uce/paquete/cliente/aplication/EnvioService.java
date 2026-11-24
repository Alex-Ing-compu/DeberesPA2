package ec.edu.uce.paquete.cliente.aplication;

import ec.edu.uce.paquete.cliente.domain.model.Envio;
import ec.edu.uce.paquete.cliente.domain.repository.EnvioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional
public class EnvioService {

    @Inject 
    private EnvioRepository envioRepository;

    public void guardar(Envio envio){
        this.envioRepository.crear(envio);
    }

    public Envio buscarPorId(Integer id){
        return this.envioRepository.read(id);
    }

    public void actualizar(Envio envio){
        this.envioRepository.actualizar(envio);
    }

    public void eliminar(Integer id){
        this.envioRepository.eliminar(id);
    }
}
