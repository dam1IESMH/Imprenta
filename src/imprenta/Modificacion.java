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
public class Modificacion {

    private int id;
    private Calendar fecha,
            fechaAprobacion;
    private String descripcion;
    private boolean aprobadoCliente;

    public Modificacion() {
    }

    public Modificacion(int id, Calendar fecha, String descripcion, boolean aprobadoCliente, Calendar fechaAprobacion) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.aprobadoCliente = aprobadoCliente;
        this.fechaAprobacion = fechaAprobacion;
    }

    public Modificacion(Modificacion m) {
        this.id = m.id;
        this.fecha = m.fecha;
        this.descripcion = m.descripcion;
        this.aprobadoCliente = m.aprobadoCliente;
        this.fechaAprobacion = m.fechaAprobacion;
    }

    @Override
    public String toString() {
        return "Modificacion{" + "id=" + id + ", fecha=" + fecha + ", fechaAprobacion=" + fechaAprobacion + ", descripcion=" + descripcion + ", aprobadoCliente=" + aprobadoCliente + '}';
    }
    
}
