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
public class VehiculoException extends Exception {

    public VehiculoException() {
    }

    public VehiculoException(String message) {
        super(message);
    }

    public VehiculoException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
