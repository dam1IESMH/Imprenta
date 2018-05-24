/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

/**
 *
 * @author usuario
 */
public class OImpresion extends Operario{
//    Abertura del constructor vacio extendido de Operario
    public OImpresion() {
        super();
    }
//    Cierre del constructor vacio extendido de Operario
//    Abertura del constructor de parametros extendido en Operario
    public OImpresion(String NIF, String nombre, String apellidos, String telefono, String direccion, boolean senior) {
        super(NIF, nombre, apellidos, telefono, direccion, senior);
    }
//    Cierre del constructor de parametros extendido de Operario
//    Abertura del constructor de Objeto OImpresion extendido de Operario 
    public OImpresion(OImpresion oi) {
        super(oi);
    }
//    Cierre del constructor de Objeto OImpresion extendido de Operario
}
