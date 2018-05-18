/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.util.Calendar;

/**
 * La clase {@code Modificacion} maneja la información relacionada con las posibles
 * modificaciones en un Trabajo que pudieran realizarse y que deben ser aprobadas
 * por un Cliente.
 *
 * @author SirLoveWalter
 */
public class Modificacion {

    private int id;
    private Calendar fecha,
            fechaAprobacion;
    private String descripcion;
    private boolean aprobadoCliente;

    /**
     * Inicializa un objeto {@code Modificacion} con sus variables sin inicializar.
     */
    public Modificacion() {
    }

    /**
     * Inicializa un objeto {@code Modificacion} que inicializa sus variables con los
     * parámetros pasados como argumento.
     *
     * @param id {@code int}
     * @param fecha {@code Calendar}
     * @param descripcion {@code String}
     * @param aprobadoCliente {@code boolean}
     * @param fechaAprobacion {@code Calendar}
     */
    public Modificacion(int id, Calendar fecha, String descripcion, boolean aprobadoCliente, Calendar fechaAprobacion) {
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.aprobadoCliente = aprobadoCliente;
        this.fechaAprobacion = fechaAprobacion;
    }

    /**
     * Inicializa un objeto {@code Modificacion} cuyas variables copia de otro objeto
     * Modificacion pasado como argumento.
     *
     * @param m {@code Modificacion}
     */
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
