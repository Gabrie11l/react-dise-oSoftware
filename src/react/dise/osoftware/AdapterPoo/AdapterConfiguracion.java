/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package react.dise.osoftware.AdapterPoo;

/**
 *
 * @author alexa
 */
public class AdapterConfiguracion implements ProveedorConfiguracion {
    private AnteriorConfigLect lectorViejo;

    public AdapterConfiguracion(AnteriorConfigLect lectorViejo) {
        this.lectorViejo = lectorViejo;
    }

    @Override
    public ConfigPropiedad[] obtenerConfiguraciones() {
        // Consigue archivo viejo
        String datosViejos = lectorViejo.leerArchivoAnterior();
        
        // Separa las propiedades por ;
        String[] registros = datosViejos.split(";");
        
        // Crea el arreglo para los registros
        ConfigPropiedad[] arregloPropiedades = new ConfigPropiedad[registros.length];
        
        // Inserta los registros en el arreglo
        for (int i = 0; i < registros.length; i++) {
            String[] llaveValor = registros[i].split("~");
            if (llaveValor.length == 2) {
                // guarda el objeto
                arregloPropiedades[i] = new ConfigPropiedad(llaveValor[0], llaveValor[1]);
            }
        }
        
        return arregloPropiedades;
    }
}
