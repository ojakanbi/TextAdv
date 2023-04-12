public class FindPistolRoom extends  MapTile {
    Pistol item;
    public FindPistolRoom(int x, int y){
        super(x, y);

    }

    public String intro_text(){
        return "\n Welcome to the pistol room, where guns and gold rule the day. " +
                "Beware the trigger-happy pirates and their deadly aim.";
    }
    public void setItem(Pistol item) {
        this.item = item;
    }
//    public void modify_player(Pirate player) {
//        if (this.item != null && !this.item.isEmpty()) {
//            for (Pistol item : this.item) {
//                player.addinventory(item);
//                System.out.printf("You have found a %s!\n", item.getName());
//            }
//            this.items.clear();
//        }
//    }


    // will need to add/modify_player so user can pick up pistol
}
