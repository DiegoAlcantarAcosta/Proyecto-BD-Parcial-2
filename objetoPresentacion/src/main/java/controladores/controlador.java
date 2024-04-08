/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import Interfaces.consultas1Form;
import Interfaces.consultas2Form;
import Interfaces.licenciasForm;
import Interfaces.licenciasForm2;
import Interfaces.menuForm;
import Interfaces.placasAutoNuevo1;
import Interfaces.placasAutoNuevo2;
import Interfaces.placasAutoUsado1;
import Interfaces.placasAutoUsado2;
import Interfaces.placasAutoUsadoForm;
import Interfaces.placasForm;
import daos.AutomovilDAO;
import daos.LicenciaDAO;
import daos.PersonaDAO;
import daos.PlacaDAO;
import java.text.ParseException;
import java.util.Date;
import persistencia.Automovil;
import persistencia.Persona;

/**
 *
 * @author Diego
 */
public class controlador {

    LicenciaDAO licencias = new LicenciaDAO();
    AutomovilDAO autos = new AutomovilDAO();
    PlacaDAO placas = new PlacaDAO();
    PersonaDAO personas = new PersonaDAO();

    public void menuALicencia() {
        licenciasForm a = new licenciasForm();
        a.show();
    }

    public void menuAPlacas() {
        placasForm a = new placasForm();
        a.show();
    }

    public void licencia1ALicencia2(String rfc) throws Exception {
        licenciasForm2 a = new licenciasForm2(rfc);
        a.show();
    }

    public void licenciasAMenu() {
        menuForm m = new menuForm();
        m.show();
    }

    public void licencias2AMenu(String rfc, int vigencia, float costo) {
        menuForm m = new menuForm();
        licencias.registrar(rfc, vigencia, costo);
        m.show();
    }

    public void licencias2ALicencia1() {
        licenciasForm a = new licenciasForm();
        a.show();
    }

    public void placasAMenu() {
        menuForm m = new menuForm();
        m.show();
    }

    public void placasAutoNuevo1(String rfc) {
        placasAutoNuevo1 a = new placasAutoNuevo1(rfc);
        a.show();
    }

    public void placasAutoUsado1(String rfc) {
        placasAutoUsadoForm a = new placasAutoUsadoForm(rfc);
        a.show();
    }

    public void placas1APlacas2(String rfc, Automovil automovil) {
        placasAutoNuevo2 a = new placasAutoNuevo2(rfc, automovil);
        a.show();
    }

    public void placas2APlacas1(String rfc) {
        placasAutoNuevo1 a = new placasAutoNuevo1(rfc);
        a.show();
    }

    public void pagarAutoNuevo(String rfc, int costo, Automovil auto) {
        Persona vato = personas.getPersona(rfc);
         
        placas.registrarPlaca(auto, costo, placas.numAlfaNiumerico(), vato);
        menuForm m = new menuForm();
        m.show();
    }
    
    public void placas1APlacas() {
        placasForm a = new placasForm();
        a.show();
    }
    
    public void placasformAPlacas1(String rfc, String numSerie) {
        placasAutoUsado1 a = new placasAutoUsado1(rfc, numSerie);
        a.show();
    }
    
    public void Placas1AplacasForm() {
        placasForm a = new placasForm();
        a.show();
    }
    
     public void Placas1Aplacas2(String rfc, String numSerie) {
        placasAutoUsado2 a = new placasAutoUsado2(rfc, numSerie);
        a.show();
    }
    
     public void menuAConsultas1() {
         consultas1Form c = new consultas1Form();
        c.show();
    }
     
     public void consultas1Aconsultas2(String tipoConsulta, String buscarPor, String dato) throws ParseException {
         consultas2Form c = new consultas2Form( tipoConsulta, buscarPor, dato);
        c.show();
    }
     
     public void consultas1Aconsultas2(String tipoConsulta, String buscarPor, Date dato) throws ParseException {
         consultas2Form c = new consultas2Form( tipoConsulta, buscarPor, dato);
        c.show();
    }
}
