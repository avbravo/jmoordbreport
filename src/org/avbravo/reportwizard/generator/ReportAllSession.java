/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.reportwizard.generator;

/**
 *
 * @author avbravo
 */
public class ReportAllSession {

    static String variableGroup = "";
    static String variableTypeGroup = "";
    static String groupname = "";
    static String groupExpression = "";
    static String staticTextGroupHeader = "";
    static String textFieldExpressionHeader = "";
    static String staticTextGroupFooter = "";
    static String textFieldExpressionFooter = "";
    static String calculation = "";

    static Boolean writeTextoReport = false;
        static Boolean writeLineaReport = false;

    public static void inicializar() {
        variableGroup = "";
        variableTypeGroup = "";
        groupname = "";
        groupExpression = "";
        staticTextGroupHeader = "";
        textFieldExpressionHeader = "";
        staticTextGroupFooter = "";
        textFieldExpressionFooter = "";
        calculation = "";
        writeTextoReport = false;        
       writeLineaReport = false;
    }

public static String getVariableGroup() {
        return variableGroup;
    }

    public static void setVariableGroup(String variableGroup) {
        ReportAllSession.variableGroup = variableGroup;
    }

    public static String getVariableTypeGroup() {
        return variableTypeGroup;
    }

    public static void setVariableTypeGroup(String variableTypeGroup) {
        ReportAllSession.variableTypeGroup = variableTypeGroup;
    }

    public static String getGroupname() {
        return groupname;
    }

    public static void setGroupname(String groupname) {
        ReportAllSession.groupname = groupname;
    }

    public static String getGroupExpression() {
        return groupExpression;
    }

    public static void setGroupExpression(String groupExpression) {
        ReportAllSession.groupExpression = groupExpression;
    }

    public static String getStaticTextGroupHeader() {
        return staticTextGroupHeader;
    }

    public static void setStaticTextGroupHeader(String staticTextGroupHeader) {
        ReportAllSession.staticTextGroupHeader = staticTextGroupHeader;
    }

    public static String getTextFieldExpressionHeader() {
        return textFieldExpressionHeader;
    }

    public static void setTextFieldExpressionHeader(String textFieldExpressionHeader) {
        ReportAllSession.textFieldExpressionHeader = textFieldExpressionHeader;
    }

    public static String getStaticTextGroupFooter() {
        return staticTextGroupFooter;
    }

    public static void setStaticTextGroupFooter(String staticTextGroupFooter) {
        ReportAllSession.staticTextGroupFooter = staticTextGroupFooter;
    }

    public static String getTextFieldExpressionFooter() {
        return textFieldExpressionFooter;
    }

    public static void setTextFieldExpressionFooter(String textFieldExpressionFooter) {
        ReportAllSession.textFieldExpressionFooter = textFieldExpressionFooter;
    }

    public static String getCalculation() {
        return calculation;
    }

    public static void setCalculation(String calculation) {
        ReportAllSession.calculation = calculation;
    }

    public static Boolean getWriteTextoReport() {
        return writeTextoReport;
    }

    public static void setWriteTextoReport(Boolean writeTextoReport) {
        ReportAllSession.writeTextoReport = writeTextoReport;
    }

    public static Boolean getWriteLineaReport() {
        return writeLineaReport;
    }

    public static void setWriteLineaReport(Boolean writeLineaReport) {
        ReportAllSession.writeLineaReport = writeLineaReport;
    }

   
    

   
    
}
