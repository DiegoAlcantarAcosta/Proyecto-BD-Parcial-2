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
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
@Entity
@Table(name = "Automoviles")
@DiscriminatorValue("Automovil")
public class Automovil extends Vehiculo implements Serializable {

    @Column(name = "num_serie", nullable = false, length = 17)
    private String numSerie;

    @Column(name = "marca", nullable = false, length = 50)
    private String marca;

    @Column(name = "linea", nullable = false, length = 50)
    private String linea;

    @Column(name = "color", nullable = false, length = 50)
    private String color;

    @Column(name = "modelo", nullable = false)
    private int modelo;

    public Automovil() {
    }

    public Automovil(String numSerie, String marca, String linea, String color, int modelo) {
        this.numSerie = numSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
    }
    
    public Automovil(String numSerie, String marca, String linea, String color, int modelo, Persona persona) {
        super(persona);
        this.numSerie = numSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
