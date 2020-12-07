package TheGardenApplication;

public class Flower extends Plant {

    String color;

    public Flower(Integer waterAmount, String color) {
        super(waterAmount);
        this.color = color;
    }

    @Override
    public boolean needsWater() {
        if (this.waterAmount < 5) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void watering(Integer gardenSize, Integer amountOfWatering) {
        this.amountOfWatering = amountOfWatering;
        this.waterAmount += (int) (0.75 * (amountOfWatering / gardenSize));
    }


}
