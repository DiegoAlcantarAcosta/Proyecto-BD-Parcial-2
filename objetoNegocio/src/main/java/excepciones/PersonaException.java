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
public class PersonaException extends Exception{

    public PersonaException() {
    }

    public PersonaException(String message) {
        super(message);
    }

    public PersonaException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
