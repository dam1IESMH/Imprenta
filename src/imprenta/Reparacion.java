/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.Calendar;

/**
 *
 * @author usuario
 */
public class Reparacion {
    
//    Atributos de Reparacion
    
    private int id;
    private Calendar fecha;
    private String descripcion;
//    Abertura del constructor vacio
    public Reparacion() {
        
    }
//    Cierre del constructor vacio
//    Abertura del constructor de parametros
    public Reparacion(int id, Calendar fecha, String descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }
//    Cierre del constructor de parametros
//    Abertura del constructor de Objeto Reparacion    
    public Reparacion(Reparacion r) {
        this.id = r.id;
        this.fecha = r.fecha;
        this.descripcion = r.descripcion;
    }
//    Cierre del constructor de Objeto Reparacion
//    Inicio del to String    
    @Override
    public String toString() {
        return "Reparacion{" + "id=" + id + ", fecha=" + fecha + ", descripcion=" + descripcion + '}';
    }
    
}
