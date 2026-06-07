package react.dise.osoftware;

import react.dise.osoftware.sectionC_aop_singleton.ConfiguracionAOP;

public class SeccionC_Singleton_AOP {
    static void main(String[] args) {
        System.out.println("----- PRUEBA SECCION C: SINGLETON CON AOP -----");
        //Primer Modulo
        System.out.println("Modulo de autenticacion");
        ConfiguracionAOP confi1 = new ConfiguracionAOP();
        confi1.mostrarMensaje();

        //Segundo modulo
        System.out.println("Modulo de reportes");
        ConfiguracionAOP confi2 = new ConfiguracionAOP();
        confi2.mostrarMensaje();
        System.out.println("¿Son la misma instancia?: " + (confi1 == confi2));
    }
}
