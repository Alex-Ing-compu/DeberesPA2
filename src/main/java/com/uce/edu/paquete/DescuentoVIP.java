package com.uce.edu.paquete;

import java.util.UUID;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped 
@Named("vip")
public class DescuentoVIP implements CalculadoraDescuento{

    public static final String idInstancia = UUID.randomUUID().toString();

    
    public DescuentoVIP() {
        System.out.println("Creacion: DescuentoVIP instanciado con ID: " + idInstancia);
    }
    
    @Override
    public double calcular(double monto) {
       return monto * 0.15;
    }

}
