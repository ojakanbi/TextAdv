public class Cutlass extends Weapon {

    public Cutlass() {
        super("Cutlass", "A Cutlass" +
                " short, curved sword with a single-edged blade and a basket-shaped hilt.", 10, 20);
    }


    public String toString() {
        return this.name + "\n " + this.description + "\n" + "Value: " + this.value + "\nDamage: " + this.getDamage() + "\n";
    }
}
//this.damage was in the to string