package Gui;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import Controller.ReportController;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class DailyReportGui {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> CitiesCombo;


    @FXML
    private Label TotalPurchases;

    @FXML
    private Label Subscriptions;

    @FXML
    private Button InfoBtn;

    @FXML
    private Label onetimepurchases;

    @FXML
    void DisplayInfo(ActionEvent event) {
    	ArrayList<String> SelectedCity=new ArrayList<String>();
    	SelectedCity.add("getCityDailyInfo");
        SelectedCity.add((String)CitiesCombo.getSelectionModel().getSelectedItem());
        try {
			Main.getClient().getClient().StringsToServer(SelectedCity);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			Thread.currentThread().sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       ArrayList<String> DailyInfoToDisplay=new ArrayList<String>();
       DailyInfoToDisplay=(Main.getClient().getClient().getDailyInfo());
       TotalPurchases.setText("total purchases:" + "  " + DailyInfoToDisplay.get(2));
        Subscriptions.setText("total Subscriptions:" +  "  " + DailyInfoToDisplay.get(1));
        onetimepurchases.setText("total One Time Purchases:" +  "  " + DailyInfoToDisplay.get(0));
    }
    @FXML
    void WomboCombo(ActionEvent event) {
    	
     
    }

    @FXML
    void initialize() {
        assert CitiesCombo != null : "fx:id=\"CitiesCombo\" was not injected: check your FXML file 'DailyReport.fxml'.";
        try {
			Main.getClient().sendToMyCLient("GetCitiesForComboBox");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        ObservableList<String> list;
        try {
			Thread.currentThread().sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        list = FXCollections.observableArrayList(Main.getClient().getClient().getCityNames());
		CitiesCombo.setItems(list);//update the ComboxBox with the list of cities 
		new AutoCompleteComboBoxListener<>(CitiesCombo);
		 assert TotalPurchases != null : "fx:id=\"TotalPurchases\" was not injected: check your FXML file 'DailyReport.fxml'.";
	        assert Subscriptions != null : "fx:id=\"Subscriptions\" was not injected: check your FXML file 'DailyReport.fxml'.";
	        assert InfoBtn != null : "fx:id=\"InfoBtn\" was not injected: check your FXML file 'DailyReport.fxml'.";
	        assert onetimepurchases != null : "fx:id=\"onetimepurchases\" was not injected: check your FXML file 'DailyReport.fxml'.";
    }
}
