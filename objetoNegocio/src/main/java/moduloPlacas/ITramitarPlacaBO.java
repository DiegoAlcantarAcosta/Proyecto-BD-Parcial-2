/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package moduloPlacas;

import persistencia.Persona;
import persistencia.Placa;
import persistencia.Vehiculo;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public interface ITramitarPlacaBO {
    public Placa registrarPlaca(Vehiculo vehiculo, float costo, String claveNumerica, Persona persona);
    public Placa getPlacaActiva(Vehiculo vehiculo);
}
