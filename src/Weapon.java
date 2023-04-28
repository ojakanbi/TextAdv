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


    public String toString() {
        return String.format("{0}\n=====\n{1}\nValue: {2}\nDamage: {3}", this.name, this.description, this.description, this.damage);
    }
}
