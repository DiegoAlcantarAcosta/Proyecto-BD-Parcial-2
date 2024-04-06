/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encriptador;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class EncriptadorAES256 implements IEncriptadorAES256 {

    @Override
    public String encriptar(String text, int shift) {
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                char shifted = (char) (c + shift);
                if (Character.isLowerCase(c)) {
                    if (shifted > 'z') {
                        shifted -= 26;
                    } else if (shifted < 'a') {
                        shifted += 26;
                    }
                } else if (Character.isUpperCase(c)) {
                    if (shifted > 'Z') {
                        shifted -= 26;
                    } else if (shifted < 'A') {
                        shifted += 26;
                    }
                }
                encryptedText.append(shifted);
            } else {
                encryptedText.append(c);
            }
        }
        return encryptedText.toString();
    }

    @Override
     public String desencriptar(String encryptedText, int shift) {
        return encriptar(encryptedText, -shift);
    }

}
