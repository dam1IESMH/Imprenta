/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

/**
 * La clase {@code OImpresion} es una clase que hereda de (@code Operario). 
 * El OImpresion tiene los atributos heredados de Operario
 * 
 * @author  Mario Perez Urbaneja
 */
public class OImpresion extends Operario{
/**
 * Abertura de constructor vacio
 */
    public OImpresion() {
        super();
    }
/**
 * Cierre del constructor vacio extendido de Operario
 */
/**
 * Abertura del constructor de parametros extendido en Operario
 * @param NIF
 * @param nombre
 * @param apellidos
 * @param telefono
 * @param direccion
 * @param senior 
 */  
    public OImpresion(String NIF, String nombre, String apellidos, String telefono, String direccion, boolean senior) {
        super(NIF, nombre, apellidos, telefono, direccion, senior);
    }
/**
 * Cierre del constructor de parametros extendido de Operario
 */
/**
 * Abertura del constructor de Objeto OImpresion extendido de Operario
 * @param oi 
 */ 

    public OImpresion(Operario o) {
        super(o);
    }
/**
 * Cierre del constructor de Objeto OImpresion extendido de Operario
 */    
}
