package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.ArrayList;
import java.util.List;

public class MainController {

    @FXML
    private Button C0_btn;
    @FXML
    private Button C1_btn;
    @FXML
    private Button C2_btn;
    @FXML
    private Button C3_btn;
    @FXML
    private Button C4_btn;
    @FXML
    private Button C5_btn;
    @FXML
    private Button C6_btn;
    @FXML
    private Button C7_btn;
    @FXML
    private Button CS0_btn;
    @FXML
    private Button CS1_btn;
    @FXML
    private Button CS2_btn;
    @FXML
    private Button CS3_btn;
    @FXML
    private Button CS4_btn;
    @FXML
    private Button CS5_btn;
    @FXML
    private Button CS6_btn;
    @FXML
    private Button CS7_btn;
    @FXML
    private Button D0_btn;
    @FXML
    private Button D1_btn;
    @FXML
    private Button D2_btn;
    @FXML
    private Button D3_btn;
    @FXML
    private Button D4_btn;
    @FXML
    private Button D5_btn;
    @FXML
    private Button D6_btn;
    @FXML
    private Button D7_btn;
    @FXML
    private Button DS0_btn;
    @FXML
    private Button DS1_btn;
    @FXML
    private Button DS2_btn;
    @FXML
    private Button DS3_btn;
    @FXML
    private Button DS4_btn;
    @FXML
    private Button DS5_btn;
    @FXML
    private Button DS6_btn;
    @FXML
    private Button DS7_btn;
    @FXML
    private Button E0_btn;
    @FXML
    private Button E1_btn;
    @FXML
    private Button E2_btn;
    @FXML
    private Button E3_btn;
    @FXML
    private Button E4_btn;
    @FXML
    private Button E5_btn;
    @FXML
    private Button E6_btn;
    @FXML
    private Button E7_btn;
    @FXML
    private Button F0_btn;
    @FXML
    private Button F1_btn;
    @FXML
    private Button F2_btn;
    @FXML
    private Button F3_btn;
    @FXML
    private Button F4_btn;
    @FXML
    private Button F5_btn;
    @FXML
    private Button F6_btn;
    @FXML
    private Button F7_btn;
    @FXML
    private Button FS0_btn;
    @FXML
    private Button FS1_btn;
    @FXML
    private Button FS2_btn;
    @FXML
    private Button FS3_btn;
    @FXML
    private Button FS4_btn;
    @FXML
    private Button FS5_btn;
    @FXML
    private Button FS6_btn;
    @FXML
    private Button FS7_btn;
    @FXML
    private Button G0_btn;
    @FXML
    private Button G1_btn;
    @FXML
    private Button G2_btn;
    @FXML
    private Button G3_btn;
    @FXML
    private Button G4_btn;
    @FXML
    private Button G5_btn;
    @FXML
    private Button G6_btn;
    @FXML
    private Button G7_btn;
    @FXML
    private Button GS0_btn;
    @FXML
    private Button GS1_btn;
    @FXML
    private Button GS2_btn;
    @FXML
    private Button GS3_btn;
    @FXML
    private Button GS4_btn;
    @FXML
    private Button GS5_btn;
    @FXML
    private Button GS6_btn;
    @FXML
    private Button GS7_btn;
    @FXML
    private Button A0_btn;
    @FXML
    private Button A1_btn;
    @FXML
    private Button A2_btn;
    @FXML
    private Button A3_btn;
    @FXML
    private Button A4_btn;
    @FXML
    private Button A5_btn;
    @FXML
    private Button A6_btn;
    @FXML
    private Button A7_btn;
    @FXML
    private Button AS0_btn;
    @FXML
    private Button AS1_btn;
    @FXML
    private Button AS2_btn;
    @FXML
    private Button AS3_btn;
    @FXML
    private Button AS4_btn;
    @FXML
    private Button AS5_btn;
    @FXML
    private Button AS6_btn;
    @FXML
    private Button AS7_btn;
    @FXML
    private Button B0_btn;
    @FXML
    private Button B1_btn;
    @FXML
    private Button B2_btn;
    @FXML
    private Button B3_btn;
    @FXML
    private Button B4_btn;
    @FXML
    private Button B5_btn;
    @FXML
    private Button B6_btn;
    @FXML
    private Button B7_btn;

    private List<Button> allButtons = new ArrayList<>();

