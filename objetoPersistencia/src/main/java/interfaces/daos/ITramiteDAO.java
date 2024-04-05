/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces.daos;

import java.util.Date;
import java.util.List;
import persistencia.Tramite;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public interface ITramiteDAO {
    
    public List<Tramite> obtenerTramitesPorRFC(String rfc);
    public List<Object[]> reporteTramites();
    public List<Tramite> buscarTramites(Date desde, Date hasta, String nombre);
    
}
