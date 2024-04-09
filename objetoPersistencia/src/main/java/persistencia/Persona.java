/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *@author Héctor Francisco Báez Luque
 * @author Diego
 */

/**
 * Clase que representa una persona.
 */
@Entity
@Table(name = "Personas")
public class Persona implements Serializable {

    /**
     * Identificador único de la persona.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * RFC de la persona.
     */
    @Column(name = "rfc", nullable = false, length = 20)
    private String rfc;

    /**
     * Nombre de la persona.
     */
    @Column(name = "nombre", length = 50)
    private String nombre;

    /**
     * Apellido paterno de la persona.
     */
    @Column(name = "apellido_paterno", length = 50, nullable = false)
    private String apellidoPaterno;

    /**
     * Apellido materno de la persona.
     */
    @Column(name = "apellid_materno", length = 50)
    private String apellidoMaterno;

    /**
     * Número de teléfono de la persona.
     */
    @Column(name = "telefono", nullable = false)
    private String telefono;

    /**
     * Fecha de nacimiento de la persona.
     */
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Calendar fechaNacimiento;

    /**
     * Indica si la persona tiene discapacidad.
     */
    @Column(name = "discapacidad")
    private boolean discapacidad;

    /**
     * Lista de vehículos asociados a la persona.
     */
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    private List<Vehiculo> vehiculos;

    /**
     * Lista de trámites asociados a la persona.
     */
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL)
    private List<Tramite> tramites;

    /**
     * Constructor de la clase Persona.
     *
     * @param rfc              RFC de la persona.
     * @param nombre           Nombre de la persona.
     * @param apellidoPaterno  Apellido paterno de la persona.
     * @param apellidoMaterno  Apellido materno de la persona.
     * @param telefono         Número de teléfono de la persona.
     * @param fechaNacimiento Fecha de nacimiento de la persona.
     */
    public Persona(String rfc, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, Calendar fechaNacimiento) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Constructor de la clase Persona con discapacidad.
     *
     * @param rfc              RFC de la persona.
     * @param nombre           Nombre de la persona.
     * @param apellidoPaterno  Apellido paterno de la persona.
     * @param apellidoMaterno  Apellido materno de la persona.
     * @param telefono         Número de teléfono de la persona.
     * @param fechaNacimiento Fecha de nacimiento de la persona.
     * @param discapacidad     Indica si la persona tiene discapacidad.
     */
    public Persona(String rfc, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, Calendar fechaNacimiento, boolean discapacidad) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.discapacidad = discapacidad;
    }

    /**
     * Constructor por defecto de la clase Persona.
     */
    public Persona() {
    }

    // Getters y setters

    // toString

    /**
     * Obtiene el identificador único de la persona.
     *
     * @return Identificador único de la persona.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el identificador único de la persona.
     *
     * @param id Identificador único de la persona.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene el RFC de la persona.
     *
     * @return RFC de la persona.
     */
    public String getRfc() {
        return rfc;
    }

    /**
     * Establece el RFC de la persona.
     *
     * @param rfc RFC de la persona.
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return Nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre Nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido paterno de la persona.
     *
     * @return Apellido paterno de la persona.
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Establece el apellido paterno de la persona.
     *
     * @param apellidoPaterno Apellido paterno de la persona.
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    /**
     * Obtiene el apellido materno de la persona.
     *
     * @return Apellido materno de la persona.
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Establece el apellido materno de la persona.
     *
     * @param apellidoMaterno Apellido materno de la persona.
     */
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    /**
     * Obtiene el número de teléfono de la persona.
     *
     * @return Número de teléfono de la persona.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono de la persona.
     *
     * @param telefono Número de teléfono de la persona.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la fecha de nacimiento de la persona.
     *
     * @return Fecha de nacimiento de la persona.
     */
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento de la persona.
     *
     * @param fechaNacimiento Fecha de nacimiento de la persona.
     */
    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Indica si la persona tiene discapacidad.
     *
     * @return true si la persona tiene discapacidad, false en caso contrario.
     */
    public boolean isDiscapacidad() {
        return discapacidad;
    }

    /**
     * Establece si la persona tiene discapacidad.
     *
     * @param discapacidad true si la persona tiene discapacidad, false en caso contrario.
     */
    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    /**
     * Obtiene la lista de vehículos asociados a la persona.
     *
     * @return Lista de vehículos asociados a la persona.
     */
    public List<Vehiculo> getAutomoviles() {
        return vehiculos;
    }

    /**
     * Establece la lista de vehículos asociados a la persona.
     *
     * @param vehiculos Lista de vehículos asociados a la persona.
     */
    public void setAutomoviles(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    /**
     * Obtiene la lista de trámites asociados a la persona.
     *
     * @return Lista de trámites asociados a la persona.
     */
    public List<Tramite> getTramites() {
        return tramites;
    }

    /**
     * Establece la lista de trámites asociados a la persona.
     *
     * @param tramites Lista de trámites asociados a la persona.
     */
    public void setTramites(List<Tramite> tramites) {
        this.tramites = tramites;
    }

    /**
     * Retorna una representación en forma de cadena de la persona.
     *
     * @return Cadena que representa a la persona.
     */
    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", rfc='" + rfc + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", discapacidad=" + discapacidad +
                ", automoviles=" + vehiculos +
                ", tramites=" + tramites +
                '}';
    }
}
