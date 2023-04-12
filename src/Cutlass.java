public class Cutlass extends Weapon {

    public Cutlass() {
        super("Cutlass", "A Cutlass" +
                " short, curved sword with a single-edged blade and a basket-shaped hilt.", 10, 20);
    }

    @Override
    public String toString() {
        return String.format("Arrr! Ye be seein' a cave entrance, matey. 'Tis dark and ominous, it be.\n" +
                "Ye hear the sound of water drippin' like it be the whispers of Davy Jones himself.\n" +
                "Also, there be a pile of %d musket balls next to the entrance, ready to be used against any navy soldiers who dare cross us.", getValue());
    }
}
