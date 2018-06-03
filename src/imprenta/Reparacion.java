/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.Calendar;

/**
 * La clase {@code Reparacion} representa a las reparaciones realizadas a las maquinas,
 * en una imprenta. Las reparaciones tiene el atributos enteros {@code id}; 
 * el String {@code direccion}; 
 * y el Calendar
 * {@code fecha}.
 * 
 * @author Mario Perez Urbaneja
 */
public class Reparacion {
    
/**
 * Atributos de Reparacion
 */
    
    private int id;
    private Calendar fecha;
    private String descripcion;
    
    private static int auto_incrementado=0;
    
    {
        auto_incrementado++;
    }

    public Reparacion() {
        
    }
    
    
/**
 * Abertura del constructor de parametros
 * @param id
 * @param fecha
 * @param descripcion
 */ 
    public Reparacion(int id, Calendar fecha, String descripcion) {
        this.id = auto_incrementado;
        this.fecha = fecha;
        if(Validaciones.validarDescripcion(descripcion)){
        this.descripcion = descripcion;
        }
    }
/**
 * Cierre del constructor vacio
 */  
  
/**
 * Abertura de constructor de Objeto Reparacion
 * @param r 
 */    
    public Reparacion(Reparacion r) {
        this.id = r.id;
        this.fecha = r.fecha;
        this.descripcion = r.descripcion;
    }
/**
 * Cierre del constructor de Objeto Reparacion
 */    
/**
 * Inicio del to String 
 */
    @Override
    public String toString() {
        return "Reparacion{" + "id=" + id + ", fecha=" + fecha + ", descripcion=" + descripcion + '}';
    }
    
}
