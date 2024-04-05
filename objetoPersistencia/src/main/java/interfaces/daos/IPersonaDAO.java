/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces.daos;

import java.util.Date;
import java.util.List;
import persistencia.Persona;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public interface IPersonaDAO {
    
    public void registrar(Persona persona);
    public boolean personaRegistrada(String rfc);
    public Persona getPersona(String rfc);
    public Persona consultarPersona(String rfc);
    public boolean esMayorDeEdad(String rfc);
    public List<Persona> buscarPersonaPorNombreSimilar(String nombre);
    public List<Persona> buscarPersonaPorFechaNacimiento(Date fechaNacimiento);
    
}
