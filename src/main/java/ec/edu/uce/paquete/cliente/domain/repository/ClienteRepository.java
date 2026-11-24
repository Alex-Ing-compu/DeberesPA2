package ec.edu.uce.paquete.cliente.domain.repository;

import ec.edu.uce.paquete.cliente.domain.model.Cliente;

public interface ClienteRepository {

    //crear
    public void crear(Cliente cliente);

    //read
    public Cliente read(Integer id);

    //update
    public void actualizar(Cliente cliente);

    //delete
    public void eliminar(Integer id);
}
