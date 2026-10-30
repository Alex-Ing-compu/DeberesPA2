package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.interceptors.Auditoria;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class MatriculaService {

    @Auditoria 
    public String procesarMatricula(Estudiante estudiante) {
        System.out.println("Procesando matricula para la cedula: " + estudiante.getCedula());
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Correo: " + estudiante.getCorreo());
        System.out.println("Edad: " + estudiante.getEdad());
        System.out.println("Curso: " + estudiante.getCurso());
        System.out.println("Matricula realizado exitosamente");
        
        return "Matricula realizada para el estudiante";
    }
}
