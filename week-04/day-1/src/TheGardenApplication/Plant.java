package TheGardenApplication;

public class Plant {

    protected Integer waterAmount;
    protected Integer amountOfWatering;

    public void watering(Integer gardenSize, Integer amountOfWatering) {
        this.amountOfWatering = amountOfWatering;
        this.waterAmount += amountOfWatering / gardenSize;

    }

    public boolean needsWater() {
        if (this.waterAmount < 5) {
            return true;
        } else {
            return false;
        }
    }

    public Plant(Integer waterAmount) {
        this.waterAmount = waterAmount;
    }


    public Plant() {

    }


}
