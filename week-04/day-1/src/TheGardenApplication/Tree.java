package TheGardenApplication;

public class Tree extends Plant {

    String color;

    public Tree(Integer waterAmount, String color) {
        super(waterAmount);
        this.color = color;
    }

    @Override
    public boolean needsWater() {
        if (this.waterAmount < 10) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void watering(Integer gardenSize, Integer amountOfWatering) {
        this.amountOfWatering = amountOfWatering;
        this.waterAmount += (int) ((0.4 * (amountOfWatering) / gardenSize));
    }
}
