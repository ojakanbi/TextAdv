public class LootRoom extends MapTile{

    Treasure item;

    public boolean pickedItem = false;

    public LootRoom(int x, int y, Treasure item){
        super(x,y);
        this.item = item;

    }

    public void add_loot(Pirate player){
        player.inventory.add(item);
        pickedItem = true;
    }

//    public void modify_player(Player player){
//        if (pickedItem == false);

}
