package com.greenfoxacademy.music;

public class StringedInstrument extends Instrument {

    int numberOfStrings;

    public StringedInstrument() {

    }

    public void sound() {
        System.out.println(" that goes ");
    }

    public static class ElectricGuitar extends StringedInstrument {
        String sound = "Twang";

        public ElectricGuitar(int numberOfStrings) {
            this.numberOfStrings = numberOfStrings;
        }

        public ElectricGuitar() {

        }

    }

    public static class BassGuitar extends StringedInstrument {
        String sound = "Duum-duum-duum";

        public BassGuitar(int numberOfStrings) {
            this.numberOfStrings = numberOfStrings;
        }

        public BassGuitar() {

        }
    }

    public static class Violin extends StringedInstrument {
        String sound = "Screech";

        public Violin() {

        }
    }

}
