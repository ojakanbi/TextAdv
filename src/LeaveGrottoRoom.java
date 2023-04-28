import java.util.ArrayList;
public class LeaveGrottoRoom extends MapTile {

    public LeaveGrottoRoom(int x, int y){
        super(x,y);
    }

//    @Override
//    public void modify_player(Player player) {
//        // The player has reached the end of the cave
//        player.victory = true;
//    }
//
    @Override
    public ArrayList<Action> available_actions() {
        // The only available action in this room is to leave the cave
        ArrayList<Action> actions = new ArrayList<>();
        actions.add(new Action(null, "Leave the cave", 'L', null));
        return actions;
    }

    @Override
    public String intro_text(String name) {
        String congrats = "    __ __ __ __ __ __ __         __ __ __ __ __ __ __\n" +
                "   /__/__/__/__/__/__/|      |\\__\\__\\__\\__\\__\\__\\__\\\n" +
                "  |  Congratulations! |      | |             | |     \n" +
                "   \\__\\__\\__\\__\\__\\__\\|      |/__/__/__/__/__/__/__/\n";

        return "\n You see a bright light in the distance... it grows as you get closer, blindingly white and infinite in its warmth. \n  " +
                "//                As you step outside and take your first deep breath of fresh air, you can't help but feel victorious.\n" + congrats +
                "\nWell done, " + name +
                " With your newly acquired riches, you can live a life of luxury and adventure on the high seas.";
    }

//    public String intro_text(String name) {
//        return "You see a bright light in the distance... it grows as you get closer, blindingly white and infinite in its warmth. \n " +
//                "As you step outside and take your first deep breath of fresh air, you can't help but feel victorious.\n" +
//                " Congratulations, you have successfully escaped the grotto!";
//    }


}