    @FXML
    private void initialize() {
        allButtons.add(C0_btn);
        allButtons.add(C1_btn);
        allButtons.add(C2_btn);
        allButtons.add(C3_btn);
        allButtons.add(C4_btn);
        allButtons.add(C5_btn);
        allButtons.add(C6_btn);
        allButtons.add(C7_btn);

        allButtons.add(CS0_btn);
        allButtons.add(CS1_btn);
        allButtons.add(CS2_btn);
        allButtons.add(CS3_btn);
        allButtons.add(CS4_btn);
        allButtons.add(CS5_btn);
        allButtons.add(CS6_btn);
        allButtons.add(CS7_btn);

        allButtons.add(D0_btn);
        allButtons.add(D1_btn);
        allButtons.add(D2_btn);
        allButtons.add(D3_btn);
        allButtons.add(D4_btn);
        allButtons.add(D5_btn);
        allButtons.add(D6_btn);
        allButtons.add(D7_btn);

        allButtons.add(DS0_btn);
        allButtons.add(DS1_btn);
        allButtons.add(DS2_btn);
        allButtons.add(DS3_btn);
        allButtons.add(DS4_btn);
        allButtons.add(DS5_btn);
        allButtons.add(DS6_btn);
        allButtons.add(DS7_btn);

        allButtons.add(E0_btn);
        allButtons.add(E1_btn);
        allButtons.add(E2_btn);
        allButtons.add(E3_btn);
        allButtons.add(E4_btn);
        allButtons.add(E5_btn);
        allButtons.add(E6_btn);
        allButtons.add(E7_btn);

        allButtons.add(F0_btn);
        allButtons.add(F1_btn);
        allButtons.add(F2_btn);
        allButtons.add(F3_btn);
        allButtons.add(F4_btn);
        allButtons.add(F5_btn);
        allButtons.add(F6_btn);
        allButtons.add(F7_btn);

        allButtons.add(FS0_btn);
        allButtons.add(FS1_btn);
        allButtons.add(FS2_btn);
        allButtons.add(FS3_btn);
        allButtons.add(FS4_btn);
        allButtons.add(FS5_btn);
        allButtons.add(FS6_btn);
        allButtons.add(FS7_btn);

        allButtons.add(G0_btn);
        allButtons.add(G1_btn);
        allButtons.add(G2_btn);
        allButtons.add(G3_btn);
        allButtons.add(G4_btn);
        allButtons.add(G5_btn);
        allButtons.add(G6_btn);
        allButtons.add(G7_btn);

        allButtons.add(GS0_btn);
        allButtons.add(GS1_btn);
        allButtons.add(GS2_btn);
        allButtons.add(GS3_btn);
        allButtons.add(GS4_btn);
        allButtons.add(GS5_btn);
        allButtons.add(GS6_btn);
        allButtons.add(GS7_btn);

        allButtons.add(A0_btn);
        allButtons.add(A1_btn);
        allButtons.add(A2_btn);
        allButtons.add(A3_btn);
        allButtons.add(A4_btn);
        allButtons.add(A5_btn);
        allButtons.add(A6_btn);
        allButtons.add(A7_btn);

        allButtons.add(AS0_btn);
        allButtons.add(AS1_btn);
        allButtons.add(AS2_btn);
        allButtons.add(AS3_btn);
        allButtons.add(AS4_btn);
        allButtons.add(AS5_btn);
        allButtons.add(AS6_btn);
        allButtons.add(AS7_btn);

        allButtons.add(B0_btn);
        allButtons.add(B1_btn);
        allButtons.add(B2_btn);
        allButtons.add(B3_btn);
        allButtons.add(B4_btn);
        allButtons.add(B5_btn);
        allButtons.add(B6_btn);
        allButtons.add(B7_btn);
    }

    @FXML
    private void handleButtonClick(ActionEvent event) {
        Button clickedButton = (Button) event.getSource();
        clickedButton.setStyle("-fx-background-color: LAWNGREEN;");

        int buttonIndex = allButtons.indexOf(clickedButton); // Get the index of the clicked button
        if (buttonIndex != -1) { // Make sure the button was found in the list
            SOUND sound = new SOUND();
            sound.playNoteOnChannel(buttonIndex); // Play the MIDI note corresponding to the button
            // You might want to implement logic to stop the note after a certain duration
            // sound.stopNoteOnChannel(buttonIndex); // Stop the MIDI note
        }
    }

}
