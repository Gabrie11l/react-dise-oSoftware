/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package react.dise.osoftware.sectionC_aop_singleton;

/**
 *
 * @author Jared
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Singleton implements InvocationHandler  {
        private static IConfiguracion instanciaUnica;
    private final IConfiguracion real;

    private Singleton (IConfiguracion real) {
        this.real = real;
    }
    public static IConfiguracion getInstancia() {
        if (instanciaUnica == null) {
            ConfiguracionAOP objetoReal = new ConfiguracionAOP();
            instanciaUnica = (IConfiguracion) Proxy.newProxyInstance(
                IConfiguracion.class.getClassLoader(),
                new Class[]{IConfiguracion.class},
                new Singleton(objetoReal)
            );
        }
        return instanciaUnica;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // Aquí se puede agregar lógica antes/después del método
        System.out.println("Interceptando: " + method.getName());
        return method.invoke(real, args);
    }
    
}
