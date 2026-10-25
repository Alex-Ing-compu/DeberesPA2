package com.uce.edu.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication{

    @Inject 
    private VentaService ventaService;

    public static void main(String[] args) {
        Quarkus.run(Main.class,args);
    }

    @Override
    public int run(String... args) throws Exception {

       System.out.println("INICIANDO APLICACION QUARKUS");
       Venta v1 = new Venta("Jhon", "regular", 100);
       Venta v2 = new Venta("Alex", "vip", 200);
       Venta v3 = new Venta("Juan", "regular", 300);
       Venta v4 = new Venta("Pedro", "vip", 500);

       this.ventaService.realizarVenta(v1);
       this.ventaService.realizarVenta(v2);
       this.ventaService.realizarVenta(v3);
       this.ventaService.realizarVenta(v4);

       System.out.println("-----------------------------");


        return 0;
    }

}
