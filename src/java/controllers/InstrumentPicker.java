package java.controllers;

import java.io.File;
import java.util.Scanner;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

import javax.swing.text.html.ListView;

public class InstrumentPicker {
    public ObservableList<String> instrumentList;

    public InstrumentPicker() {
        File inputFile = new File("resources\\data sources\\instruments\\default instruments.txt");
        Scanner instrumentInput = new Scanner(inputFile);

        int i = 0;
        while(instrumentInput.hasNext()) {
            instrumentList.add(instrumentInput.next());
            i++;
        }

        @FXML private ListView inputList;

        @FXML private void loadInstruments(ActionEvent event) {
            inputList.getItems(instrumentList);
        }
    }
}
