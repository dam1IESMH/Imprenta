/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * La clase {@code Modificacion} maneja la información relacionada con las posibles
 * modificaciones en un Trabajo que pudieran realizarse y que deben ser aprobadas
 * por un Cliente.
 *
 * @author Sergio Amor Gutiérrez
 */
public class Modificacion {

    private int id;
    private Calendar fecha,
            fechaAprobacion;
    private String descripcion;
    private boolean aprobadoCliente;
    
    private OImpresion operario;
    private static int auto_increment = 0;
    
    {
        auto_increment++;
    }
    
    /**
     * Inicializa un objeto {@code Modificacion} con sus variables sin inicializar.
     */
    public Modificacion() {
    }

    /**
     * Inicializa un objeto {@code Modificacion} que inicializa sus variables con los
     * parámetros pasados como argumento.
     *
     * @param fecha {@code Calendar}
     * @param descripcion {@code String}
     * @param aprobadoCliente {@code boolean}
     * @param fechaAprobacion {@code Calendar}
     * @param operario {@code OImpresion}
     */
    public Modificacion(Calendar fecha, String descripcion, boolean aprobadoCliente, Calendar fechaAprobacion, OImpresion operario) {
        this.id = auto_increment;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.aprobadoCliente = aprobadoCliente;
        this.fechaAprobacion = fechaAprobacion;
        this.operario = operario;
    }

    /**
     * Inicializa un objeto {@code Modificacion} cuyas variables copia de otro objeto
     * Modificacion pasado como argumento.
     *
     * @param m {@code Modificacion}
     */
    public Modificacion(Modificacion m) {
        this.id = auto_increment;
        this.fecha = m.fecha;
        this.descripcion = m.descripcion;
        this.aprobadoCliente = m.aprobadoCliente;
        this.fechaAprobacion = m.fechaAprobacion;
        this.operario = m.operario;
    }

    public int getId() {
        return id;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public Calendar getFechaAprobacion() {
        return fechaAprobacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isAprobadoCliente() {
        return aprobadoCliente;
    }

    public OImpresion getOperario() {
        return operario;
    }

    public void aprobar() {
        aprobadoCliente = true;
        fechaAprobacion = new GregorianCalendar();
    }
    
    public String printFecha() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/AAAA HH:mm:ss");
        return sdf.format(fecha);
    }
    
    public String printFechaAprobacion() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/AAAA HH:mm:ss");
        return sdf.format(fechaAprobacion);
    }
    
    @Override
    public String toString() {
        return "Modificacion{" + "id=" + id + ", fecha=" + fecha + ", fechaAprobacion=" + fechaAprobacion + ", descripcion=" + descripcion + ", aprobadoCliente=" + aprobadoCliente + '}';
    }
    
}
