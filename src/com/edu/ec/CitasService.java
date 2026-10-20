package com.edu.ec;

public class CitasService {

    public void registrarCita(Citas cita){
        System.out.println("Se ha registrado la cita para el paciente: " + cita.getPaciente());

        System.out.println("Con el doctor:" + cita.getDoctor());
        System.out.println("En la fecha:" + cita.getFecha());
        System.out.println("Correo:" + cita.getCorreo());


        NotificacionService ns = new NotificacionService();

        String mensaje = "Estimado/a " + cita.getPaciente() 
        + ", su cita con el doctor " 
        + cita.getDoctor() 
        + " ha sido registrada para la fecha " 
        + cita.getFecha() + ".";

        ns.enviarNotificacion(cita.getCorreo(), mensaje);
    }
}
