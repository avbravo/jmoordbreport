/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.reportwizard.generator;

import static org.avbravo.reportwizard.generator.ReportAllSession.summaryShowField;

/**
 *
 * @author avbravo
 */
public class ReportDetailsSession {
static String pageSize="A4";
    
    /**
     * Details
     */
    static String groupname = "";
    static String groupExpression = "";
    static String staticTextGroupHeader = "";
    static String textFieldExpressionHeader = "";
    static String staticTextGroupFooter = "";
    static String textFieldExpressionFooter = "";
    static String variableTypeGroup = "";
    static String variableGroup = "";
    static String calculation = "";
    static Boolean writeTextoReport = false;
    static Boolean writeLineaReport = false;
    /*
    --------------------------------------
    //     summary
    --------------------------------------
     */
    static Boolean summaryShowField = false;
    //Variable
    static String summaryVariableName = "";
    static String summaryVariableType = "";
    static String summaryVariableExpression = "";
    static String summaryCalculation = "";
    //Summary band
    static String summaryStaticText = "";
    static String summaryTextFieldExpression = "";

    public static void inicializar() {
        groupname = "";
        groupExpression = "";
        staticTextGroupHeader = "";
        textFieldExpressionHeader = "";
        staticTextGroupFooter = "";
        textFieldExpressionFooter = "";
        variableTypeGroup = "";
        variableGroup = "";
        calculation = "";
        writeTextoReport = false;
        writeLineaReport = false;
        // summary
        summaryShowField = false;

        summaryVariableName = "";
        summaryVariableType = "";
        summaryVariableExpression = "";
        summaryCalculation = "";

        summaryStaticText = "";
        summaryTextFieldExpression = "";
    }
    public static void inicializarSummary() {
       
        // summary
        summaryShowField = false;

        summaryVariableName = "";
        summaryVariableType = "";
        summaryVariableExpression = "";
        summaryCalculation = "";

        summaryStaticText = "";
        summaryTextFieldExpression = "";
    }

    public static String getPageSize() {
        return pageSize;
    }

    public static void setPageSize(String pageSize) {
        ReportDetailsSession.pageSize = pageSize;
    }

    
    
    
    public static String getGroupname() {
        return groupname;
    }

    public static void setGroupname(String groupname) {
        ReportDetailsSession.groupname = groupname;
    }

    public static String getGroupExpression() {
        return groupExpression;
    }

    public static void setGroupExpression(String groupExpression) {
        ReportDetailsSession.groupExpression = groupExpression;
    }

    public static String getStaticTextGroupHeader() {
        return staticTextGroupHeader;
    }

    public static void setStaticTextGroupHeader(String staticTextGroupHeader) {
        ReportDetailsSession.staticTextGroupHeader = staticTextGroupHeader;
    }

    public static String getTextFieldExpressionHeader() {
        return textFieldExpressionHeader;
    }

    public static void setTextFieldExpressionHeader(String textFieldExpressionHeader) {
        ReportDetailsSession.textFieldExpressionHeader = textFieldExpressionHeader;
    }

    public static String getStaticTextGroupFooter() {
        return staticTextGroupFooter;
    }

    public static void setStaticTextGroupFooter(String staticTextGroupFooter) {
        ReportDetailsSession.staticTextGroupFooter = staticTextGroupFooter;
    }

    public static String getTextFieldExpressionFooter() {
        return textFieldExpressionFooter;
    }

    public static void setTextFieldExpressionFooter(String textFieldExpressionFooter) {
        ReportDetailsSession.textFieldExpressionFooter = textFieldExpressionFooter;
    }

    public static String getVariableTypeGroup() {
        return variableTypeGroup;
    }

    public static void setVariableTypeGroup(String variableTypeGroup) {
        ReportDetailsSession.variableTypeGroup = variableTypeGroup;
    }

    public static String getVariableGroup() {
        return variableGroup;
    }

    public static void setVariableGroup(String variableGroup) {
        ReportDetailsSession.variableGroup = variableGroup;
    }

    public static String getCalculation() {
        return calculation;
    }

    public static void setCalculation(String calculation) {
        ReportDetailsSession.calculation = calculation;
    }

    public static Boolean getWriteTextoReport() {
        return writeTextoReport;
    }

    public static void setWriteTextoReport(Boolean writeTextoReport) {
        ReportDetailsSession.writeTextoReport = writeTextoReport;
    }

    public static Boolean getWriteLineaReport() {
        return writeLineaReport;
    }

    public static void setWriteLineaReport(Boolean writeLineaReport) {
        ReportDetailsSession.writeLineaReport = writeLineaReport;
    }

    public static Boolean getSummaryShowField() {
        return summaryShowField;
    }

    public static void setSummaryShowField(Boolean summaryShowField) {
        ReportDetailsSession.summaryShowField = summaryShowField;
    }

    public static String getSummaryVariableName() {
        return summaryVariableName;
    }

    public static void setSummaryVariableName(String summaryVariableName) {
        ReportDetailsSession.summaryVariableName = summaryVariableName;
    }

    public static String getSummaryVariableType() {
        return summaryVariableType;
    }

    public static void setSummaryVariableType(String summaryVariableType) {
        ReportDetailsSession.summaryVariableType = summaryVariableType;
    }

    public static String getSummaryVariableExpression() {
        return summaryVariableExpression;
    }

    public static void setSummaryVariableExpression(String summaryVariableExpression) {
        ReportDetailsSession.summaryVariableExpression = summaryVariableExpression;
    }

    public static String getSummaryCalculation() {
        return summaryCalculation;
    }

    public static void setSummaryCalculation(String summaryCalculation) {
        ReportDetailsSession.summaryCalculation = summaryCalculation;
    }

    public static String getSummaryStaticText() {
        return summaryStaticText;
    }

    public static void setSummaryStaticText(String summaryStaticText) {
        ReportDetailsSession.summaryStaticText = summaryStaticText;
    }

    public static String getSummaryTextFieldExpression() {
        return summaryTextFieldExpression;
    }

    public static void setSummaryTextFieldExpression(String summaryTextFieldExpression) {
        ReportDetailsSession.summaryTextFieldExpression = summaryTextFieldExpression;
    }

  
}
