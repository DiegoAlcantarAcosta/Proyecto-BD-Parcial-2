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

    
    @Override
    public Placa registrarPlaca(Vehiculo vehiculo, float costo, String claveNumerica, Persona persona) {
        PlacaDAO placa = new PlacaDAO();
        return placa.registrarPlaca(vehiculo, costo, claveNumerica, persona);
    }

    @Override
    public Placa getPlacaActiva(Vehiculo vehiculo) {
       PlacaDAO placa = new PlacaDAO();
       return placa.getPlacaActiva(vehiculo);
    }
    
}
