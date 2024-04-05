/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encriptador;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class EncriptadorAES256 implements IEncriptadorAES256{
    
    @Override
    public String encriptar(String textoOriginal) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        SecretKey claveSecreta = keyGen.generateKey();

        Cipher cifrador = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cifrador.init(Cipher.ENCRYPT_MODE, claveSecreta);

        byte[] textoEnBytes = textoOriginal.getBytes(StandardCharsets.UTF_8);
        byte[] textoEncriptadoBytes = cifrador.doFinal(textoEnBytes);

        return Base64.getEncoder().encodeToString(textoEncriptadoBytes);
    }

    @Override
    public String desencriptar(String textoEncriptado) throws Exception {
        byte[] textoEncriptadoBytes = Base64.getDecoder().decode(textoEncriptado);

        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        SecretKey claveSecreta = keyGen.generateKey();

        Cipher cifrador = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cifrador.init(Cipher.DECRYPT_MODE, claveSecreta);

        byte[] textoDesencriptadoBytes = cifrador.doFinal(textoEncriptadoBytes);

        return new String(textoDesencriptadoBytes, StandardCharsets.UTF_8);
    }
    
}
