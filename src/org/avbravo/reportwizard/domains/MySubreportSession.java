/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.reportwizard.domains;

import java.util.ArrayList;
import java.util.List;
import static org.avbravo.reportwizard.domains.MySession.error;
import org.avbravo.reportwizard.entity.Entidad;
import org.avbravo.reportwizard.lenguaje.Label;

/**
 *
 * @author avbravo
 */
public class MySubreportSession {
    public static String nameOfSubreport;
      static Boolean allTablesWithPrimaryKey = true;
 static List<Label> labelList = new ArrayList<>();
 static List<Entidad> entidadList = new ArrayList<>();
 static Entidad entidad = new Entidad();
 static String textJasperSubReport;
 
 
   static List<String> mensajesInformacion = new ArrayList<>();
   
   
   
       static String textJasperAll = "";
    static String textJasperDetails = "";

    public static String getTextJasperSubReport() {
        return textJasperSubReport;
    }

    public static void setTextJasperSubReport(String textJasperSubReport) {
        MySubreportSession.textJasperSubReport = textJasperSubReport;
    }

    
    
    
    
    
    public static String getTextJasperAll() {
        return textJasperAll;
    }

    public static void setTextJasperAll(String textJasperAll) {
        MySubreportSession.textJasperAll = textJasperAll;
    }

    public static String getTextJasperDetails() {
        return textJasperDetails;
    }

    public static void setTextJasperDetails(String textJasperDetails) {
        MySubreportSession.textJasperDetails = textJasperDetails;
    }
    
    

    public static List<String> getMensajesInformacion() {
        return mensajesInformacion;
    }

    public static void setMensajesInformacion(List<String> mensajesInformacion) {
        MySubreportSession.mensajesInformacion = mensajesInformacion;
    }

   
   
   
   
    public static Entidad getEntidad() {
        return entidad;
    }

    public static void setEntidad(Entidad entidad) {
        MySubreportSession.entidad = entidad;
    }
 
 

    public static Boolean getAllTablesWithPrimaryKey() {
        return allTablesWithPrimaryKey;
    }

    public static void setAllTablesWithPrimaryKey(Boolean allTablesWithPrimaryKey) {
        MySubreportSession.allTablesWithPrimaryKey = allTablesWithPrimaryKey;
    }

 
 
 
    public static List<Entidad> getEntidadList() {
        return entidadList;
    }

    public static void setEntidadList(List<Entidad> entidadList) {
        MySubreportSession.entidadList = entidadList;
    }
 

    public static List<Label> getLabelList() {
        return labelList;
    }

    public static void setLabelList(List<Label> labelList) {
        MySubreportSession.labelList = labelList;
    }
 
 
 
 
    public static String getNameOfSubreport() {
        return nameOfSubreport;
    }

    public static void setNameOfSubreport(String nameOfSubreport) {
        MySubreportSession.nameOfSubreport = nameOfSubreport;
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="inicializarLabelList(">                          
    public static void inicializarLabelList(){
        try {
            labelList = new ArrayList<>();
        } catch (Exception e) {
            error("inicializarLabelList() "+e.getLocalizedMessage());
        }
    }
    // </editor-fold> 
    
}
