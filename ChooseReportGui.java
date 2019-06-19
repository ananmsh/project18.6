package Gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ChooseReportGui {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton CityRadio;

    @FXML
    private RadioButton CustomerRadio;

    @FXML
    private Button MoveButton;

    @FXML
    private Button CancelButton;

    @FXML
    private RadioButton DailyReportBTN;

    @FXML
    void CancelBtn(ActionEvent event) {

    }

    @FXML
    void CityRad(ActionEvent event) {
        DailyReportBTN.setSelected(false);
        CustomerRadio.setSelected(false);
    }

    @FXML
    void CusRad(ActionEvent event) {
        DailyReportBTN.setSelected(false);
        CityRadio.setSelected(false);
    }

    @FXML
    void DailyReportRad(ActionEvent event) {
    	CustomerRadio.setSelected(false);
    	CityRadio.setSelected(false);
    }

    @FXML
    void MoveBtn(ActionEvent event) {
    if(CityRadio.isSelected())
    {
    	try {
	        ((Node) event.getSource()).getScene().getWindow().hide(); 
	        Pane root = FXMLLoader.load(getClass().getResource("/Fxml/ReportGui.fxml"));//build the gui
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
	        }
	        catch(Exception e)
	        {
				e.printStackTrace();

	        }
    }
    if(DailyReportBTN.isSelected()) {
   
    		try {
	        ((Node) event.getSource()).getScene().getWindow().hide(); 
	        Pane root = FXMLLoader.load(getClass().getResource("/Fxml/DailyReport.fxml"));//build the gui
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();
    		  }
	        catch(Exception e)
	        {
				e.printStackTrace();

	        }
    	}
    }
  

    

    @FXML
    void initialize() {
        assert CityRadio != null : "fx:id=\"CityRadio\" was not injected: check your FXML file 'ChooseReportGui.fxml'.";
        assert CustomerRadio != null : "fx:id=\"CustomerRadio\" was not injected: check your FXML file 'ChooseReportGui.fxml'.";
        assert MoveButton != null : "fx:id=\"MoveButton\" was not injected: check your FXML file 'ChooseReportGui.fxml'.";
        assert CancelButton != null : "fx:id=\"CancelButton\" was not injected: check your FXML file 'ChooseReportGui.fxml'.";
        assert DailyReportBTN != null : "fx:id=\"DailyReportBTN\" was not injected: check your FXML file 'ChooseReportGui.fxml'.";

    }
}
