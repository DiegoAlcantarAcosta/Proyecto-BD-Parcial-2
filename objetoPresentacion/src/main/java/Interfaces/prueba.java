/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interfaces;

import muestra.InsertarPersonas;

/**
 *
 * @author Diego
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        InsertarPersonas i = new InsertarPersonas();
        i.insertarPersonas();
        menuForm m = new menuForm();
        m.show();
    }
}
