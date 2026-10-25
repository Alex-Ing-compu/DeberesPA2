package com.uce.edu.paquete;

import java.util.UUID;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped 
@Named("regular")
public class DescuentoRegular implements CalculadoraDescuento{

    private static final String idInstancia = UUID.randomUUID().toString();

    public DescuentoRegular() {
        System.out.println("Creacion: DescuentoRegular instanciado con ID: " + idInstancia);
    }

    @Override
    public double calcular(double monto) {
        return monto * 0.05;
    }



}
