public class StartingRoom extends MapTile  {

    //constructor method

    public StartingRoom(int x, int y){
        super(x, y);
    }

    public String intro_text(String name) {
        String border = "***************************************************\n";
        String pirate = "      /\\_\\\n" +
                "  ___/ o o \\   ___\n" +
                " /    \\_\\_/   /   \\\n" +
                "/_/\\_\\/_/\\_\\_/\\_\\_\\\n" +
                "\\_\\/_/\\_\\/_/\\_\\/\\/_/\n" +
                "  \\_\\/_/\\_\\/ /_/ /  Welcome aboard, " + name + "!\n" +
                "   \\_\\/\\_\\/\\/_/ /   \n" +
                "    \\/_/\\_\\/_/ /    Are ye ready for a thrilling private adventure?\n" +
                "       \\_\\/\\_\\/     \n";
        String intro = "Ye find yourself in a treacherous grotto.\n" +
                "Only these paths lie before ye, shrouded in darkness and danger.\n" +
                "It's ye only option for survival.\n";
        return border + pirate + border + intro + border;
    }


    public void modify_player(Pirate player){
        //room has no action on player
    }
}
