/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.io.Serializable;

/**
 * La clase {@code Cliente} representa a un cliente cuya actividad es registrada
 * en una imprenta. El cliente se define por su {@code nombre} y
 * {@code telefono}.
 *
 * @author Sergio Amor Gutiérrez
 */
public class Cliente implements Serializable {

    private String nombre; 
    private String telefono; 

    /**
     * Inicializa un objeto {@code Cliente} con sus variables sin inicializar.
     */
    public Cliente() {
    }

    /**
     * Inicializa un objeto {@code Cliente} que inicializa sus variables con los
     * parámetros pasados como argumento.
     *
     * @param nombre {@code String}
     * @param telefono {@code String}
     */
    public Cliente(String nombre, String telefono) {
        if(Validaciones.validarNombre(nombre)){
        this.nombre = nombre;
        }
        if(Validaciones.validarTlf(telefono)){
            this.telefono = telefono;
        }
    }

    /**
     * Inicializa un objeto {@code Cliente} cuyas variables copia de otro objeto
     * Cliente pasado como argumento.
     *
     * @param c {@code Cliente}
     */
    public Cliente(Cliente c) {
        this.nombre = c.nombre;
        this.telefono = c.telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + '}';
    }

}
