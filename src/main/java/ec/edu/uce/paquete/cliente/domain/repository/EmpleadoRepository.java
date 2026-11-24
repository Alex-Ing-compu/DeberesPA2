package ec.edu.uce.paquete.cliente.domain.repository;

import ec.edu.uce.paquete.cliente.domain.model.Empleado;

public interface EmpleadoRepository {

    public void crear(Empleado empleado);

    public Empleado read(Integer id);

    public void actualizar(Empleado empleado);

    public void eliminar(Integer id);
}
