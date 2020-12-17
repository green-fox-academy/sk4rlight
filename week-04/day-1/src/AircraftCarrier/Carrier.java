package AircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    private int storage;
    private int healthPoints;

    List<Aircraft> aircraftList = new ArrayList<>();

    public Carrier(int storage, int healthPoints) {
        setStorage(storage);
        setHealthPoints(healthPoints);
    }

    public void add(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }

    public void fill() {
        int sumAmmo = 0;
        for (Aircraft aircraft : aircraftList) {
            sumAmmo += (aircraft.getMaxAmmoAmount() - aircraft.getAmmoAmount());

            try {
                if (sumAmmo < getStorage()) {
                    aircraft.refill(getStorage());
                } else {
                    for (Aircraft aircraftPriority : aircraftList) {
                        if (aircraftPriority.isPriority()) {
                            aircraftPriority.refill(getStorage());
                        }
                    }

                    for (Aircraft aircraftNotPriority : aircraftList) {
                        if (!aircraftNotPriority.isPriority()) {
                            aircraftNotPriority.refill(getStorage());
                        }
                    }
                }
            } catch (NullPointerException e) {
                System.out.println("The storage has no ammo to fill the aircrafts.");
            }

        }

    }

    public void fight(Carrier anotherCarrier) {

    }

    public String getStatus() {
        StringBuilder stringbuilder = new StringBuilder();
        int totalDamage = 0;
        for (Aircraft aircraft : aircraftList) {
            totalDamage = aircraft.getBaseDamage() * aircraft.getAmmoAmount();
        }
        String carrierStatus =
                "HP: " + getHealthPoints() + ", Aircraft count: " + aircraftList.size() + ", Ammo Storage: " + getStorage() + ", Total damage:" + totalDamage +
                        "\n Aircrafts: \n";
        for (Aircraft aircraft : aircraftList) {
            carrierStatus = stringbuilder.append(aircraft.getStatus() + "\n").toString();
        }

        if (getHealthPoints() == 0) {
            String message = "It's dead, Jim. :(";
            return message;
        } else {
            return carrierStatus;
        }


    }

    ///// SETTERS & GETTERS /////

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getStorage() {
        return storage;
    }
}

