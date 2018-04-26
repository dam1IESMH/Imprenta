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
public class OMaquina extends Operario{

    public OMaquina() {
        super();
    }

    public OMaquina(String NIF, String nombre, String apellidos, String telefono, String direccion, boolean senior) {
        super(NIF, nombre, apellidos, telefono, direccion, senior);
    }
    
    public OMaquina(OMaquina om) {
        super(om);
    }
}
