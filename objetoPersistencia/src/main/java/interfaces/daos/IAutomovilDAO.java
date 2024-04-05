/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces.daos;

import dtos.AutomovilDTO;
import persistencia.Automovil;
import persistencia.Persona;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public interface IAutomovilDAO{
    
    public AutomovilDTO registrar(String numSerie, String marca, String linea, String color, int modelo, Persona persona);
    public boolean existeAutomovil(String numSerie);
    public AutomovilDTO obtener(String numSerie, String rfc);
    public Automovil obtenerPorNumeroSerie(String numSerie);
    public AutomovilDTO obtenerPorPlacas(String claveNumerica, String rfc);
    
}
