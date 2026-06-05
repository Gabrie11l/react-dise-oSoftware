
package react.dise.osoftware;

import react.dise.osoftware.sectionC_aop_singleton.ConfiguracionAOP;

public class ReactDiseOSoftware {

    public static void main(String[] args) {

        //primer modulo
        System.out.println("Modulo de autenticación") ;
        ConfiguracionSistema config1 = ConfiguracionSistema.getConfig();
        config1.mostrarMensaje();
        
        //segundo modulo
        System.out.println("Modulo de reportes");
        ConfiguracionSistema config2 = ConfiguracionSistema.getConfig();
        config2.mostrarMensaje();
        
        //SECCION C
        System.out.println();
        System.out.println("----- PRUEBA SINGLETON CON AOP -----");
        //Primer Modulo
        System.out.println("Modulo de autenticacion");
        ConfiguracionAOP confi1 = new ConfiguracionAOP();
        confi1.mostrarMensaje();
        
        //Segundo modulo
        System.out.println("Modulo de reportes");
        ConfiguracionAOP confi2 = new ConfiguracionAOP();
        confi2.mostrarMensaje();
        System.out.println("¿Son la misma instancia?: " + (config1 == config2));
    }
    
}
