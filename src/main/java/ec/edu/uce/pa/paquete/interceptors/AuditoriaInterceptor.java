package ec.edu.uce.pa.paquete.interceptors;

import java.lang.reflect.Parameter;

import ec.edu.uce.pa.paquete.CertificadoService;
import ec.edu.uce.pa.paquete.Estudiante;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor 
@Auditoria 
public class AuditoriaInterceptor {
    
@Inject 
    private CertificadoService certificadoService;

    @AroundInvoke 
    public Object interceptar(InvocationContext context) throws Exception {

        Object resultado = context.proceed(); // Ejecuta el metodo interceptado

        System.out.println("Retorno: " + resultado);
        String nombreMetodo = context.getMethod().getName();
        
        System.out.println("Interceptor ejecutandose en el metodo: " + nombreMetodo);

        Parameter[] parametros = context.getMethod().getParameters();
        for (Parameter parametro : parametros) {
            System.out.println("Parametros: " + parametro.getName());
        }

        // Acceder a los valores directamente 
        Object[] valores = context.getParameters();
        Estudiante estudiante = (Estudiante) valores[0];

        String nombre = estudiante.getNombre();
        String curso = estudiante.getCurso();

        // Llamamos al servicio de certificados
        this.certificadoService.generarCertificado(nombre, curso);

        return resultado;
        
    }    
}
