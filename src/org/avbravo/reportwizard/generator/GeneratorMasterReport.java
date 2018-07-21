/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.avbravo.reportwizard.generator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import net.sf.jasperreports.engine.JasperCompileManager;
import org.avbravo.reportwizard.entity.Atributos;
import org.avbravo.reportwizard.entity.Entidad;
import org.avbravo.reportwizard.domains.MySession;
import org.avbravo.reportwizard.domains.Utilidades;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;

/**
 *
 * @author avbravo
 */
public class GeneratorMasterReport {

    private String titulo;

    // <editor-fold defaultstate="collapsed" desc="generarTexto(String titulo)">                          
    public void generarTexto(String titulo) {
        try {
            this.titulo = titulo;
            header();
            paramatersForSubReport();
            defineField();

            variable();
            variableSummary();
            group();
            addTextJasper("");
            background();
            addTextJasper("");
            title();
            pageHeader();
            columnHeader();
            detail();
            columnFooter();
            pageFooter();
            summary();
            close();

        } catch (Exception e) {
            MySession.error("generarTexto()" + e.getLocalizedMessage());
        }
    }    // </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="header()">                          
    private void header() {
        try {
            PageSize pageSize = new PageSize(ReportMasterSession.getPageSize());

            addTextJasper("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
            // addTextJasper("<jasperReport xmlns=\"http://jasperreports.sourceforge.net/jasperreports\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd\" name=\"report name\" pageWidth=\"595\" pageHeight=\"842\" columnWidth=\"535\" leftMargin=\"20\" rightMargin=\"20\" topMargin=\"20\" bottomMargin=\"20\" >");
            addTextJasper("<jasperReport xmlns=\"http://jasperreports.sourceforge.net/jasperreports\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://jasperreports.sourceforge.net/jasperreports http://jasperreports.sourceforge.net/xsd/jasperreport.xsd\" name=\"report name\" pageWidth=\"" + pageSize.getPageWidth() + "\" pageHeight=\"" + pageSize.getPageHeight() + "\" columnWidth=\"" + pageSize.getColumnWidth() + "\" leftMargin=\"" + pageSize.getLeftMargin() + "\" rightMargin=\"" + pageSize.getRightMargin() + "\" topMargin=\"" + pageSize.getTopMargin() + "\" bottomMargin=\"" + pageSize.getBottomMargin() + "\" >");
            addTextJasper("	<property name=\"ireport.zoom\" value=\"1.0\"/>");
            addTextJasper("	<property name=\"ireport.x\" value=\"0\"/>");
            addTextJasper("	<property name=\"ireport.y\" value=\"0\"/>");
            addTextJasper("     <parameter name=\"P_EMPRESA\" class=\"java.lang.String\"/>");
        } catch (Exception e) {
            MySession.error("header()" + e.getLocalizedMessage());
        }
    }

    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="addTextJasper(String texto) ">
    private void addTextJasper(String texto) {
        try {
            // Atributos para la frase, en negrita
            if (MySession.getTextJasperMaster().equals("")) {
                MySession.setTextJasperMaster(texto);
            } else {
                MySession.setTextJasperMaster(MySession.getTextJasperMaster() + "\n" + texto);
            }

        } catch (Exception e) {
            MySession.error("addTextJasper()" + e.getLocalizedMessage());
        }
    }// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="background()">                          

    private void background() {
        try {
            addTextJasper("  <background>");
            addTextJasper("          <band splitType=\"Stretch\"/>");
            addTextJasper(" </background>");
        } catch (Exception e) {
            MySession.error("background()" + e.getLocalizedMessage());
        }
    }

    // </editor-fold> 
// <editor-fold defaultstate="collapsed" desc="pageHeader() ">
    private void pageHeader() {
        try {
            addTextJasper("<pageHeader>");
            addTextJasper("	<band height=\"79\" splitType=\"Stretch\">");
            addTextJasper("		<textField>");
            addTextJasper("			<reportElement x=\"182\" y=\"3\" width=\"218\" height=\"31\" />");
            addTextJasper("			<textElement>");
            addTextJasper("				<font size=\"14\" isBold=\"true\"/>");
            addTextJasper("			</textElement>");
            addTextJasper("			<textFieldExpression><![CDATA[$P{P_EMPRESA}]]></textFieldExpression>");
            addTextJasper("		</textField>");
            addTextJasper("		<staticText>");
            addTextJasper("			<reportElement x=\"182\" y=\"40\" width=\"197\" height=\"31\" />");
            addTextJasper("			<textElement>");
            addTextJasper("				<font size=\"12\" isBold=\"true\"/>");
            addTextJasper("			</textElement>");
            addTextJasper("			<text><![CDATA[" + this.titulo + "]]></text>");
            addTextJasper("		</staticText>");
            addTextJasper("		<staticText>");
            addTextJasper("			<reportElement x=\"423\" y=\"31\" width=\"37\" height=\"20\" />");
            addTextJasper("			<text><![CDATA[Fecha:]]></text>");
            addTextJasper("		</staticText>");
            addTextJasper("		<textField pattern=\"dd/MM/yyyy\">");
            addTextJasper("			<reportElement x=\"473\" y=\"29\" width=\"67\" height=\"20\" />");
            addTextJasper("			<textFieldExpression><![CDATA[new java.util.Date()]]></textFieldExpression>");
            addTextJasper("		</textField>");
            addTextJasper("		<staticText>");
            addTextJasper("			<reportElement x=\"424\" y=\"51\" width=\"46\" height=\"20\" />");
            addTextJasper("			<text><![CDATA[Hora:]]></text>");
            addTextJasper("		</staticText>");
            addTextJasper("		<textField pattern=\"h.mm a\">");
            addTextJasper("			<reportElement x=\"473\" y=\"51\" width=\"74\" height=\"20\" />");
            addTextJasper("			<textFieldExpression><![CDATA[new java.util.Date()]]></textFieldExpression>");
            addTextJasper("		</textField>");
            addTextJasper("	</band>");
            addTextJasper("</pageHeader>");
        } catch (Exception e) {
            MySession.error("pageHeader()" + e.getLocalizedMessage());
        }
    }// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="title()">
    private void title() {
        try {
            addTextJasper("  <title>");
            addTextJasper("         <band height=\"34\" splitType=\"Stretch\"/>");
            addTextJasper("  </title>");
        } catch (Exception e) {
            MySession.error("title()" + e.getLocalizedMessage());
        }
    }
// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="defineField()">

    private void defineField() {
        try {
            String type = "";
            String name = "";
            for (Entidad e : MySession.getEntidadList()) {
                Integer count = 0;
                for (Atributos a : e.getAtributosList()) {
                    count++;
                    name = a.getNombre();
                    if (count < 5) {
                        if (a.getEsList() || a.getEsListEmbedded() || a.getEsListReferenced()) {
                            addTextJasper("	<field name=\"" + name + "\" class=\"java.util.List\"/>");
                        } else {
                            switch (a.getTipo()) {

                                case "Integer":
                                case "int":
                                    addTextJasper("	<field name=\"" + name + "\" class=\"java.lang.Integer\"/>");
                                    break;
                                case "Double":
                                case "double":
                                    addTextJasper("	<field name=\"" + name + "\" class=\"java.lang.Double\"/>");
                                    break;
                                case "String":
                                case "Character":
                                    addTextJasper("	<field name=\"" + name + "\" class=\"java.lang.String\"/>");
                                    break;

                                case "Date":
                                    addTextJasper("	<field name=\"" + name + "\" class=\"java.util.Date\"/>");
                                    break;
                                case "Timestamp":
                                    addTextJasper("	<field name=\"" + name + "\" class=\"java.sql.Timestamp\"/>");
                                    break;
                                case "Time":
                                    addTextJasper("	<field name=\"" + name + "\" class=\"java.sql.Time\"/>");
                                    break;
                                case "Boolean":
                                    addTextJasper("	 <field name=\"" + name + "\" class=\"java.lang.Boolean\"/>");
                                    break;
                                case "BigInteger":
                                case "Long":
                                case "long":
                                    addTextJasper("	<field name=\"" + name + "\" class=\"java.lang.Long\"/>");
                                    break;
                                case "byte[]":
                                    addTextJasper("	<field name=\"" + name + "\" class=\"java.lang.Byte\"/>");
                                    break;
                                case "Float":
                                    addTextJasper("	<field name=\"" + name + "\" class=\"java.lang.Float\"/>");
                                    break;

                                case "Short":
                                    addTextJasper("	<field name=\"" + name + "\" class=\"java.lang.Short\"/>");
                                    break;
                                case "InputStream":
                                    addTextJasper("	<field name=\"" + name + "\" class=\"java.io.InputStream\"/>");
                                    break;
                                case "Collection":
                                    addTextJasper("	<field name=\"" + name + "\" class=\"java.util.Collection\"/>");
                                    break;
//                                case "List":
//                                    addTextJasper("	<field name=\"" + name + "\" class=\"java.util.List\"/>");
//                                    break;

                                case "Object":

                                    addTextJasper("	<field name=\"" + name + "\" class=\"java.lang.Object\"/>");
                                    break;
                                default:
                                    if (Utilidades.esTipoList(a.getTipo())) {
                                        //Es una lista
                                        addTextJasper("	<field name=\"" + name + "\" class=\"java.util.List\"/>");
                                    } else {
                                        addTextJasper("	<field name=\"" + name + "\" class=\"java.lang.Object\"/>");
                                    }

                            }
                        }

                    }
                }
            }

        } catch (Exception e) {
            MySession.error("defineField()" + e.getLocalizedMessage());
        }
    }
    // </editor-fold>

// <editor-fold defaultstate="collapsed" desc="columnHeader()">
    private void columnHeader() {
        try {
            Integer[] x = {10, 117, 235, 347, 456};
            addTextJasper(" <columnHeader>");
            addTextJasper("	      <band height=\"23\" splitType=\"Stretch\">");
            for (Entidad e : MySession.getEntidadList()) {
                Integer count = 0;
                for (Atributos a : e.getAtributosList()) {
                    if (!a.getEsList()) {
                        if (count < 5 && !a.getEsList()) {
                            addTextJasper("        <staticText>");
                            addTextJasper("	               <reportElement x=\"" + x[count] + "\" y=\"2\" width=\"100\" height=\"20\" />");
                            addTextJasper("	               <textElement>");
                            addTextJasper("		               <font isBold=\"true\"/>");
                            addTextJasper("	               </textElement>");
//                        addTextJasper("	               <text><![CDATA[" + a.getNombre() + "]]></text>");
                            if (a.getLabel().equals("")) {
                                addTextJasper("	               <text><![CDATA[" + a.getNombre() + "]]></text>");
                            } else {
                                addTextJasper("	               <text><![CDATA[" + a.getLabel() + "]]></text>");
                            }

                            addTextJasper("        </staticText>");
                            count++;
                        }
                    }
                }//for
            }

            addTextJasper("	         </band>");
            addTextJasper(" </columnHeader>");

        } catch (Exception e) {
            MySession.error("columnHeader()" + e.getLocalizedMessage());
        }
    }
    // </editor-fold>
// <editor-fold defaultstate="collapsed" desc="detail()">

    private void detail() {
        try {
            Integer[] x = {10, 117, 235, 347, 456};
            addTextJasper(" <detail>");
            addTextJasper("	    <band height=\"132\"  splitType=\"Stretch\">");
            for (Entidad e : MySession.getEntidadList()) {
                Integer count = 0;
                for (Atributos a : e.getAtributosList()) {
                    if (count < 5 && !a.getEsList()) {
                        switch (a.getTipo().toLowerCase().trim()) {
                            case "double":
                                addTextJasper("     <textField pattern=\"###0.00\">");
                                break;
                            case "date":
                                addTextJasper("     <textField pattern=\"dd/MM/yyyy\">");
                                break;
                            default:
                                addTextJasper("     <textField >");
                        }

                        addTextJasper("             <reportElement x=\"" + x[count] + "\" y=\"2\" width=\"100\" height=\"20\" />");
                        if (a.getTipo().toLowerCase().trim().equals("object")) {

                            addTextJasper("	                  <textFieldExpression><![CDATA[$F{" + a.getNombre() + "}.toString()]]></textFieldExpression>");
                        } else {
                            addTextJasper("	                  <textFieldExpression><![CDATA[$F{" + a.getNombre() + "}]]></textFieldExpression>");
                        }

                        addTextJasper("      </textField>");
                        count++;
                    }

                }
                count = 0;
                for (Atributos a : e.getAtributosList()) {
                    if (a.getEsList()) {
                        if (count == 0) {
                            addTextJasper("     <subreport>");
                            addTextJasper("             <reportElement x=\"11\" y=\"23\" width=\"529\" height=\"100\" />");
                            addTextJasper("             <dataSourceExpression><![CDATA[new net.sf.jasperreports.engine.data.JRBeanCollectionDataSource($F{" + a.getNombre() + "})]]></dataSourceExpression>");
//                            addTextJasper("             <subreportExpression><![CDATA[$P{P_URL}]]></subreportExpression>");

//                            addTextJasper("              <subreportExpression><![CDATA[$P{SUBREPORT_DIR} + \"" + MySession.getNameOfSubReport() + ".jasper\"]]></subreportExpression>");
                            addTextJasper("              <subreportExpression><![CDATA[$P{SUBREPORT_DIR}]]></subreportExpression>");
                            addTextJasper("     </subreport>");
                            count++;
                        }
                    }

                }

            }

            addTextJasper("	    </band>");
            addTextJasper(" </detail>");

        } catch (Exception e) {
            MySession.error("detail()" + e.getLocalizedMessage());
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="columnFooter()">
    private void columnFooter() {
        try {
            Integer[] x = {10, 117, 235, 347, 456};
            addTextJasper(" <columnFooter>");
            addTextJasper("	       <band height=\"45\" splitType=\"Stretch\"/>");
            addTextJasper(" </columnFooter>");

        } catch (Exception e) {
            MySession.error("columnFooter()" + e.getLocalizedMessage());
        }
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="pageFooter()">
    private void pageFooter() {
        try {
            Integer[] x = {10, 117, 235, 347, 456};
            addTextJasper(" <pageFooter>");
            addTextJasper("	       <band height=\"54\" splitType=\"Stretch\">");
            addTextJasper("	               <staticText>");
            addTextJasper("	                       <reportElement x=\"438\" y=\"11\" width=\"35\" height=\"20\" />");
            addTextJasper("	                       <text><![CDATA[Pag.]]></text>");
            addTextJasper("	               </staticText>");
            addTextJasper("	               <textField>");
            addTextJasper("	                       <reportElement x=\"480\" y=\"11\" width=\"67\" height=\"20\" />");
            addTextJasper("	                       <textFieldExpression><![CDATA[$V{PAGE_NUMBER}]]></textFieldExpression>");
            addTextJasper("	               </textField>");
            addTextJasper("             </band>");
            addTextJasper(" </pageFooter>");

        } catch (Exception e) {
            MySession.error("pageFooter()" + e.getLocalizedMessage());
        }
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="summary()">
    private void summary() {
        try {

            addTextJasper(" <summary>");
            addTextJasper("	       <band height=\"42\" splitType=\"Stretch\">");
            if (!ReportMasterSession.getSummaryStaticText().equals("")) {
                addTextJasper("	               <staticText> ");
                addTextJasper("	                    <reportElement x = \"322\" y = \"16\" width = \"68\" height = \"20\" /> ");
                addTextJasper("	                                 <text> <![CDATA[" + ReportMasterSession.getSummaryStaticText() + "]]></text>");
                addTextJasper("	               </staticText> ");
                addTextJasper("	               <textField> ");
                addTextJasper("	                          <reportElement x=\"398\" y=\"16\" width=\"100\" height=\"20\" />");
                addTextJasper("	                          <textFieldExpression><![CDATA[$V{" + ReportMasterSession.getSummaryTextFieldExpression() + "}]]></textFieldExpression>");
                addTextJasper("	               </textField> ");
            }

            addTextJasper("	       </band>");
            addTextJasper(" </summary>");

        } catch (Exception e) {
            MySession.error("summary()" + e.getLocalizedMessage());
        }
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="close()">
    private void close() {
        try {

            addTextJasper("</jasperReport>");

        } catch (Exception e) {
            MySession.error("close()" + e.getLocalizedMessage());
        }
    }

    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="generarJRXML">  
    public Boolean generarJRXML(String nameOfReport, Boolean compileJasper) {
        try {
            //Verificar si existe el directorio

            String reportPathPackage = MySession.getReportPath() + MySession.getFileSeparator() + MySession.getNameOfPackage();

            File fileReportes = new File(reportPathPackage);
            if (!fileReportes.isDirectory()) {
                //No existe el directorio hay que crearlo
                if (!fileReportes.mkdir()) {
                    MySession.advertencia("No se puede crear la carpeta: " + reportPathPackage);
                    MySession.setReportPath("");
                    return false;
                }

            }

            reportPathPackage += MySession.getFileSeparator();

            //recorrer el entity para verificar que existan todos los EJB
            MySession.getEntidadList().forEach((entidad) -> {
                String name = Utilidades.letterToLower(entidad.getTabla());

                String reportPathPackageJrxml = MySession.getReportPath() + MySession.getFileSeparator() + MySession.getNameOfPackage() + MySession.getFileSeparator();
                procesar(nameOfReport + ".jrxml", reportPathPackageJrxml + nameOfReport + ".jrxml", entidad, reportPathPackageJrxml + nameOfReport + ".jasper", compileJasper);
            });
            return true;
        } catch (Exception e) {
            MySession.error("generar() " + e.getLocalizedMessage());

        }
        return false;
    }// </editor-fold>  
    // <editor-fold defaultstate="collapsed" desc="compileJRXML(String nameOfReport, Boolean compileJasper)">  

    public Boolean compileJRXML(String nameOfReport, Boolean compileJasper) {
        try {
            //Verificar si existe el directorio

            String reportPathPackage = MySession.getReportPath() + MySession.getFileSeparator() + MySession.getNameOfPackage();

            File fileReportes = new File(reportPathPackage);
            if (!fileReportes.isDirectory()) {
                //No existe el directorio hay que crearlo
                if (!fileReportes.mkdir()) {
                    MySession.advertencia("No se puede crear la carpeta: " + reportPathPackage);
                    MySession.setReportPath("");
                    return false;
                }

            }

            reportPathPackage += MySession.getFileSeparator();

            //recorrer el entity para verificar que existan todos los EJB
            MySession.getEntidadList().forEach((entidad) -> {
                String name = Utilidades.letterToLower(entidad.getTabla());

                String reportPathPackageJrxml = MySession.getReportPath() + MySession.getFileSeparator() + MySession.getNameOfPackage() + MySession.getFileSeparator();
                compilar(nameOfReport + ".jrxml", reportPathPackageJrxml + nameOfReport + ".jrxml", entidad, reportPathPackageJrxml + nameOfReport + ".jasper", compileJasper);
            });
            return true;
        } catch (Exception e) {
            MySession.error("generar() " + e.getLocalizedMessage());

        }
        return false;
    }// </editor-fold>  

    // <editor-fold defaultstate="collapsed" desc="procesar">  
    private Boolean procesar(String archivo, String ruta, Entidad entidad, String pathJasper, Boolean compileJasper) {
        try {

            Path path = Paths.get(ruta);
            if (!Files.notExists(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
                Files.delete(path);
            }

            if (Files.notExists(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
                crearFile(ruta, archivo, entidad);
//                if (compileJasper) {
//                    createJasper(ruta, pathJasper);
//                }

            }
//            else {
//                if (compileJasper) {
//                    Path pathJas = Paths.get(pathJasper);
//                    if (!Files.notExists(pathJas, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
//                        Files.delete(pathJas);
//                    }
//                    if (Files.notExists(pathJas, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
//                        createJasper(ruta, pathJasper);
//                    }
//                }
//
//            }

            if (Files.notExists(path, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
                MySession.advertencia("No se pudo crear el reporte " + archivo);
                return false;
            }
//            Path pathJas = Paths.get(pathJasper);
//            if (Files.notExists(pathJas, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
//                MySession.advertencia("No se pudo compilar el reporte " + archivo);
//                return false;
//            }
            return true;
        } catch (Exception e) {
            MySession.error("procesar() " + e.getLocalizedMessage());
        }
        return false;

    }
// </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="compilar">  

    private Boolean compilar(String archivo, String ruta, Entidad entidad, String pathJasper, Boolean compileJasper) {
        try {

            Path pathJas = Paths.get(pathJasper);
            if (!Files.notExists(pathJas, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
                Files.delete(pathJas);
            }
            if (Files.notExists(pathJas, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
                createJasper(ruta, pathJasper);
            }

            if (Files.notExists(pathJas, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
                MySession.advertencia("No se pudo compilar el reporte " + archivo);
                return false;
            }
            return true;
        } catch (Exception e) {
            MySession.error("compilar() " + e.getLocalizedMessage());
        }
        return false;

    }
// </editor-fold> 

    // <editor-fold defaultstate="collapsed" desc="createJasper">  
    private Boolean createJasper(String reportSource, String pathJasper) {
        try {

            JasperCompileManager.compileReportToFile(reportSource, pathJasper);
//            JasperCompileManager.compileReportToFile(reportSource);

            return true;
        } catch (Exception e) {

            MySession.error("createJasper() " + e.getLocalizedMessage());
        }
        return false;
    }// </editor-fold> 

    /**
     *
     * @param path
     * @param archivo
     * @param entidad
     * @return
     * @throws IOException
     */
    // <editor-fold defaultstate="collapsed" desc="crearFile"> 
    private Boolean crearFile(String path, String archivo, Entidad entidad) throws IOException {
        try {
            String name = Utilidades.letterToLower(entidad.getTabla());
            String ruta = path;
            File file = new File(ruta);
            BufferedWriter bw;
            if (file.exists()) {
                // El fichero ya existe
            } else {
                // El fichero no existe y hay que crearlo
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.close();
//      bw.write("Acabo de crear el fichero de texto.");

                File file2 = new File(ruta);
                //Creamos un objeto para escribir caracteres en el archivo de prueba
                try (FileWriter fw = new FileWriter(file)) {
                    for (String line : MySession.getTextJasperMaster().split("\\n")) {
                        fw.write(line + "\r\n");
                    }
                    fw.close();

                } catch (IOException ex) {
                    MySession.error("crearFile() " + ex.getLocalizedMessage());
                }

            }
        } catch (Exception e) {
            MySession.error("crearFile() " + e.getLocalizedMessage());
        }
        return false;
    }
// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="paramatersForSubReport()">
    private void paramatersForSubReport() {
        try {

//            addTextJasper("       <parameter name=\"P_URL\" class=\"java.lang.String\"/>");
            addTextJasper("       <parameter name=\"SUBREPORT_DIR\" class=\"java.lang.String\" isForPrompting=\"false\">");
            addTextJasper("              <defaultValueExpression><![CDATA[$P{SUBREPORT_DIR}]]></defaultValueExpression>");
            addTextJasper("       </parameter>");
        } catch (Exception e) {
            MySession.error("variable() " + e.getLocalizedMessage());
        }
    }
// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="variable()">

    private void variable() {

        try {
            if (!ReportMasterSession.getGroupname().equals("") && (ReportMasterSession.getWriteTextoReport())) {
                addTextJasper("       <variable name=\"v_" + ReportMasterSession.getVariableGroup() + "\" class=\"java.lang." + ReportMasterSession.getVariableTypeGroup() + "\" resetType=\"Group\" resetGroup=\"" + ReportMasterSession.getGroupname() + "\" calculation=\"" + ReportMasterSession.getCalculation() + "\">");
                addTextJasper("          <variableExpression><![CDATA[$F{" + ReportMasterSession.getVariableGroup() + "}]]></variableExpression>");
                addTextJasper("       </variable>");

            }
        } catch (Exception e) {
            MySession.error("variable() " + e.getLocalizedMessage());
        }
    }
// </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="variableSummary()">

    private void variableSummary() {
        try {
            if (!ReportMasterSession.getSummaryVariableName().equals("")) {
                addTextJasper("       <variable name=\"" + ReportMasterSession.getSummaryVariableName() + "\" class=\"java.lang." + ReportMasterSession.getSummaryVariableType() + "\"  calculation=\"" + ReportMasterSession.getSummaryCalculation() + "\">");
                addTextJasper("          <variableExpression><![CDATA[$F{" + ReportMasterSession.getSummaryVariableExpression() + "}]]></variableExpression>");
                addTextJasper("       </variable>");

            }
        } catch (Exception e) {
            MySession.error("variableSummary() " + e.getLocalizedMessage());
        }
    }
// </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="group()">
    private void group() {

        try {
            if (!ReportMasterSession.getGroupname().equals("")) {
                addTextJasper("  <group name=\"" + ReportMasterSession.getGroupname() + "\">");
                addTextJasper("          <groupExpression><![CDATA[$F{" + ReportMasterSession.getGroupExpression() + "}]]></groupExpression>");
                addTextJasper("          <groupHeader>");
                addTextJasper("                   <band height=\"38\">");
                addTextJasper("                        <staticText>");
                addTextJasper("                                   <reportElement x=\"1\" y=\"10\" width=\"100\" height=\"20\" />");
                addTextJasper("                                   <textElement>");
                addTextJasper("                                           <font isBold=\"true\"/>");
                addTextJasper("                                   </textElement>");
                addTextJasper("                                   <text><![CDATA[" + ReportMasterSession.getStaticTextGroupHeader() + "]]></text>");
                addTextJasper("                         </staticText>");
                addTextJasper("                         <textField>");
                addTextJasper("                                  <reportElement x=\"110\" y=\"10\" width=\"100\" height=\"20\" />");
                addTextJasper("                                  <textFieldExpression><![CDATA[$F{" + ReportMasterSession.getTextFieldExpressionHeader() + "}]]></textFieldExpression>");
                addTextJasper("                         </textField>");
                addTextJasper("                   </band>");
                addTextJasper("          </groupHeader>");
                addTextJasper("          <groupFooter>");
                addTextJasper("                  <band height=\"50\">");
                if (ReportMasterSession.getWriteTextoReport()) {
                    addTextJasper("                          <staticText>");
                    addTextJasper("                                   <reportElement x=\"6\" y=\"10\" width=\"100\" height=\"20\" />");
                    addTextJasper("                                   <textElement>");
                    addTextJasper("                                           <font isBold=\"true\"/>");
                    addTextJasper("                                   </textElement>");
                    addTextJasper("                                   <text><![CDATA[" + ReportMasterSession.getStaticTextGroupFooter() + "]]></text>");
                    addTextJasper("                          </staticText>");
                    addTextJasper("                          <textField>");
                    addTextJasper("                                  <reportElement x=\"110\" y=\"12\" width=\"100\" height=\"20\" />");
                    addTextJasper("                                  <textFieldExpression><![CDATA[$V{v_" + ReportMasterSession.getVariableGroup().trim() + "}]]></textFieldExpression>");
                    addTextJasper("                          </textField>");
                }
                if (ReportMasterSession.getWriteLineaReport()) {
                    addTextJasper("                          <line>");
                    addTextJasper("                                  <reportElement x=\"5\" y=\"38\" width=\"542\" height=\"1\" />");
                    addTextJasper("                          </line>");

                }

                addTextJasper("                  </band>");
                addTextJasper("          </groupFooter>");
                addTextJasper("  </group>");
            }

        } catch (Exception e) {
            MySession.error("group() " + e.getLocalizedMessage());
        }
    }
// </editor-fold>

}
