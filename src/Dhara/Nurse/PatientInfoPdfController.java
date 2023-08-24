/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dhara.Nurse;

import Users.Nurse;
import Users.Patient;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
/*import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.List;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author Asus
 */
public class PatientInfoPdfController implements Initializable {

    private Nurse nurse;

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    @FXML
    private TableView<Patient> patientTableView;
    @FXML
    private TableColumn<Patient, Integer> IdTableColoumn;
    @FXML
    private TableColumn<Patient, String> NameTableColoumn;
    @FXML
    private TableColumn<Patient, String> genderTableColoumn;
    @FXML
    private TableColumn<Patient, LocalDate> DOBTableColoumn;
    @FXML
    private TableColumn<Patient, String> emailTableColoumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        IdTableColoumn.setCellValueFactory(new PropertyValueFactory<>("ID"));
        NameTableColoumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        genderTableColoumn.setCellValueFactory(new PropertyValueFactory<>("gender"));
        DOBTableColoumn.setCellValueFactory(new PropertyValueFactory<>("DOB"));
        emailTableColoumn.setCellValueFactory(new PropertyValueFactory<>("email"));

        patientTableView.setItems(Nurse.readAllPatientsList());
        // TODO
    }

    /*@FXML
    private void onClickMakePdf(ActionEvent event) throws FileNotFoundException, IOException, ClassNotFoundException {

        String paraText = "";
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image files", ".jpg", ".bmp", "*.png"));
        File f = fc.showSaveDialog(null);
        if (f != null) {
            PdfWriter pw = new PdfWriter(new FileOutputStream(f));
            PdfDocument pdf = new PdfDocument(pw);
            pdf.addNewPage();
            Document doc = new Document(pdf);
            doc.setLeftMargin(70);

            // Read from a file and set the paratext to file read string.
            try (FileInputStream fileInputStream = new FileInputStream("Patient.bin"); ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

                while (true) {

                    Patient patient = (Patient) objectInputStream.readObject(); // Assuming your object class is named "Bill"

                    // Display information from the Bill object in the TextField
                    paraText += patient.toString() + "\n";
                }
            } // try block ends
            catch (EOFException e) {
                // End of file reached (EOFException thrown)
                // No more objects to read, so we stop the loop

                System.out.println("File has been read to the end.");
            }

            Paragraph para1 = new Paragraph(paraText);

            // Custom behavior if you want then use
            Text titleText = new Text("This is the TITLE of the pdf");
            titleText.setFontSize(18f);
            Paragraph pageTitle = new Paragraph(titleText);
            pageTitle.setBold();    //OR titleText.setBold();

            PdfFont font2 = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
            PdfFont fontBold = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);

            // Most important part here
            doc.add(para1);

            doc.close();

            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("PDF Generated successfully!");
            a.showAndWait();

        } else {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("PDF Generation failed!");
            a.showAndWait();
        }

    }*/

}
 