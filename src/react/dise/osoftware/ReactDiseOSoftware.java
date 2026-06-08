
package react.dise.osoftware;  
import react.dise.osoftware.SectionB_aop_adapter.AdapterAspect;
import react.dise.osoftware.SingletonPoo.ConfiguracionSistema;
import react.dise.osoftware.AdapterPoo.AnteriorConfigLect;
import react.dise.osoftware.AdapterPoo.ProveedorConfiguracion;
import react.dise.osoftware.AdapterPoo.AdapterConfiguracion;
import react.dise.osoftware.AdapterPoo.ConfigPropiedad;
import react.dise.osoftware.sectionC_aop_singleton.ConfiguracionAOP;
import react.dise.osoftware.sectionC_aop_singleton.IConfiguracion;
import react.dise.osoftware.sectionC_aop_singleton.Singleton;

public class ReactDiseOSoftware {

    public static void main(String[] args) {
        System.out.println("---PRUEBA POO SINGLETON---");
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
        
        System.out.println();
        //Prueba Poo Adapter
        System.out.println("---PRUEBA POO ADAPTER---");
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

        //SECCION B
        System.out.println("\n----- PRUEBA ADAPTER CON AOP -----");

        // Aplicar aspecto AOP al adaptador
        adaptador = AdapterAspect.crearAspecto(adaptador, "obtenerConfiguraciones");

        // Obtiene las configuraciones, el aspecto se ejecuta automaticamente
        misConfigs = adaptador.obtenerConfiguraciones();

        System.out.println("Configuraciones adaptadas exitosamente:");
        for (ConfigPropiedad prop : misConfigs) {
            if (prop != null) {
                System.out.println("  " + prop.getClave() + " : " + prop.getValor());
            }
        }

        //SECCION C
        System.out.println();
        System.out.println("----- PRUEBA SINGLETON CON AOP -----");
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
    