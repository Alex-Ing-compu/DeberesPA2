package com.uce.edu.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped 
public class VentaService {

    //Inyeccion por atributo
    @Inject 
    @Named("regular")
    private CalculadoraDescuento descuentoRegular;

    @Inject 
    @Named("vip")
    private CalculadoraDescuento descuentoVIP;

    
    private Auditoria auditoria;
    //Inyeccion por contructor
    @Inject 
    public VentaService(Auditoria auditoria){
        this.auditoria = auditoria;
    }

    public void realizarVenta(Venta venta){
        double descuentoDescuento = 0;
        if("regular".equalsIgnoreCase(venta.getTipo())){
            descuentoDescuento = descuentoRegular.calcular(venta.getMonto());
        }else if("vip".equalsIgnoreCase(venta.getTipo())){
            descuentoDescuento = descuentoVIP.calcular(venta.getMonto());
        }

        double valorFinal = venta.getMonto() - descuentoDescuento;
        venta.setDescuento(descuentoDescuento);
        venta.setTotal(valorFinal);

        System.out.println("-------------------------------");
        System.out.println("Venta realizada para el/la cliete/a: " + venta.getCliente());
        System.out.println("Tipo: " + venta.getTipo());
        System.out.println("Monto: " + venta.getMonto());
        System.out.println("Valor total con Descuento: " + venta.getTotal());

        auditoria.registrar("Venta procesada para:" + venta.getCliente());

    }
}
