package EncapsulationAndConstructor;

public class Counter {
    int field = 0;
    int fieldReset = field;
    int number;

    public Counter() {
    }

    public Counter(int field) {
        this.field = field;
        fieldReset = field;
    }

    public int add() {
        field++;
        return field;
    }

    public int add(int number) {
        field += number;
        return field;
    }

    public int get() {
        return field;
    }

    public int reset() {
        field = fieldReset;
        return field;
    }


}
