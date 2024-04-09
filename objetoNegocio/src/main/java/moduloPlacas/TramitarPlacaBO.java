/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduloPlacas;

import daos.PlacaDAO;
import persistencia.Persona;
import persistencia.Placa;
import persistencia.Vehiculo;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class TramitarPlacaBO implements ITramitarPlacaBO {

    
    /**
     * Registra una nueva placa para el vehículo dado con el costo, clave numérica y persona asociados especificados.
     * 
     * @param vehiculo El vehículo al cual se está registrando la placa.
     * @param costo El costo de la placa.
     * @param claveNumerica La clave numérica de la placa.
     * @param persona La persona asociada a la placa.
     * @return La placa registrada.
     */
    @Override
    public Placa registrarPlaca(Vehiculo vehiculo, float costo, String claveNumerica, Persona persona) {
        PlacaDAO placa = new PlacaDAO();
        return placa.registrarPlaca(vehiculo, costo, claveNumerica, persona);
    }

    /**
     * Obtiene la placa activa para el vehículo dado.
     * 
     * @param vehiculo El vehículo para el cual se quiere obtener la placa activa.
     * @return La placa activa para el vehículo dado, o null si no hay ninguna placa activa.
     */
    @Override
    public Placa getPlacaActiva(Vehiculo vehiculo) {
        PlacaDAO placa = new PlacaDAO();
        return placa.getPlacaActiva(vehiculo);
    }
    
}
