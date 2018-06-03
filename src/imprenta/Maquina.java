/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * La clase {@code Maquina} representa a una maquina, como impresoras o cintas,
 * en una imprenta. La máquina tiene los atributos enteros {@code id},
 * {@code volumen} y {@code capacidadMax}; los String {@code ubicacion},
 * {@code tipoImpresion}, {@code modoImpresion}; y el Calendar
 * {@code fechaCompra}.
 *
 * @author SirLoveWalter
 */
public class Maquina implements Serializable {

    private int id,
            volumen,
            capacidadMax;
    private String ubicacion,
            tipoImpresion,
            modoImpresion;
    private Calendar fechaCompra;

    private static int auto_increment = 0;
    private ArrayList<Reparacion> arreglos;

    {
        auto_increment++;
    }

    /**
     * Inicializa un objeto {@code Maquina} con sus variables sin inicializar.
     */
    public Maquina() {
    }

    /**
     * Inicializa un objeto {@code Maquina} que inicializa sus variables con los
     * parámetros pasados como argumento.
     *
     * @param volumen {@code int}
     * @param capacidadMax {@code int}
     * @param ubicacion {@code String}
     * @param tipoImpresion {@code String}
     * @param modoImpresion {@code String}
     * @param fechaCompra {@code Calendar}
     */
    public Maquina(int volumen, int capacidadMax, String ubicacion, String tipoImpresion, String modoImpresion, Calendar fechaCompra) {
        this.id = auto_increment;
        this.volumen = volumen;
        this.capacidadMax = capacidadMax;
        this.ubicacion = ubicacion;
        this.tipoImpresion = tipoImpresion;
        this.modoImpresion = modoImpresion;
        this.fechaCompra = fechaCompra;
        arreglos = new ArrayList<>();
    }

    /**
     * Inicializa un objeto {@code Maquina} cuyas variables copia de otro objeto
     * Maquina pasado como argumento.
     *
     * @param m {@code Maquina}
     */
    public Maquina(Maquina m) {
        this.id = auto_increment;
        this.volumen = m.volumen;
        this.capacidadMax = m.capacidadMax;
        this.ubicacion = m.ubicacion;
        this.tipoImpresion = m.tipoImpresion;
        this.modoImpresion = m.modoImpresion;
        this.fechaCompra = m.fechaCompra;
        arreglos = new ArrayList<>();
    }

    public int getVolumen() {
        return volumen;
    }

    public int getId() {
        return id;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getTipoImpresion() {
        return tipoImpresion;
    }

    public String getModoImpresion() {
        return modoImpresion;
    }

    public String getFechaCompra() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fechaCompra.getTime());
    }

    public ArrayList<Reparacion> getArreglos() {
        return arreglos;
    }

    /**
     * Devuelve la información de la fecha y hora de compra de la máquina con el
     * formato:
     * <p style="margin-left: 50px">dd/MM/AAAA HH:mm:ss</p>
     *
     * @return fechaCompra - {@code String}
     */
    public String printFechaCompra() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/AAAA HH:mm:ss");
        return sdf.format(fechaCompra);
    }

    /**
     * Registra un objeto {@code Reparacion} en la lista de reparaciones de esta
     * máquina con la fecha actual y la descripción del problema pasada como
     * argumento.
     *
     * @param descripcion {@code String}
     */
    public void reparar(String descripcion) {
        arreglos.add(new Reparacion( /*      arreglos.size(),
                new GregorianCalendar(),
                desc                        */));
    }

    /**
     * Actualiza el volumen actual de la máquina a su capacidad máxima,
     * simulando el relleno de sus cartuchos de tinta.
     */
    public void rellenar() {
        volumen = capacidadMax;
    }

    public void imprimirTrabajo(Trabajo t) {
        if (t instanceof Poster) {
            volumen -= 3;
        } else if (t instanceof Libro) {
            volumen -= 10;
        } else {
            volumen -= 25;
        }
    }

    @Override
    public String toString() {
        return "Maquina{" + "id=" + id + ", volumen=" + volumen + ", capacidadMax=" + capacidadMax + ", ubicacion=" + ubicacion + ", tipoImpresion=" + tipoImpresion + ", modoImpresion=" + modoImpresion + ", fechaCompra=" + fechaCompra + '}';
    }

}
