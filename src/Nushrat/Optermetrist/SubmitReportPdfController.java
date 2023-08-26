/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Nushrat.Optermetrist;


import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author user
 */
public class SubmitReportPdfController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    
    

    

    @FXML
    private void pdfBtnOnClick(MouseEvent event) {
           try{
           
            FileChooser fc = new FileChooser();
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image files", "*.jpg", "*.bmp", "*.png"));
            File f = fc.showSaveDialog(null);
            if(f!=null){              
                PdfWriter pw = new PdfWriter(new FileOutputStream(f));
                //PdfWriter pw = new PdfWriter(new FileOutputStream("testPDF.pdf"));
                PdfDocument pdf =  new PdfDocument(pw);
                pdf.addNewPage();
                Document doc = new Document(pdf);
                doc.setLeftMargin(70);
                //----------------------------------------------------
                //adding paragrapg to the pdf
                String newline = "\n";
                Paragraph lineSpace = new Paragraph(newline);
                lineSpace.setHeight(8);
                
                Text titleText = new Text("Patient Report");
                titleText.setFontSize(18f);
                Paragraph pageTitle = new Paragraph(titleText);
                pageTitle.setBold();
                
                String paraText1 
                        = "Patient Name: John Doe\n" +
                           "Patient ID: 123456\n" +
                           "Date: July 15, 20XX\n";
                
                Paragraph para1 = new Paragraph(paraText1);
                
                Text titleText2 = new Text("Findings");
                titleText2.setFontSize(18f);
                Paragraph pageTitle1 = new Paragraph(titleText2);
                pageTitle1.setBold();    //OR titleText2.setBold();
                
                String paraText2 
                        = "The eye x-ray examination reveals normal structures and features within the ocular region.\n" +
                           "The sclera and cornea exhibit healthy integrity with no visible abnormalities. The anterior\n" +
                           "chamber shows adequate depth, and the iris appears symmetrical and well-defined.\n";
                
                Paragraph para2 = new Paragraph(paraText2);

                
                
                doc.add(pageTitle);
                doc.add(lineSpace);
                doc.add(para1);
                doc.add(lineSpace);
                doc.add(pageTitle1);
                doc.add(lineSpace);
                doc.add(para2);
                
                
                
                //----------------------------------------------------
                
                //adding a list
                Text titleText3 = new Text("Possible Diseases");
                titleText3.setFontSize(18f);
                Paragraph pageTitle3 = new Paragraph(titleText3);
                pageTitle1.setBold();    //OR titleText2.setBold();
                List progLangList = new List();
                progLangList.add("Cataract.");
                progLangList.add("Glaucoma.");
                progLangList.add("Amblyopia.");
                progLangList.add("Strabismus.");
                progLangList.add("Age-Related Macular Degeneration.");
                doc.add(lineSpace);
                doc.add(pageTitle3);
                doc.add(progLangList);
                doc.add(lineSpace);
                
                //----------------------------------------------------
                //adding an image
                Alert a = new Alert(Alert.AlertType.CONFIRMATION);
                a.setContentText("Please add The X-Ray Image");
                Optional<ButtonType> result = a.showAndWait();
                if(result.get() == ButtonType.OK){ 
                    File imageFile = fc.showOpenDialog(null);
                    String imagePath = imageFile.getAbsolutePath();
                    ImageData data = ImageDataFactory.create(imagePath);
                    Image image = new Image(data);  
                    image.setAutoScale(true);
                    
                    doc.add(image);
                    doc.add(lineSpace);
                    a = new Alert(Alert.AlertType.INFORMATION);
                    a.setContentText("The image is added successfully.");
                    a.showAndWait();
                }
                //----------------------------------------------------
                
                //adding table in pdf
                float colWidthArr[] = {70f, 200f, 100f};
                Table pdfTable = new Table(colWidthArr); 
                
                //adding header row
                
                pdfTable.addCell(new Cell().setBackgroundColor(Color.GRAY).add("Patient ID"));
                pdfTable.addCell(new Cell().setBackgroundColor(Color.DARK_GRAY).add("Patient Name"));
                pdfTable.addCell(new Cell().setBackgroundColor(Color.LIGHT_GRAY).add("Report Date"));
                
                //adding content row
                pdfTable.addCell(new Cell().add("123456"));
                pdfTable.addCell(new Cell().add("John Doe"));
                pdfTable.addCell(new Cell().add("July 15, 20XX"));
                
                //adding content row
                pdfTable.addCell(new Cell().add("789012"));
                pdfTable.addCell(new Cell().add("Jane Smith"));
                pdfTable.addCell(new Cell().add("August 3, 20XX"));
                
                //adding content row
                pdfTable.addCell(new Cell().add("567890"));
                pdfTable.addCell(new Cell().add("Michael Brown"));
                pdfTable.addCell(new Cell().add("September 21, 20XX"));

                doc.add(pdfTable);
                
                doc.close();
                
                a = new Alert(Alert.AlertType.INFORMATION);
                a.setContentText("The PDF is saved successfully.");
                a.showAndWait();    
            }
            else{
                Alert a = new Alert(Alert.AlertType.INFORMATION);
                a.setContentText("Saving as PDF: cancelled!");
                a.showAndWait();               
            }
        }
        catch(Exception e){
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("Oops! Exception: " + e.toString()+ " occured.");
            a.showAndWait(); 
            
        }
    }

    
    
}
