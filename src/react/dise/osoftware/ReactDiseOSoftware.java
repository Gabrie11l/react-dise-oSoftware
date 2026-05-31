
package react.dise.osoftware;

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
    }
    
}
