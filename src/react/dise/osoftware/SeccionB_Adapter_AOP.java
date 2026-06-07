package react.dise.osoftware;

import react.dise.osoftware.AdapterPoo.AdapterConfiguracion;
import react.dise.osoftware.AdapterPoo.AnteriorConfigLect;
import react.dise.osoftware.AdapterPoo.ConfigPropiedad;
import react.dise.osoftware.AdapterPoo.ProveedorConfiguracion;
import react.dise.osoftware.SectionB_aop_adapter.AdapterAspect;

public class SeccionB_Adapter_AOP {
    static void main(String[] args) {
        System.out.println("----- PRUEBA SECCION B: ADAPTER CON AOP -----");

        AnteriorConfigLect componenteViejo = new AnteriorConfigLect();
        ProveedorConfiguracion adaptador = new AdapterConfiguracion(componenteViejo);

        // Aplica el aspecto AOP al adaptador
        adaptador = AdapterAspect.crearAspecto(adaptador, "obtenerConfiguraciones");

        // Obtiene las configuraciones, el aspecto se ejecuta automaticamente
        ConfigPropiedad[] misConfigs = adaptador.obtenerConfiguraciones();

        System.out.println("Configuraciones adaptadas exitosamente:");
        for (ConfigPropiedad prop : misConfigs) {
            if (prop != null) {
                System.out.println("  " + prop.getClave() + " : " + prop.getValor());
            }
        }
    }
}
