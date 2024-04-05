/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class LicenciaException extends Exception{

    public LicenciaException() {
    }

    public LicenciaException(String message) {
        super(message);
    }

    public LicenciaException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
