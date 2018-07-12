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
    public String template(){
        try {
            
            String texto="@Page(size=\"A4\", report=\"all/details\")\n"
                    +"@Group(field=\"\", operation=\"Sum\", header=\"Grupo:\", footer=\"Total:\",  report=\"all/details\")\n"
                    +"@Summary(field=\"\", operation=\"Sum\", label=\"Summary:\",  report=\"all/details\")";
          
return texto;
        } catch (Exception e) {
            MySession.error("template() "+e.getLocalizedMessage());
        }
        return "";
    }
}
