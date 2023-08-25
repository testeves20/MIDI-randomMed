package com.example.demo;
import javax.sound.midi.*;

public class SOUND {
    private MidiChannel channel;

    // Map to hold MIDI note numbers for each row
    private int[] noteMappings = {
            60, 60, 60, 60, 60, 60, 60, 60, //C
            61, 61, 61, 61, 61, 61, 61, 61, //C#
            62, 62, 62, 62, 62, 62, 62, 62, //D
            63, 63, 63, 63, 63, 63, 63, 63, //D#
            64, 64, 64, 64, 64, 64, 64, 64, //E
            65, 65, 65, 65, 65, 65, 65, 65, //F
            66, 66, 66, 66, 66, 66, 66, 66, //F#
            67, 67, 67, 67, 67, 67, 67, 67, //G
            68, 68, 68, 68, 68, 68, 68, 68, //G#
            69, 69, 69, 69, 69, 69, 69, 69, //A
            70, 70, 70, 70, 70, 70, 70, 70, //A#
            71, 71, 71, 71, 71, 71, 71, 71, //B
    };

    public SOUND() {

        try {
            Synthesizer synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
            channel = synthesizer.getChannels()[0];
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
            // Handle the exception appropriately
        }
    }

    public void playNoteOnChannel(int rowIndex) {
        int note = noteMappings[rowIndex]; // Get the MIDI note number for the selected row
        channel.noteOn(note, 90); // Play the note at velocity 80
    }

    public void stopNoteOnChannel(int rowIndex) {
        int note = noteMappings[rowIndex]; // Get the MIDI note number for the selected row
        channel.noteOff(note); // Stop the note
    }

    public void close() {
        if (channel != null) {
            channel.allNotesOff(); // Stop all notes before closing
        }
    }
}
