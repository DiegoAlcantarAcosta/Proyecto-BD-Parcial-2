/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Héctor Francisco Báez Luque
 * @author Diego
 */
@Entity
@Table(name = "Licencias")
@DiscriminatorValue("Licencia")
public class Licencia extends Tramite implements Serializable {

    /**
     * Fecha de vigencia de la licencia.
     */
    @Column(name = "vigencia")
    @Temporal(TemporalType.DATE)
    private Calendar vigencia;

    /**
     * Constructor de la clase Licencia.
     *
     * @param vigencia Fecha de vigencia de la licencia.
     */
    public Licencia(Calendar vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Constructor de la clase Licencia con todos los parámetros.
     *
     * @param vigencia        Fecha de vigencia de la licencia.
     * @param costo           Costo del trámite.
     * @param estado          Estado del trámite.
     * @param fechaExpedicion Fecha de expedición del trámite.
     * @param persona         Persona asociada al trámite.
     */
    public Licencia(Calendar vigencia, float costo, String estado, Calendar fechaExpedicion, Persona persona) {
        super(costo, estado, fechaExpedicion, persona);
        this.vigencia = vigencia;
    }

    /**
     * Constructor por defecto de la clase Licencia.
     */
    public Licencia() {
    }

    /**
     * Obtiene la fecha de vigencia de la licencia.
     *
     * @return Fecha de vigencia de la licencia.
     */
    public Calendar getVigencia() {
        return vigencia;
    }

    /**
     * Establece la fecha de vigencia de la licencia.
     *
     * @param vigencia Fecha de vigencia de la licencia.
     */
    public void setVigencia(Calendar vigencia) {
        this.vigencia = vigencia;
    }

    /**
     * Obtiene el estado de la licencia (ACTIVA o VENCIDA).
     *
     * @return Estado de la licencia.
     */
    public String estadoLicencia() {
        Calendar fechaActual = Calendar.getInstance();
        if (getVigencia().after(fechaActual)) {
            return "ACTIVA";
        } else {
            return "VENCIDA";
        }
    }

    /**
     * Retorna una representación en forma de cadena de la licencia.
     *
     * @return Cadena que representa la licencia.
     */
    @Override
    public String toString() {
        return "Licencia{" + "vigencia=" + vigencia + '}';
    }
}
