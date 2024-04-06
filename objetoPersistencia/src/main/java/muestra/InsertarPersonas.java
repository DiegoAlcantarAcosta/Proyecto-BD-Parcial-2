/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muestra;

import encriptador.EncriptadorAES256;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import persistencia.Persona;

/**
 *
 * @author Héctor Francisco Báez Luque
 * @author Diego Alcantar Acosta
 */
public class InsertarPersonas {

    public void insertarPersonas() throws Exception {

        ArrayList<Object> entidades = new ArrayList<>();

        GregorianCalendar fecha1 = new GregorianCalendar(2018, 6, 15);
        GregorianCalendar fecha2 = new GregorianCalendar(1999, 11, 30);
        GregorianCalendar fecha3 = new GregorianCalendar(2023, 3, 7);
        GregorianCalendar fecha4 = new GregorianCalendar(2011, 8, 22);
        GregorianCalendar fecha5 = new GregorianCalendar(1987, 1, 1);
        GregorianCalendar fecha6 = new GregorianCalendar(2006, 5, 27);
        GregorianCalendar fecha7 = new GregorianCalendar(2021, 10, 3);
        GregorianCalendar fecha8 = new GregorianCalendar(1994, 4, 14);
        GregorianCalendar fecha9 = new GregorianCalendar(2015, 9, 29);
        GregorianCalendar fecha10 = new GregorianCalendar(2003, 2, 18);
        GregorianCalendar fecha11 = new GregorianCalendar(2009, 7, 8);
        GregorianCalendar fecha12 = new GregorianCalendar(1992, 12, 31);
        GregorianCalendar fecha13 = new GregorianCalendar(2019, 0, 1);
        GregorianCalendar fecha14 = new GregorianCalendar(2007, 4, 5);
        GregorianCalendar fecha15 = new GregorianCalendar(1998, 9, 12);
        GregorianCalendar fecha16 = new GregorianCalendar(2013, 6, 30);
        GregorianCalendar fecha17 = new GregorianCalendar(2001, 11, 24);
        GregorianCalendar fecha18 = new GregorianCalendar(2020, 2, 29);
        GregorianCalendar fecha19 = new GregorianCalendar(2005, 7, 17);
        GregorianCalendar fecha20 = new GregorianCalendar(1990, 4, 1);

        EncriptadorAES256 encriptador = new EncriptadorAES256();

        Persona persona1 = new Persona("MEGH890123HDFR56", "Alejandro", "Hernández", "García", encriptador.encriptar("5512345678", 2), fecha20, true);
        Persona persona2 = new Persona("RDLJ950415MPLV87", "Fernanda", "Rodríguez", "Lara", encriptador.encriptar("5598765432", 1), fecha19, false);
        Persona persona3 = new Persona("SZMM800802HGTH09", "Miguel", "Sánchez", "Martínez", encriptador.encriptar("5587654321", 1), fecha18, true);
        Persona persona4 = new Persona("GVPE920601MDFQ45", "Gabriela", "Gómez", "Peña", encriptador.encriptar("5512345678", 1), fecha17, false);
        Persona persona5 = new Persona("LVCR730910HGTH23", "Roberto", "Lara", "Vázquez", encriptador.encriptar("5598765432", 1), fecha16, true);
        Persona persona6 = new Persona("MRNT890425MDFQ67", "Tania", "Moreno", "Ramos", encriptador.encriptar("5587654321", 1), fecha15, false);
        Persona persona7 = new Persona("QUBA751130HGTH89", "Arturo", "Quintero", "Barrera", encriptador.encriptar("5512345678", 1), fecha14, true);
        Persona persona8 = new Persona("SPJL830518MDFQ23", "Laura", "Sánchez", "Peña", encriptador.encriptar("5598765432", 1), fecha13, false);
        Persona persona9 = new Persona("DVZJ650907HGTH56", "Javier", "Díaz", "Vázquez", encriptador.encriptar("5587654321", 1), fecha12, true);
        Persona persona10 = new Persona("GOCM720215MDFQ89", "María", "Gómez", "Castillo", encriptador.encriptar("5512345678", 1), fecha11, false);
        Persona persona11 = new Persona("REPS860401HGTH12", "Pedro", "Reyes", "Sánchez", encriptador.encriptar("5598765432", 1), fecha10, true);
        Persona persona12 = new Persona("CVMJ770712MDFQ34", "Juana", "Castillo", "Vega", encriptador.encriptar("5587654321", 1), fecha9, false);
        Persona persona13 = new Persona("DLRH920903HGTH45", "Héctor", "Delgado", "Rodríguez", encriptador.encriptar("5512345678", 1), fecha8, true);
        Persona persona14 = new Persona("MVLG850320MDFQ56", "Gabriela", "Martínez", "Vega", encriptador.encriptar("5598765432", 1), fecha7, false);
        Persona persona15 = new Persona("HECJ790604HGTH67", "Javier", "Hernández", "Castillo", encriptador.encriptar("5587654321", 1), fecha6, true);
        Persona persona16 = new Persona("PMLR630815MDFQ78", "Rosa", "Pérez", "Martínez", encriptador.encriptar("5512345678", 1), fecha5, false);
        Persona persona17 = new Persona("GUZJ920110HGTH89", "Javier", "Gutiérrez", "Zárate", encriptador.encriptar("5598765432", 1), fecha4, true);
        Persona persona18 = new Persona("RVMD760221MDFQ01", "Daniela", "Ramírez", "Vega", encriptador.encriptar("5587654321", 1), fecha3, false);
        Persona persona19 = new Persona("HEZA840808HGTH12", "Alejandro", "Hernández", "Zárate", encriptador.encriptar("5512345678", 1), fecha2, true);
        Persona persona20 = new Persona("GOCR590915MDFQ23", "Raquel", "Gómez", "Castillo", encriptador.encriptar("5598765432", 1), fecha1, false);

        entidades.add(persona1);
        entidades.add(persona2);
        entidades.add(persona3);
        entidades.add(persona4);
        entidades.add(persona5);
        entidades.add(persona6);
        entidades.add(persona7);
        entidades.add(persona8);
        entidades.add(persona9);
        entidades.add(persona10);
        entidades.add(persona11);
        entidades.add(persona12);
        entidades.add(persona13);
        entidades.add(persona14);
        entidades.add(persona15);
        entidades.add(persona16);
        entidades.add(persona17);
        entidades.add(persona18);
        entidades.add(persona19);
        entidades.add(persona20);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ConexionPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        //persistimos todas las entidades almacenadas en la lista
        for (Object entidad : entidades) {
            em.persist(entidad); //cada vuelta almacena la entidad correspondiente
        }
        em.getTransaction().commit();

        em.close();
        emf.close();
    }

}
