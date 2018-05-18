/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imprenta;

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
public class Maquina {

    private int id,
            volumen,
            capacidadMax;
    private String ubicacion,
            tipoImpresion,
            modoImpresion;
    private Calendar fechaCompra;

    /**
     * Inicializa un objeto {@code Maquina} con sus variables sin inicializar.
     */
    public Maquina() {
    }

    /**
     * Inicializa un objeto {@code Maquina} que inicializa sus variables con los
     * parámetros pasados como argumento.
     *
     * @param id {@code int}
     * @param volumen {@code int}
     * @param capacidadMax {@code int}
     * @param ubicacion {@code String}
     * @param tipoImpresion {@code String}
     * @param modoImpresion {@code String}
     * @param fechaCompra {@code Calendar}
     */
    public Maquina(int id, int volumen, int capacidadMax, String ubicacion, String tipoImpresion, String modoImpresion, Calendar fechaCompra) {
        this.id = id;
        this.volumen = volumen;
        this.capacidadMax = capacidadMax;
        this.ubicacion = ubicacion;
        this.tipoImpresion = tipoImpresion;
        this.modoImpresion = modoImpresion;
        this.fechaCompra = fechaCompra;
    }

    /**
     * Inicializa un objeto {@code Maquina} cuyas variables copia de otro objeto
     * Maquina pasado como argumento.
     *
     * @param m {@code Maquina}
     */
    public Maquina(Maquina m) {
        this.id = m.id;
        this.volumen = m.volumen;
        this.capacidadMax = m.capacidadMax;
        this.ubicacion = m.ubicacion;
        this.tipoImpresion = m.tipoImpresion;
        this.modoImpresion = m.modoImpresion;
        this.fechaCompra = m.fechaCompra;
    }

    @Override
    public String toString() {
        return "Maquina{" + "id=" + id + ", volumen=" + volumen + ", capacidadMax=" + capacidadMax + ", ubicacion=" + ubicacion + ", tipoImpresion=" + tipoImpresion + ", modoImpresion=" + modoImpresion + ", fechaCompra=" + fechaCompra + '}';
    }

}
