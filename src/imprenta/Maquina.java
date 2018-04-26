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
public class Maquina {

    private int id,
            volumen,
            capacidadMax;
    private String ubicacion,
            tipoImpresion,
            modoImpresion;
    private Calendar fechaCompra;

    public Maquina() {
    }

    public Maquina(int id, int volumen, int capacidadMax, String ubicacion, String tipoImpresion, String modoImpresion, Calendar fechaCompra) {
        this.id = id;
        this.volumen = volumen;
        this.capacidadMax = capacidadMax;
        this.ubicacion = ubicacion;
        this.tipoImpresion = tipoImpresion;
        this.modoImpresion = modoImpresion;
        this.fechaCompra = fechaCompra;
    }

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
