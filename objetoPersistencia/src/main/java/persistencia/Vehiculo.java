/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *@author Héctor Francisco Báez Luque
 * @author Diego
 */

/**
 * Clase que representa un vehículo.
 */
@Entity
@Table(name="Vehiculos")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_vehiculo", discriminatorType = DiscriminatorType.STRING)
public class Vehiculo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    /**
     * Identificador único del vehículo.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    /**
     * Persona propietaria del vehículo.
     */
    @ManyToOne(cascade = CascadeType.PERSIST) 
    @JoinColumn(name = "persona_id", nullable = false)
    private Persona persona;
    
    /**
     * Lista de placas asociadas al vehículo.
     */
    @OneToMany(mappedBy = "vehiculo")
    private List<Placa> placas;

    /**
     * Constructor por defecto de la clase Vehiculo.
     */
    public Vehiculo() {
    }
    
    /**
     * Constructor de la clase Vehiculo.
     *
     * @param persona Persona propietaria del vehículo.
     */
    public Vehiculo(Persona persona) {
        this.persona = persona;
    }

    // Getters y setters

    // toString

    /**
     * Obtiene el identificador único del vehículo.
     *
     * @return Identificador único del vehículo.
     */
    public Long getId() {
        return id;
    }

    /**
     * Establece el identificador único del vehículo.
     *
     * @param id Identificador único del vehículo.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Obtiene la lista de placas asociadas al vehículo.
     *
     * @return Lista de placas asociadas al vehículo.
     */
    public List<Placa> getPlacas() {
        return placas;
    }

    /**
     * Establece la lista de placas asociadas al vehículo.
     *
     * @param placas Lista de placas asociadas al vehículo.
     */
    public void setPlacas(List<Placa> placas) {
        this.placas = placas;
    }

    /**
     * Obtiene la persona propietaria del vehículo.
     *
     * @return Persona propietaria del vehículo.
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Establece la persona propietaria del vehículo.
     *
     * @param persona Persona propietaria del vehículo.
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     * Retorna una representación en forma de cadena del vehículo.
     *
     * @return Cadena que representa el vehículo.
     */
    @Override
    public String toString() {
        return "Vehiculo{" +
                "id=" + id +
                ", persona=" + persona +
                ", placas=" + placas +
                '}';
    }
    
}
