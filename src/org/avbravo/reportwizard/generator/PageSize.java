/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.reportwizard.generator;

import org.avbravo.reportwizard.domains.MySession;

/**
 *
 * @author avbravo
 */
public class PageSize {

   private Integer pageWidth;
   private Integer pageHeight;
   private Integer columnWidth;
   private Integer leftMargin;
   private Integer rightMargin;
   private Integer topMargin;
   private Integer bottomMargin;
   private String  descripcion;
   private String  size;

    public Integer getPageWidth() {
        return pageWidth;
    }

    public void setPageWidth(Integer pageWidth) {
        this.pageWidth = pageWidth;
    }

    public Integer getPageHeight() {
        return pageHeight;
    }

    public void setPageHeight(Integer pageHeight) {
        this.pageHeight = pageHeight;
    }

    public Integer getColumnWidth() {
        return columnWidth;
    }

    public void setColumnWidth(Integer columnWidth) {
        this.columnWidth = columnWidth;
    }

    public Integer getLeftMargin() {
        return leftMargin;
    }

    public void setLeftMargin(Integer leftMargin) {
        this.leftMargin = leftMargin;
    }

    public Integer getRightMargin() {
        return rightMargin;
    }

    public void setRightMargin(Integer rightMargin) {
        this.rightMargin = rightMargin;
    }

    public Integer getTopMargin() {
        return topMargin;
    }

    public void setTopMargin(Integer topMargin) {
        this.topMargin = topMargin;
    }

    public Integer getBottomMargin() {
        return bottomMargin;
    }

    public void setBottomMargin(Integer bottomMargin) {
        this.bottomMargin = bottomMargin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    
    
    
    
    public PageSize() {
    }
    public PageSize(String size) {
        try {
            size = size.toLowerCase();
            switch(size){
                case "a4":
                    a4();
                    break;
                case "letter":
                    letter();
                    break;
                case "legal":
                    legal();
                    break;
                default:
                    MySession.error("Numero de pagina "+size + "no definido se usar A$");
                
            }
        } catch (Exception e) {
            MySession.error("PageSize() "+e.getLocalizedMessage());
        }
    }
    
    
    

    // <editor-fold defaultstate="collapsed" desc="a4()">                          
    public void a4() {
        try {
            pageWidth = 595;
            pageHeight = 842;
            columnWidth = 535;
            leftMargin = 20;
            rightMargin = 20;
            topMargin = 20;
            bottomMargin = 20;
            size="A4";
            descripcion="8.264 x 11.694";
        } catch (Exception e) {
            MySession.error("page812x11() " + e.getLocalizedMessage());
        }
    }
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="letter()">                          

    public  void letter() {
        try {       
            pageWidth = 612;
            pageHeight = 792;
            columnWidth = 572;
            leftMargin = 20;
            rightMargin = 20;
            topMargin = 20;
            bottomMargin = 20;
            descripcion= "8.5 x 11";
            size="LETTER";
        } catch (Exception e) {
            MySession.error("pageLetter() " + e.getLocalizedMessage());
        }
    }
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="legal()">                          

    public void legal() {
        try {

            pageWidth = 612;
            pageHeight = 1008;
            columnWidth = 572;
            leftMargin = 20;
            rightMargin = 20;
            topMargin = 20;
            bottomMargin = 20;
            size = "LEGAL";
            descripcion = "8.4 x 14 ";
        } catch (Exception e) {
            MySession.error("pageLetter() " + e.getLocalizedMessage());
        }
    }
    // </editor-fold> 
}
