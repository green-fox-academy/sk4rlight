package UsingAnInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Domino implements Comparable<Domino> {

    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }

    public static void main(String[] args) {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(1, 4));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));


        for (Domino list : dominoes) {
            System.out.print(list);
        }

        System.out.println();

        System.out.println("After sorting:");
        Collections.sort(dominoes);

        for (Domino list : dominoes) {
            System.out.print(list);
        }

    }

    @Override
    public int compareTo(Domino o) {
        if (this.getLeftSide() == o.getLeftSide()) {
            if (this.getRightSide() > o.getRightSide()) {
                return 1;
            } else if (this.getRightSide() < o.getRightSide()) {
                return -1;
            } else {
                return 0;
            }
        } else if (this.getLeftSide() < o.getLeftSide()) {
            return -1;
        } else {
            return 0;
        }
    }

}
