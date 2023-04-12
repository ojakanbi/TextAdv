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

    @Override
    public ArrayList<Action> available_actions() {
        // The only available action in this room is to leave the cave
        ArrayList<Action> actions = new ArrayList<>();
        actions.add(new Action(null, "Leave the cave", 'L', null));
        return actions;
    }

    @Override
    public String intro_text() {
        return "You see a bright light in the distance... it grows as you get closer, blindingly white and infinite in its warmth. As you step outside and take your first deep breath of fresh air, you can't help but feel victorious. Congratulations, you have successfully escaped the grotto!";
    }


}
