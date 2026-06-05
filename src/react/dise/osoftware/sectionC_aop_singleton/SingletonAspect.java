/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package react.dise.osoftware.sectionC_aop_singleton;

/**
 *
 * @author Jared
 */
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect 
public class SingletonAspect {

    private static ConfiguracionAOP instanciaUnica = null;
    @Pointcut("call(react.dise.osoftware.seccionC_aop_singleton.ConfiguracionAOP.new())")
    public void instanciacionSingleton() {}

    @Around("instanciacionSingleton()")
    public Object controlarInstancia(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println(" Interceptada solicitud de creación ");
        
        if (instanciaUnica == null) {
            System.out.println("Creando la primera y única instancia ");
            instanciaUnica = (ConfiguracionAOP) joinPoint.proceed();
        } else {
            System.out.println("nstancia ya existente. Devolviendo la guardada");
        }
        
        return instanciaUnica;
    }
}