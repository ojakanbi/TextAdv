public class StartingRoom extends MapTile  {

    //constructor method

    public StartingRoom(int x, int y){
        super(x, y);
    }

    public String intro_text(){
        return "\n Ye be findin' yerself in a treacherous grotto, with nary but a flickerin' torch on the wall to guide yer way. \n " +
                "Four paths lie before ye, each shrouded in darkness and danger. Choose wisely, or risk meetin' a watery end.";
    }

    public void modify_player(Pirate player){
        //room has no action on player
    }
}
