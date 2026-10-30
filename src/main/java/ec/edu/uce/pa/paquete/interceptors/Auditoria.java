package ec.edu.uce.pa.paquete.interceptors;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.interceptor.InterceptorBinding;

@InterceptorBinding // Le da el comportamiento de un interceptor
@Retention(RetentionPolicy.RUNTIME) // Cuándo se va a ejecutar
@Target({ElementType.TYPE, ElementType.METHOD}) // Alcance u objetivo
public @interface Auditoria {

}
