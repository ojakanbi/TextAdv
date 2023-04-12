public class EmptyGrottoPath extends MapTile{

    public EmptyGrottoPath(int x, int y){
        super(x,y);
    }


    public  String intro_text(){
        return "You are in an empty grotto with a damp, musty smell. The walls are slick with algae, and you hear the distant sound of waves crashing against the shore.";
    }

    public void modify_player(Pirate player){
        //room has no action on player just yet (need to modify)
    }

}
