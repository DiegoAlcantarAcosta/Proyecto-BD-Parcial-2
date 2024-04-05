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
import tramite.EstadoTramite;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
@Entity
@Table(name = "Licencias")
@DiscriminatorValue("Licencia")
public class Licencia extends Tramite implements Serializable {

    @Column(name = "vigencia")
    @Temporal(TemporalType.DATE)
    private Calendar vigencia;

    public Licencia(Calendar vigencia) {
        this.vigencia = vigencia;
    }

    public Licencia(Calendar vigencia, float costo, EstadoTramite estado, Calendar fechaExpedicion, Persona persona) {
        super(costo, estado, fechaExpedicion, persona);
        this.vigencia = vigencia;
    }

    public Licencia() {
    }

    public Calendar getVigencia() {
        return vigencia;
    }

    public void setVigencia(Calendar vigencia) {
        this.vigencia = vigencia;
    }
    
    public EstadoTramite estadoLicencia() {
        Calendar fechaActual = Calendar.getInstance();
        if (getVigencia().after(fechaActual)) {
            return EstadoTramite.ACTIVA;
        } else {
            return EstadoTramite.VENCIDA;
        }
    }

    @Override
    public String toString() {
        return "Licencia{" + "vigencia=" + vigencia + '}';
    }
}
