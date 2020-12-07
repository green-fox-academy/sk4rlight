package TheGardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden extends Plant {

    public Garden(Integer amountOfWatering) {
        super(amountOfWatering);
    }

    public static void main(String[] args) {

        Flower yellowFlower = new Flower(4, "yellow");
        Flower blueFlower = new Flower(3, "blue");
        Tree purpleTree = new Tree(9, "purple");
        Tree orangeTree = new Tree(8, "orange");

        List<Flower> flowers = new ArrayList<>();
        List<Tree> trees = new ArrayList<>();

        flowers.add(yellowFlower);
        flowers.add(blueFlower);
        trees.add(purpleTree);
        trees.add(orangeTree);

        Integer gardenSize = flowers.size() + trees.size();


        for (Flower flower : flowers) {
            if (flower.needsWater()) {
                System.out.println("The " + flower.color + " Flower needs water.");
                flower.watering(gardenSize, 40);
            } else {
                System.out.println("The " + flower.color + " Flower does not need water.");
            }

        }

        for (Tree tree : trees) {
            if (tree.needsWater()) {
                System.out.println("The " + tree.color + " Tree needs water.");
                tree.watering(gardenSize, 70);
            } else {
                System.out.println("The " + tree.color + " Tree needs water.");
            }


        }


    }
}