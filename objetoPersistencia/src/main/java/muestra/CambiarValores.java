/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muestra;

import daos.AutomovilDAO;
import daos.PlacaDAO;
import persistencia.Automovil;

/**
 *
 * @author Diego
 */
public class CambiarValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        AutomovilDAO automovil = new AutomovilDAO();
        PlacaDAO placas = new PlacaDAO();
        
        Automovil auto = automovil.obtener("123", "MEGH890123HDFR56");
        placas.desactivarPlaca(auto);
        
    }
    
}
