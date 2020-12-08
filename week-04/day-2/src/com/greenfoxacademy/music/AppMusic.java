package com.greenfoxacademy.music;

public class AppMusic {

    public static void main(String[] args) {

        System.out.println("Test 1, create Electric Guitar, Bass Guitar and Violin with default strings.");
        StringedInstrument.ElectricGuitar guitar = new StringedInstrument.ElectricGuitar();
        StringedInstrument.BassGuitar bassGuitar = new StringedInstrument.BassGuitar();
        StringedInstrument.Violin violin = new StringedInstrument.Violin();

        System.out.println("Test 1 Play");
        guitar.play();
        bassGuitar.play();
        violin.play();

        System.out.println("Test 2, create Electric Guitar, Bass Guitar with 7 and 5 strings .");
        StringedInstrument.ElectricGuitar guitar2 = new StringedInstrument.ElectricGuitar(7);
        StringedInstrument.BassGuitar bassGuitar2 = new StringedInstrument.BassGuitar(5);

        System.out.println("Test 2 Play");
        guitar2.play();
        bassGuitar2.play();
    }

}
