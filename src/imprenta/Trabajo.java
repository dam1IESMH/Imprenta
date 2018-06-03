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
import java.util.GregorianCalendar;

/**
 * La clase {@code Trabajo} es una clase padre de la que heredan (@code Rotulo),
 * (@code Poster) y (@code Libro).
 * Trabajo tiene un atributo enumerado (@code tipoRelieve), un entero (@code id),
 * los atribuos Calendar (@code fechaSolicitud), (@code fechaImpresion),
 * (@code fechaRecogida) y los booleanos (@code valido) y (@code impreso).
 * 
 * @author Jose Daniel Buenaga
 */
public class Trabajo implements Serializable {

    protected enum tipoRelieve {
        FLEXOGRAFIA, TIPOGRAFIA, LITOGRAFIA
    }
    protected int id;
    protected Calendar fechaSolicitud;
    protected tipoRelieve Relieve;
    protected Calendar fechaImpresion;
    protected Calendar fechaRecogida;
    protected boolean valido;
    protected boolean impreso;

    ArrayList<Modificacion> mods;
    protected static int auto_incrementado = 0;

    {
        auto_incrementado++;
    }

    /**
     * Inicializa un objeto {@code Rotulo} con sus variables sin inicializar.
     */
    public Trabajo() {
    }

    /**
     * Inicializa un objeto {@code Trabajo} que inicializa sus variables con los
     * parámetros pasados como argumento.
     *
     * @param fechaSolicitud (@code Calendar)
     * @param tipoRelieve (@code enum)
     * @param fechaImpresion (@code Calendar)
     * @param fechaRecogida (@code Calendar)
     */
    public Trabajo(Calendar fechaSolicitud, String tipoRelieve, Calendar fechaImpresion, Calendar fechaRecogida) {
        this.id = auto_incrementado;
        this.fechaSolicitud = fechaSolicitud;
        if (tipoRelieve.equalsIgnoreCase("FLEXOGRAFIA")) {
            Relieve = Relieve.FLEXOGRAFIA;
        } else if (tipoRelieve.equalsIgnoreCase("TIPOGRAFIA")) {
            Relieve = Relieve.TIPOGRAFIA;
        } else if (tipoRelieve.equalsIgnoreCase("LITOGRAFIA")) {
            Relieve = Relieve.LITOGRAFIA;
        }
        this.fechaImpresion = fechaImpresion;
        this.fechaRecogida = fechaRecogida;
        mods = new ArrayList<>();
    }

    /**
     * Inicializa un objeto {@code Trabajo} cuyas variables copia de otro objeto
     * Trabajo pasado como argumento
     *
     * @param t {@code Trabajo}
     */
    public Trabajo(Trabajo t) {
        this.id = t.id;
        this.fechaSolicitud = t.fechaSolicitud;
        this.Relieve = t.Relieve;
        this.fechaImpresion = t.fechaImpresion;
        this.fechaRecogida = t.fechaRecogida;
    }

    public int getId() {
        return id;
    }

    public String getFechaSolicitud() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(fechaSolicitud.getTime());
    }

    public String getRelieve() {
        if (Relieve != null) {
            return Relieve.toString();
        } else {
            return null;
        }
    }

    public String getFechaImpresion() {
        if (fechaImpresion != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.format(fechaImpresion.getTime());
        } else {
            return null;
        }
    }

    public String getFechaRecogida() {
        if (fechaRecogida != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            return sdf.format(fechaRecogida.getTime());
        } else {
            return null;
        }
    }

    public boolean isValido() {
        return valido;
    }

    public boolean isImpreso() {
        return impreso;
    }

    public ArrayList<Modificacion> getMods() {
        return mods;
    }

    public void setMods(ArrayList<Modificacion> mods) {
        this.mods = mods;
    }

    public void setFechaImpresion(Calendar fechaImpresion) {
        this.fechaImpresion = fechaImpresion;
    }

    public void setFechaRecogida(Calendar fechaRecogida) {
        this.fechaRecogida = fechaRecogida;
    }

    public void setValido(boolean valido) {
        this.valido = valido;
    }

    public void setImpreso(boolean impreso) {
        this.impreso = impreso;
    }

    public static void setAuto_incrementado(int auto_incrementado) {
        Trabajo.auto_incrementado = auto_incrementado;
    }

    public void validar() {
        this.valido = true;
    }

    public void imprimir() {
        this.impreso = true;
        this.fechaImpresion = new GregorianCalendar();
    }

    @Override
    public String toString() {
        return "Trabajo{" + "id=" + id + ", fechaSolicitud=" + fechaSolicitud + ", tipoRelieve=" + Relieve + ", fechaImpresion=" + fechaImpresion + ", fechaRecogida=" + fechaRecogida + '}';
    }

}

