public class Weapon extends Treasure {
    private int damage; // damage to the weapon when iitialized


    public Weapon(String name, String description, int value, int damage) {
        super(name, description, value);
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Cutlass{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", value=" + value +
                '}';
    }
}
