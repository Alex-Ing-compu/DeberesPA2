package ec.edu.uce.paquete.cliente.aplication;

import ec.edu.uce.paquete.cliente.domain.model.Pedido;
import ec.edu.uce.paquete.cliente.domain.repository.PedidoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped 
@Transactional 
public class PedidoService {

    @Inject
    private PedidoRepository pedidoRepository;

    public void guardar(Pedido pedido){
        this.pedidoRepository.crear(pedido);
    }

    public Pedido buscarPorId(Integer id){
        return this.pedidoRepository.read(id);
    }

    public void actualizar(Pedido pedido){
        this.pedidoRepository.actualizar(pedido);
    }

    public void eliminar(Integer id){
        this.pedidoRepository.eliminar(id);
    }

}
