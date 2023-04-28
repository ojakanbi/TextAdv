public class LootRoom extends MapTile {

    Treasure item;

    public boolean pickedItem = false;

    public LootRoom(int x, int y, Treasure item) {
        super(x, y);
        this.item = item;

    }

    public void add_loot(Pirate player) {
        player.inventory.add(item);
        pickedItem = true;
    }

    public void modify_player(Pirate player) {
//        if (pickedItem == false) ;
//        add_loot(player);
        if (!pickedItem) {
            player.inventory.add(item);
            pickedItem = true;
            System.out.println("You picked up a " + item.name + ".");
        } else {
            System.out.println("You already picked up the item in this room.");
        }

    }
}