/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

import java.util.List;
import persistencia.Persona;
import persistencia.Placa;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class AutomovilDTO {
    
    private String num_serie, marca, linea, color;
    private Integer modelo;
    private Persona persona;

   /**
     * Constructor vacío de la clase AutomovilDTO.
     */
    public AutomovilDTO() {
    }
    
    /**
     * Constructor de la clase AutomovilDTO que inicializa los atributos.
     * 
     * @param num_serie Número de serie del automóvil.
     * @param marca Marca del automóvil.
     * @param linea Línea del automóvil.
     * @param color Color del automóvil.
     * @param modelo Año modelo del automóvil.
     */
    public AutomovilDTO(String num_serie, String marca, String linea, String color, Integer modelo) {
        this.num_serie = num_serie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
    }

    /**
     * Método para obtener el número de serie del automóvil.
     * 
     * @return El número de serie del automóvil.
     */
    public String getNum_serie() {
        return num_serie;
    }

    /**
     * Método para establecer el número de serie del automóvil.
     * 
     * @param num_serie El número de serie del automóvil.
     */
    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    /**
     * Método para obtener la marca del automóvil.
     * 
     * @return La marca del automóvil.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método para establecer la marca del automóvil.
     * 
     * @param marca La marca del automóvil.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método para obtener la línea del automóvil.
     * 
     * @return La línea del automóvil.
     */
    public String getLinea() {
        return linea;
    }

    /**
     * Método para establecer la línea del automóvil.
     * 
     * @param linea La línea del automóvil.
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }

    /**
     * Método para obtener el color del automóvil.
     * 
     * @return El color del automóvil.
     */
    public String getColor() {
        return color;
    }

    /**
     * Método para establecer el color del automóvil.
     * 
     * @param color El color del automóvil.
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Método para obtener el modelo del automóvil.
     * 
     * @return El año modelo del automóvil.
     */
    public Integer getModelo() {
        return modelo;
    }

    /**
     * Método para establecer el modelo del automóvil.
     * 
     * @param modelo El año modelo del automóvil.
     */
    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    /**
     * Método para obtener la persona propietaria del automóvil.
     * 
     * @return La persona propietaria del automóvil.
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Método para establecer la persona propietaria del automóvil.
     * 
     * @param persona La persona propietaria del automóvil.
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     * Retorna una representación en cadena del objeto AutomovilDTO.
     * 
     * @return Una cadena que representa el objeto AutomovilDTO.
     */
    @Override
    public String toString() {
        return "AutomovilDTO{" + "num_serie=" + num_serie + ", marca=" + marca + ", linea=" + linea + ", color=" + color + ", modelo=" + modelo + ", persona=" + persona + '}';
    }
}
