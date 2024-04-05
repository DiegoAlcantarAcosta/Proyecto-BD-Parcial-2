/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces.daos;

import dtos.PersonaDTO;
import dtos.PlacaDTO;
import java.util.Date;
import java.util.List;
import persistencia.Placa;
import persistencia.Vehiculo;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public interface IPlacaDAO {
    
    public PlacaDTO registrarPlaca(Vehiculo vehiculo, float costo, String claveNumerica, PersonaDTO persona);
    public Placa getPlacaActiva(Vehiculo vehiculo);
    public void desactivarPlaca(Vehiculo vehiculo);
    public List<Placa> getPlacasPorRFC(String rfc);
    public List<Placa> reportePlacas(Date desde, Date hasta, String nombre);
    
}
