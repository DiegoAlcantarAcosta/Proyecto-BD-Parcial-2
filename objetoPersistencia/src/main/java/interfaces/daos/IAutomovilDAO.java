/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces.daos;

import persistencia.Automovil;
import persistencia.Persona;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public interface IAutomovilDAO{
    
    public Automovil registrar(String numSerie, String marca, String linea, String color, int modelo, Persona persona);
    public boolean existeAutomovil(String numSerie);
    public Automovil obtener(String numSerie, String rfc);
    public Automovil obtenerPorNumeroSerie(String numSerie);
    public Automovil obtenerPorPlacas(String claveNumerica, String rfc);
    
}
