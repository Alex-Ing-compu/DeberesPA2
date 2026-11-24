package ec.edu.uce.paquete.cliente.domain.repository;

import ec.edu.uce.paquete.cliente.domain.model.Factura;

public interface FacturaRepository {

    public void crear(Factura factura);

    public Factura read(Integer id);

    public void actualizar(Factura factura);

    public void eliminar(Integer id);
}
