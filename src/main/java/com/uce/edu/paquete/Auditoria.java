package com.uce.edu.paquete;

import java.util.UUID;

import jakarta.enterprise.context.Dependent;
@Dependent 
public class Auditoria {

    private static final String idInstancia = UUID.randomUUID().toString();

    public Auditoria(){
        System.out.println("Creacion: Auditoria instanciada con ID: " + idInstancia);
    }

    public void registrar(String operacion){
        System.out.println("---> Auditoria: Operacion registrada >>>> " + operacion +  " instancia de" + idInstancia);
    }
}
