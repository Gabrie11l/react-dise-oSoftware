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

    private static ConfiguracionAOP instanciaUnica;


    @Pointcut("call(react.dise.osoftware.sectionC_aop_singleton.ConfiguracionAOP.new())")
    public void constructorCall() {}
 
    @Around("constructorCall()")
    public Object controlarInstancia(ProceedingJoinPoint joinPoint) throws Throwable {
        if (instanciaUnica == null) {
            instanciaUnica = (ConfiguracionAOP) joinPoint.proceed();
        }
        return instanciaUnica;
    }
}
