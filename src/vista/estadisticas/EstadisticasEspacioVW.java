package com.daimler.conexion.view.estadisticas;

import com.daimler.conexion.exception.ServiceExceptionCO;
import com.daimler.conexion.model.bo.VisitasBO;
import com.daimler.conexion.model.service.VisitasService;
import com.daimler.conexion.model.service.impl.VisitasServiceImpl;
import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

@SuppressWarnings("deprecation")
@ManagedBean(name = "estadisticasEspaciovw")
@ViewScoped
public class EstadisticasEspacioVW implements Serializable {

   private static final long   serialVersionUID      = 9195911934584182394L;

   // Data
   private List<VisitasBO>     lstEstadisticaEspacio = new ArrayList<VisitasBO>();
   private static final Logger logger                = LoggerFactory.getLogger(EstadisticasEspacioVW.class);

   // Services
   private VisitasService      srvVisitas;

   @PostConstruct
   public void init() {
      srvVisitas = new VisitasServiceImpl();
      try {
         lstEstadisticaEspacio = srvVisitas.obtenerEstadisticas();
      } catch (ServiceExceptionCO e) {
         logger.error(e.getMessage());
      }
   }

   public void generarReporteEspacioUso() throws InvalidFormatException {
      File fPlantilla = new File("F:\\\\Aplicaciones\\ConexionDaimler\\reportes\\templates\\Reporte_Espacio_Uso_Conexion_Template.xlsx");
      try {
         File fReporte = File.createTempFile("Reporte_Espacio_Uso_Conexion", ".xlsx");
         FileInputStream fisPlantilla = new FileInputStream(fPlantilla);
         Workbook wbPlantilla = WorkbookFactory.create(fisPlantilla);
         XSSFSheet sheet = (XSSFSheet) wbPlantilla.getSheetAt(0);
         XSSFCellStyle styTitulo = crearEstiloTitulo(wbPlantilla);
         int rowCount = 1;
         XSSFRow xSSFRow = sheet.createRow(rowCount++);
         Cell cell = xSSFRow.createCell(0);
         cell.setCellValue("Usuario");
         cell.setCellStyle((CellStyle) styTitulo);
         cell = xSSFRow.createCell(1);
         cell.setCellValue("# de carpetas");
         cell.setCellStyle((CellStyle) styTitulo);
         cell = xSSFRow.createCell(2);
         cell.setCellValue("# de archivos");
         cell.setCellStyle((CellStyle) styTitulo);
         cell = xSSFRow.createCell(3);
         cell.setCellValue("Almacenamiento");
         cell.setCellStyle((CellStyle) styTitulo);
         for (VisitasBO bo : this.lstEstadisticaEspacio) {
            XSSFCellStyle styContenido = (rowCount % 2 == 0) ? crearEstiloContenidoA(wbPlantilla) : crearEstiloContenidoB(wbPlantilla);
            xSSFRow = sheet.createRow(rowCount++);
            cell = xSSFRow.createCell(0);
            cell.setCellValue(bo.getNameUsuario());
            cell.setCellStyle((CellStyle) styContenido);
            bo.getNameUsuario();
            cell = xSSFRow.createCell(1);
            cell.setCellValue(bo.getNumCarpetas());
            cell.setCellStyle((CellStyle) styContenido);
            bo.getNumCarpetas();
            cell = xSSFRow.createCell(2);
            cell.setCellValue(bo.getNumArchivos());
            cell.setCellStyle((CellStyle) styContenido);
            bo.getNumArchivos();
            cell = xSSFRow.createCell(3);
            cell.setCellValue(bo.getEspacioAlmacenado());
            cell.setCellStyle((CellStyle) styContenido);
         }
         try (FileOutputStream out = new FileOutputStream(fReporte)) {
            wbPlantilla.write(out);
            out.close();
            wbPlantilla.close();
         } catch (Exception e) {
            e.printStackTrace();
         } finally {
            try {
               wbPlantilla.close();
               fisPlantilla.close();
            } catch (IOException e) {
               e.printStackTrace();
            }
         }
         descargarReporte(fReporte.getAbsolutePath(), "Espacio_Uso");
      } catch (EncryptedDocumentException ed) {
         ed.printStackTrace();
      } catch (IOException ioe) {
         ioe.printStackTrace();
      }
   }

   private void descargarReporte(String psFilecreado, String psNombreSeccion) {
      PortletRequest portletRequest = (PortletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
      HttpServletRequest httpServletRequest = PortalUtil.getHttpServletRequest(portletRequest);
      PortletResponse portletResponse = (PortletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
      HttpServletResponse httpServletResponse = PortalUtil.getHttpServletResponse(portletResponse);
      try {
         File file = new File(psFilecreado);
         ServletResponseUtil.sendFile(httpServletRequest, httpServletResponse, "Reporte_" + psNombreSeccion + "_Conexion.xlsx", new FileInputStream(file),
               "application/vnd.ms-excel");
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            FacesContext.getCurrentInstance().getExternalContext().responseFlushBuffer();
            FacesContext.getCurrentInstance().release();
            FacesContext.getCurrentInstance().renderResponse();
            FacesContext.getCurrentInstance().responseComplete();
         } catch (IOException e) {
            e.printStackTrace();
         }
      }
   }

   private XSSFCellStyle crearEstiloTitulo(Workbook workbook) {
      XSSFCellStyle cellStyle = (XSSFCellStyle) workbook.createCellStyle();
      Font font = workbook.createFont();
      font.setFontHeightInPoints((short) 12);
      font.setBold(true);
      font.setFontName("Arial");
      font.setColor(IndexedColors.WHITE.getIndex());
      XSSFColor header = new XSSFColor(new Color(68, 84, 106));
      cellStyle.setFillForegroundColor(header);
      cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
      cellStyle.setFont(font);
      return cellStyle;
   }

   private XSSFCellStyle crearEstiloContenidoA(Workbook workbook) {
      XSSFCellStyle cellStyle = (XSSFCellStyle) workbook.createCellStyle();
      Font font = workbook.createFont();
      font.setFontHeightInPoints((short) 11);
      font.setBold(false);
      font.setFontName("Arial");
      font.setColor(IndexedColors.BLACK.getIndex());
      cellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
      cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
      cellStyle.setFont(font);
      return cellStyle;
   }

   private XSSFCellStyle crearEstiloContenidoB(Workbook workbook) {
      XSSFCellStyle cellStyle = (XSSFCellStyle) workbook.createCellStyle();
      Font font = workbook.createFont();
      font.setFontHeightInPoints((short) 11);
      font.setBold(false);
      font.setFontName("Arial");
      font.setColor(IndexedColors.BLACK.getIndex());
      XSSFColor color = new XSSFColor(new Color(217, 225, 242));
      cellStyle.setFillForegroundColor(color);
      cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
      cellStyle.setFont(font);
      return cellStyle;
   }

   // GETTERS AND SETTERS
   public List<VisitasBO> getLstEstadisticaEspacio() {
      return lstEstadisticaEspacio;
   }

   public void setLstEstadisticaEspacio(List<VisitasBO> lstEstadisticaEspacio) {
      this.lstEstadisticaEspacio = lstEstadisticaEspacio;
   }

}
