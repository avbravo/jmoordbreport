/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.jmoordbreport.generator;

/**
 *
 * @author avbravo
 */
public class ReportAllSession {

    static String pageSize = "A4";

    //---------------------------------------
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

    public static String getPageSize() {
        return pageSize;
    }

    public static void setPageSize(String pageSize) {
        ReportAllSession.pageSize = pageSize;
    }

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

    public static Boolean getSummaryShowField() {
        return summaryShowField;
    }

    public static void setSummaryShowField(Boolean summaryShowField) {
        ReportAllSession.summaryShowField = summaryShowField;
    }

    public static String getSummaryVariableName() {
        return summaryVariableName;
    }

    public static void setSummaryVariableName(String summaryVariableName) {
        ReportAllSession.summaryVariableName = summaryVariableName;
    }

    public static String getSummaryVariableType() {
        return summaryVariableType;
    }

    public static void setSummaryVariableType(String summaryVariableType) {
        ReportAllSession.summaryVariableType = summaryVariableType;
    }

    public static String getSummaryVariableExpression() {
        return summaryVariableExpression;
    }

    public static void setSummaryVariableExpression(String summaryVariableExpression) {
        ReportAllSession.summaryVariableExpression = summaryVariableExpression;
    }

    public static String getSummaryCalculation() {
        return summaryCalculation;
    }

    public static void setSummaryCalculation(String summaryCalculation) {
        ReportAllSession.summaryCalculation = summaryCalculation;
    }

    public static String getSummaryStaticText() {
        return summaryStaticText;
    }

    public static void setSummaryStaticText(String summaryStaticText) {
        ReportAllSession.summaryStaticText = summaryStaticText;
    }

    public static String getSummaryTextFieldExpression() {
        return summaryTextFieldExpression;
    }

    public static void setSummaryTextFieldExpression(String summaryTextFieldExpression) {
        ReportAllSession.summaryTextFieldExpression = summaryTextFieldExpression;
    }

}
