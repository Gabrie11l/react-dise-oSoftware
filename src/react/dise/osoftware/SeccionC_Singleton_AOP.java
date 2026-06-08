package react.dise.osoftware;

import react.dise.osoftware.sectionC_aop_singleton.ConfiguracionAOP;
import react.dise.osoftware.sectionC_aop_singleton.IConfiguracion;
import react.dise.osoftware.sectionC_aop_singleton.Singleton;

public class SeccionC_Singleton_AOP {
    static void main(String[] args) {
        System.out.println("----- PRUEBA SECCION C: SINGLETON CON AOP -----");
        //SECCION C
        
        //Primer Modulo
        System.out.println("Modulo de autenticacion");
        IConfiguracion confi1 = Singleton.getInstancia();
        confi1.mostrarMensaje();
        
        //Segundo modulo
        System.out.println("Modulo de reportes");
        IConfiguracion confi2 = Singleton.getInstancia();
        confi2.mostrarMensaje();
        System.out.println("¿Son la misma instancia?: " + (confi1 == confi2));
    }
}
