public class TreasureRoom extends LootRoom{

    public TreasureRoom(int x, int y, Treasure gold){
        super(x, y, gold);
    }

    public String intro_text(String name) {
        if (pickedItem == false) {
            return "\n" +
                    "     /\\        \n" +
                    "    //\\\\      \n" +
                    "   //  \\\\     \n" +
                    "  //____\\\\    \n" +
                    " |        |   \n" +
                    " | $ 15   |   \n" +
                    " |________|   \n" +
                    "\n" +
                    "You notice a gold coin with 15 stamped on the front. Perhaps it's a clue to the location of a hidden treasure.\n";
        } else {
            return "";
        }
    }


}
