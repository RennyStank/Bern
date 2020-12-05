package java.controllers;

import java.io.File;
import java.util.Scanner;

public class InstrumentPicker {
    public String[] instrumentList;

    public InstrumentPicker() {
        File inputFile = new File("resources\\data sources\\instruments\\default instruments.txt");
        Scanner instrumentInput = new Scanner(inputFile);

        int i = 0;
        while(instrumentInput.hasNext()) {
            instrumentList[i] = instrumentInput.next();
            i++;
        }
    }
}
