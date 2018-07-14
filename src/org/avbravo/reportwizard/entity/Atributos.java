/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.reportwizard.entity;

/**
 *
 * @author avbravoserver
 */
public class Atributos {

    private String tipo;
    private String nombre;
    private Boolean esPrimaryKey;
    private Boolean esEmbedded;
    private Boolean esReferenced;
    private Boolean esListEmbedded;
    private Boolean esListReferenced;
    private Boolean esList;
    private String  label;

    public Atributos() {
    }

    public Atributos(String tipo, String nombre, Boolean esPrimaryKey, Boolean esEmbedded, Boolean esReferenced, Boolean esListEmbedded, Boolean esListReferenced, Boolean esList, String label) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.esPrimaryKey = esPrimaryKey;
        this.esEmbedded = esEmbedded;
        this.esReferenced = esReferenced;
        this.esListEmbedded = esListEmbedded;
        this.esListReferenced = esListReferenced;
        this.esList = esList;
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

  

    public Boolean getEsList() {
        return esList;
    }

    public void setEsList(Boolean esList) {
        this.esList = esList;
    }

    
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEsPrimaryKey() {
        return esPrimaryKey;
    }

    public void setEsPrimaryKey(Boolean esPrimaryKey) {
        this.esPrimaryKey = esPrimaryKey;
    }

    public Boolean getEsEmbedded() {
        return esEmbedded;
    }

    public void setEsEmbedded(Boolean esEmbedded) {
        this.esEmbedded = esEmbedded;
    }

    public Boolean getEsReferenced() {
        return esReferenced;
    }

    public void setEsReferenced(Boolean esReferenced) {
        this.esReferenced = esReferenced;
    }

    public Boolean getEsListEmbedded() {
        return esListEmbedded;
    }

    public void setEsListEmbedded(Boolean esListEmbedded) {
        this.esListEmbedded = esListEmbedded;
    }

    public Boolean getEsListReferenced() {
        return esListReferenced;
    }

    public void setEsListReferenced(Boolean esListReferenced) {
        this.esListReferenced = esListReferenced;
    }

}
