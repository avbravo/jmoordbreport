/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.jmoordbreport.lenguaje;

/**
 *
 * @author avbravo
 */
public class Label {
    private String field;
    private String label;

    public Label() {
    }

    public Label(String field, String label) {
        this.field = field;
        this.label = label;
    }

    
    
    
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
}
