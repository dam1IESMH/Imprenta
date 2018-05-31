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
public class Operario {
    
/**
 * Atributos de Operario
 */    
    
    protected String NIF;
    protected String nombre;
    protected String apellidos;
    protected String telefono;
    protected String direccion;
    protected boolean senior;

/**
 * Abertura del constructor vacio
 */   
    
    public Operario() {
    }
/**
 * Cierre del constructor vacio
 */
/**
 * Abertura del constructor de parametros 
 * @param NIF
 * @param nombre
 * @param apellidos
 * @param telefono
 * @param direccion
 * @param senior 
 */   
    public Operario(String NIF, String nombre, String apellidos, String telefono, String direccion, boolean senior) {
        this.NIF = NIF;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.senior = senior;
    }
/**
 * Cierre del constructor de parametros
 */
/**
 * Abertura del constructor de Objeto Operario
 * @param o 
 */   
    
    public Operario(Operario o) {
        this.NIF = o.NIF;
        this.nombre = o.nombre;
        this.apellidos = o.apellidos;
        this.telefono = o.telefono;
        this.direccion = o.direccion;
        this.senior = o.senior;
    }
/**
 * Cierre del constructor de Objeto Operario
 */
/**
 * Inicio del to String
 */ 
    @Override
    public String toString() {
        return "Operario{" + "NIF=" + NIF + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", direccion=" + direccion + ", senior=" + senior + '}';
    }
    
}
