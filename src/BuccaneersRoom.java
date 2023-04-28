public class BuccaneersRoom extends EnemyRoom{

    Buccaneer enemy;

   public BuccaneersRoom (int x, int y, Buccaneer enemy){
       super(x, y,enemy);
       this.enemy = enemy;
   }

    public String intro_text(String name){
        if (enemy.is_alive()){
            return "Arrr, ye be facin' the dreaded Buccaneer, the head Buccaneer who charges towards ye, shakin' the ground with each step!";
        }
        else{
            return "A dead corpse of the Buccaneer lies on the ground and it's you, " + name + "!!" ;
        }
    }
}
