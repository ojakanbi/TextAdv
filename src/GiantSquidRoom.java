public class GiantSquidRoom extends EnemyRoom{

    GiantSquid enemy;

    public GiantSquidRoom(int x, int y, GiantSquid enemy){
        super(x, y, enemy);
        this.enemy = enemy;
    }

    public String intro_text(){
        if (enemy.is_alive()){
            return "A giant squid , where the kraken lurks in the depths. Beware its deadly embrace and approaches you!";
        }else{
            return "The Squid of a dead rots on the ground";
        }
    }
}
