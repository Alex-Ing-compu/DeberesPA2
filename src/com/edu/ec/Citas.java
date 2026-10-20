package com.edu.ec;

public class Citas {

    private String paciente;
    private String doctor;
    private String fecha;
    private String correo;

    public Citas(String paciente, String doctor, String fecha, String correo) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
        this.correo = correo;
    }

    //geter y setter
    public String getPaciente() {
        return paciente;
    }
    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }
    public String getDoctor() {
        return doctor;
    }
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    

}
