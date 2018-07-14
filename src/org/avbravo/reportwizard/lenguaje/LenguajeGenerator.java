/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.reportwizard.lenguaje;

import org.avbravo.reportwizard.domains.MySession;

/**
 *
 * @author avbravo
 */
public class LenguajeGenerator {

    public String template() {
        try {

            String texto = "Page {\n"
                    + "       size:\"A4\",\n"
                    + "      }\n"
                    + "Group {\n"
                    + "       field:\"\",\n"                   
                    + "       staticTextHeader:\"\",\n" 
                    + "       staticTexFooter:\"\",\n"
                    + "       fieldFooter:\"\",\n"
                    + "       operation:\"Sum\"\n"                    
                    + "       }\n"
                    + "Summary{\n"
                    + "        staticText:\"\",\n"
                    + "        field:\"\",\n"
                    + "        operation:\"Sum\"\n"
                    + "        }\n";

            return texto;
        } catch (Exception e) {
            MySession.error("template() " + e.getLocalizedMessage());
        }
        return "";
    }
}
