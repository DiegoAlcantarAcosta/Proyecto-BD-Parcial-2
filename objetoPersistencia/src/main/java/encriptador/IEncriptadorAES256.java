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
     /**
     * Metodo para encriptar
     * @param text tecto
     * @param shift codigo
     * @return  string
     */
    public String encriptar(String text, int shift);
    
    /**
  *  metodo para desencriptar
  * @param encryptedText texto
  * @param shift clave
  * @return  String
  */
    public String desencriptar(String encryptedText, int shift);
}