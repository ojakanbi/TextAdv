public class FindPistolRoom extends  LootRoom {
    Pistol item;
    public FindPistolRoom(int x, int y, Pistol pistol){
        super(x, y, pistol);

    }

    public String intro_text(String name){
        if(pickedItem == false) {
            return "\n Welcome " + name  + " to the pistol room, where guns and gold rule the day. " +
                    "Beware the trigger-happy pirates and their deadly aim." +
                    "\n" +
                    "            ___.-~\"~-._   __....__\n" +
                    "          .'    `    \' ~\"\"\"\"        ``-.\n" +
                    "         /` _      )  `             `\\\n" +
                    "        /`  a)    /     |               \\\n" +
                    "       :`        /      |                 `.\n" +
                    "  <`-._|`  .-.  (      /   .            `\\\n" +
                    "   `-. `--'_ .-. `-.    |     |             `\\\n" +
                    "      |`-._ `-' _.-`-._ /      |              : \n" +
                    "      |    ``~~``    ,'`       (o)             ;\n" +
                    "      `~~~~~~~~~~~`                        ,'\n";
        } else {
            return "";
        }
    }

    public void setItem(Pistol item) {
        this.item = item;
    }

//    public void modify_player(Pirate pirate) {
//        if (this.item != null && !this.item.isEmpty()) {
//            for (Pistol item : this.item) {
//                pirate.inventory.add(item);
//                System.out.printf("You have found a %s!\n", item.getName());
//            }
//            this.item.clear();
//        }
//    }


    // will need to add/modify_player so user can pick up pistol
}
