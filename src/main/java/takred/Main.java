package takred;

public class Main {
    public static void main(String[] args) {
        Character character = new Character();

        character.setWeapon(new Bow());
        System.out.println(character.hit());

        character.setWeapon(new Sword());
        System.out.println(character.hit());
    }
}
