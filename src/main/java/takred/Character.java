package takred;

public class Character {
    private Weapon weapon;

    public String hit() {
        return weapon.hit();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
