package react.dise.osoftware.SingletonPoo;

//Implementación de diseño Singletone en POO
public class ConfiguracionSistema {
    private static ConfiguracionSistema config;
    
    private ConfiguracionSistema(){
        System.out.println("Configuración inicializada");
    }
    
    public static ConfiguracionSistema getConfig(){
        if(config == null){
            config = new ConfiguracionSistema();
        }
        return config;
    }
    
    public void mostrarMensaje(){
        System.out.println("Configuración activa");
    }
}
 