/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package react.dise.osoftware.AdapterPoo;

/**
 *
 * @author alexa
 */
public class ConfigPropiedad {
    private String clave;
    private String valor;

    public ConfigPropiedad(String clave, String valor) {
        this.clave = clave;
        this.valor = valor;
    }

    public String getClave(){ 
        return clave; }
    
    public String getValor(){ 
        return valor; }
}

