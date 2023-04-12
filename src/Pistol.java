public class Pistol extends Weapon{
    public Pistol() {
        super("Pistol", "A Pistol" +
                " a device that harnesses the power of steam to drive a ship's propeller, allowing us pirates to outrun any navy ship in pursuit.", 10, 30);
    }

    @Override
    public String toString() {
        return String.format("Arrr! Ye be seein' a cave entrance, matey. 'Tis dark and ominous, it be.\n" +
                "Ye hear the sound of water drippin' like it be the whispers of Davy Jones himself.\n" +
                "Also, there be a pile of %d musket balls next to the entrance, ready to be used against any navy soldiers who dare cross us.", getValue());
    }

    public boolean isEmpty() {
        if(this.value <= 0){
            return true;
        }
        return true;
    }
}
