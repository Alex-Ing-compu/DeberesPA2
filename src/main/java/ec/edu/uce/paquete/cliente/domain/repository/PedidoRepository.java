package ec.edu.uce.paquete.cliente.domain.repository;

import ec.edu.uce.paquete.cliente.domain.model.Pedido;

public interface PedidoRepository {

    public void crear(Pedido pedido);

    public Pedido read(Integer id);

    public void actualizar(Pedido pedido);

    public void eliminar(Integer id);
}
