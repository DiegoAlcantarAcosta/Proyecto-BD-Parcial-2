/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *@author Héctor Francisco Báez Luque
 * @author Diego
 */

@Entity
@Table(name = "Automoviles")
@DiscriminatorValue("Automovil")
public class Automovil extends Vehiculo implements Serializable {

    /**
     * Número de serie del automóvil.
     */
    @Column(name = "num_serie", nullable = false, length = 17)
    private String numSerie;

    /**
     * Marca del automóvil.
     */
    @Column(name = "marca", nullable = false, length = 50)
    private String marca;

    /**
     * Línea del automóvil.
     */
    @Column(name = "linea", nullable = false, length = 50)
    private String linea;

    /**
     * Color del automóvil.
     */
    @Column(name = "color", nullable = false, length = 50)
    private String color;

    /**
     * Año de modelo del automóvil.
     */
    @Column(name = "modelo", nullable = false)
    private int modelo;

    /**
     * Constructor por defecto de la clase Automovil.
     */
    public Automovil() {
    }

    /**
     * Constructor de la clase Automovil.
     *
     * @param numSerie Número de serie del automóvil.
     * @param marca    Marca del automóvil.
     * @param linea    Línea del automóvil.
     * @param color    Color del automóvil.
     * @param modelo   Año de modelo del automóvil.
     */
    public Automovil(String numSerie, String marca, String linea, String color, int modelo) {
        this.numSerie = numSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
    }

    /**
     * Constructor de la clase Automovil con el propietario especificado.
     *
     * @param numSerie Número de serie del automóvil.
     * @param marca    Marca del automóvil.
     * @param linea    Línea del automóvil.
     * @param color    Color del automóvil.
     * @param modelo   Año de modelo del automóvil.
     * @param persona  Propietario del automóvil.
     */
    public Automovil(String numSerie, String marca, String linea, String color, int modelo, Persona persona) {
        super(persona);
        this.numSerie = numSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
    }

    /**
     * Obtiene el año de modelo del automóvil.
     *
     * @return Año de modelo del automóvil.
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * Establece el año de modelo del automóvil.
     *
     * @param modelo Año de modelo del automóvil.
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtiene el número de serie del automóvil.
     *
     * @return Número de serie del automóvil.
     */
    public String getNumSerie() {
        return numSerie;
    }

    /**
     * Establece el número de serie del automóvil.
     *
     * @param numSerie Número de serie del automóvil.
     */
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    /**
     * Obtiene la marca del automóvil.
     *
     * @return Marca del automóvil.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Establece la marca del automóvil.
     *
     * @param marca Marca del automóvil.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtiene la línea del automóvil.
     *
     * @return Línea del automóvil.
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Establece la línea del automóvil.
     *
     * @param linea Línea del automóvil.
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * Obtiene el color del automóvil.
     *
     * @return Color del automóvil.
     */
    public String getColor() {
        return color;
    }

    /**
     * Establece el color del automóvil.
     *
     * @param color Color del automóvil.
     */
    public void setColor(String color) {
        this.color = color;
    }
}
