/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Interfaces.licenciasForm;
import Interfaces.licenciasForm2;
import Interfaces.menuForm;
import Interfaces.placasForm;

/**
 *
 * @author Diego
 */
public class controlador {
    
    public void menuALicencia (){
        licenciasForm a = new licenciasForm();
       a.show();
    }
    
    public void menuAPlacas (){
        placasForm a = new placasForm();
       a.show();
    }
    
    public void licencia1ALicencia2 (String rfc){
        licenciasForm2 a = new licenciasForm2(rfc);
        a.show();
    }
    
    public void licenciasAMenu (){
        menuForm m = new menuForm();
        m.show();
    }
    
     public void licencias2AMenu (){
        menuForm m = new menuForm();
        m.show();
    }
     
      public void licencias2ALicencia1 (){
        licenciasForm a= new licenciasForm();
        a.show();
    }
}
