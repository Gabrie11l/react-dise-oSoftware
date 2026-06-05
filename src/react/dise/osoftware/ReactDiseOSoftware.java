
package react.dise.osoftware;  
import react.dise.osoftware.SingletonPoo.ConfiguracionSistema;
import react.dise.osoftware.AdapterPoo.AnteriorConfigLect;
import react.dise.osoftware.AdapterPoo.ProveedorConfiguracion;
import react.dise.osoftware.AdapterPoo.AdapterConfiguracion;
import react.dise.osoftware.AdapterPoo.ConfigPropiedad;
import react.dise.osoftware.SingletonPoo.ConfiguracionSistema;

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
        
        
        //Prueba Poo Adapter
        System.out.println("Prueba Poo Adapter");
        AnteriorConfigLect componenteViejo = new AnteriorConfigLect();
        ProveedorConfiguracion adaptador = new AdapterConfiguracion(componenteViejo);
        
        // Recibimos el arreglo
        ConfigPropiedad[] misConfigs = adaptador.obtenerConfiguraciones();
        
        System.out.println("Configuraciones adaptadas exitosamente (Sin usar Maps):");
        for (ConfigPropiedad prop : misConfigs) {
            if (prop != null) { 
                System.out.println(prop.getClave() + " : " + prop.getValor());
            }
        }
    }
    
}
