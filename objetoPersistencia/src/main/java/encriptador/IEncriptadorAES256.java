/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package encriptador;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public interface IEncriptadorAES256 {
    
    public String encriptar(String textoOriginal) throws Exception;
    public String desencriptar(String textoEncriptado) throws Exception;
    
}