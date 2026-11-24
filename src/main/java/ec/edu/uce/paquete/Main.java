package ec.edu.uce.paquete;

import ec.edu.uce.paquete.cliente.aplication.ClienteService;
import ec.edu.uce.paquete.cliente.aplication.EmpleadoService;
import ec.edu.uce.paquete.cliente.aplication.EnvioService;
import ec.edu.uce.paquete.cliente.aplication.FacturaService;
import ec.edu.uce.paquete.cliente.aplication.PedidoService;
import ec.edu.uce.paquete.cliente.domain.model.Cliente;
import ec.edu.uce.paquete.cliente.domain.model.Empleado;
import ec.edu.uce.paquete.cliente.domain.model.Envio;
import ec.edu.uce.paquete.cliente.domain.model.Factura;
import ec.edu.uce.paquete.cliente.domain.model.Pedido;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication{

    @Inject 
    private PedidoService pedidoService;

    @Inject 
    private ClienteService clienteService;
    @Inject 
    private EmpleadoService empleadoService;
    @Inject 
    private EnvioService envioService;
    @Inject 
    private FacturaService facturaService;
    

    public static void main(String[] args){
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) throws Exception {

        System.out.println("Hello, Quarkus!");

        Pedido pedido = new Pedido();
        pedido.setNombre("Computadira");
        pedido.setCategoria("Electronico");
        pedido.setPrecio(120.2);
        pedido.setStock(10);
        this.pedidoService.guardar(pedido);
        System.out.println("Se ha guardado su pedido:" + pedido.toString());

        Cliente cliente = new Cliente();
        cliente.setCorreo("alex@a.com");
        cliente.setDireccion("QUITO");
        cliente.setNombre("Jhon");
        cliente.setTelefono("092737582");
        this.clienteService.guardar(cliente);
        System.out.println("Se ha guardado un nuevo cliente:" + cliente.toString());
        
        Empleado empleado = new Empleado();
        empleado.setCargo("Administracion");
        empleado.setCedula("1002846736");
        empleado.setNombre("Alex");
        empleado.setSueldo(2000.0);
        this.empleadoService.guardar(empleado);
        System.out.println("Se ha guardado un nuevo empleado:" + empleado.toString());

        Envio envio = new Envio();
        envio.setEmpresaTransporte("Quito-Travel");
        envio.setEstadoEnvio("Activo");
        envio.setFechaEstimada("21-11-2026");
        envio.setNumeroGuia("10-TOP");
        this.envioService.guardar(envio);
        System.out.println("Se ha guardado un envio:" + envio.toString());
        
        Factura factura = new Factura();
        factura.setIva(5.0);
        factura.setRuc("90285736237");
        factura.setSubtotal(50.8);
        factura.setTotalPagar(200.10);
        this.facturaService.guardar(factura);
        System.out.println("Se ha guardado su factura:" + factura.toString());


        /*
        System.out.println("Pedido 2:");
        Pedido pedido2 = new Pedido("Electronico", "Laptop", 500.50, 4);
        //this.pedidoService.guardar(pedido2);
        System.out.println("Se ha guardado su pedido:" + pedido.toString());

        //actulizar 
        Pedido p3 = this.pedidoService.buscarPorId(5);
        p3.setCategoria("Gamming");
        //this.pedidoService.actualizar(p3);

        //read
        Pedido p4 = this.pedidoService.buscarPorId(2);
        System.out.println(p4.toString());

        //deleted
        //this.pedidoService.eliminar(6);
        */
        
        
       return 0;
    }

}
