package ec.edu.uce.paquete.cliente.domain.repository;


import ec.edu.uce.paquete.cliente.domain.model.Envio;

public interface EnvioRepository {

    public void crear(Envio envio);

    public Envio read(Integer id);

    public void actualizar(Envio envio);

    public void eliminar(Integer id);

}
