
package react.dise.osoftware;  
import react.dise.osoftware.SingletonPoo.ConfiguracionSistema;
import react.dise.osoftware.AdapterPoo.AnteriorConfigLect;
import react.dise.osoftware.AdapterPoo.ProveedorConfiguracion;
import react.dise.osoftware.AdapterPoo.AdapterConfiguracion;
import react.dise.osoftware.AdapterPoo.ConfigPropiedad;
import react.dise.osoftware.SingletonPoo.ConfiguracionSistema;

import react.dise.osoftware.sectionC_aop_singleton.ConfiguracionAOP;

public class ReactDiseOSoftware {

    public static void main(String[] args) {
        //Prubea Poo Singleton
        //primer modulo
        System.out.println("Prueba Poo Singleton");
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

        
        //Prueba Poo Adapter
        System.out.println("Prueba Poo Adapter");
        AnteriorConfigLect componenteViejo = new AnteriorConfigLect();
        ProveedorConfiguracion adaptador = new AdapterConfiguracion(componenteViejo);
        
        // Recibimos el arreglo
        ConfigPropiedad[] misConfigs = adaptador.obtenerConfiguraciones();
        
        System.out.println("Configuraciones adaptadas exitosamente");
        for (ConfigPropiedad prop : misConfigs) {
            if (prop != null) { 
                System.out.println(prop.getClave() + " : " + prop.getValor());
            }
        }

    }
    
}
