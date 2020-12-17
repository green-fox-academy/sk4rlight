package AircraftCarrier;

public class Aircraft {
    private int ammoAmount = 0;
    private int maxAmmoAmount;
    private int baseDamage;
    private String type;

    public Aircraft(String type) {
        if (this.getType().equals("F16")) {
            this.setMaxAmmoAmount(8);
            this.setBaseDamage(30);
        } else if (this.getType().equals("F35")) {
            this.setMaxAmmoAmount(12);
            this.setBaseDamage(50);
        }
    }

    public int fight() {
        this.ammoAmount -= ammoAmount;
        int damage = this.getAmmoAmount() * this.getBaseDamage();
        return damage;
    }

    public int refill(int storage) {
        int fillAmount = this.getMaxAmmoAmount() - this.getAmmoAmount();
        if (this.getMaxAmmoAmount() > this.getAmmoAmount() && storage >= fillAmount) {
            storage -= fillAmount;
            setAmmoAmount(getAmmoAmount() + fillAmount);
        }
        return storage;
    }

    public boolean isPriority() {
        if (this.getType().equals("F35")) {
            return true;
        }
        return false;
    }

    //// SETTERS GETTERS ////

    public String getStatus() {
        String status = "Type " + this.getType() + ", Ammo: " + this.getAmmoAmount() + ", Base Damage: " + this.getBaseDamage() + ", All Damage: " + this.getBaseDamage() * this.getAmmoAmount();
        return status;
    }

    public String getType() {
        return this.type;
    }

    public int getAmmoAmount() {
        return ammoAmount;
    }

    public int getMaxAmmoAmount() {
        return maxAmmoAmount;
    }

    public int getBaseDamage() {
        return baseDamage;
    }

    public void setAmmoAmount(int ammoAmount) {
        this.ammoAmount = ammoAmount;
    }

    public void setMaxAmmoAmount(int maxAmmoAmount) {
        this.maxAmmoAmount = maxAmmoAmount;
    }

    public void setBaseDamage(int baseDamage) {
        this.baseDamage = baseDamage;
    }
}
