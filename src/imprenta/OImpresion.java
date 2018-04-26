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

    public OImpresion() {
        super();
    }

    public OImpresion(String NIF, String nombre, String apellidos, String telefono, String direccion, boolean senior) {
        super(NIF, nombre, apellidos, telefono, direccion, senior);
    }
    
    public OImpresion(OImpresion oi) {
        super(oi);
    }
}
