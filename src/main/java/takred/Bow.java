package takred;

public class Bow implements Weapon {
    @Override
    public String hit() {
        return "Вы сделали выстрел из лука.";
    }
}
