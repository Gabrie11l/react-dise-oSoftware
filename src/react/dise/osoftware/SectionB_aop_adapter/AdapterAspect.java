package react.dise.osoftware.SectionB_aop_adapter;

import java.lang.reflect.Proxy;

public class AdapterAspect {

    public static <T> T crearAspecto(T objetoOriginal, String nombreMetodoAInterceptar) {
        return (T) Proxy.newProxyInstance(
                objetoOriginal.getClass().getClassLoader(),
                objetoOriginal.getClass().getInterfaces(),
                (proxy, metodo, args) -> {
                    if (metodo.getName().equals(nombreMetodoAInterceptar)) {
                        System.out.println("[AOP] Antes de " + nombreMetodoAInterceptar);
                        Object resultado = metodo.invoke(objetoOriginal, args);
                        System.out.println("[AOP] Después de " + nombreMetodoAInterceptar);
                        return resultado;
                    }
                    return metodo.invoke(objetoOriginal, args);
                }
        );
    }
}
