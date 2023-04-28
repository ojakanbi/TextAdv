public class EnemyRoom extends MapTile{

    private Enemy enemy;

    public EnemyRoom(int x, int y, Enemy enemy){
        super(x,y);
        this.enemy = enemy;

    }

    public void modify_player(Pirate the_player){
        if (enemy.is_alive()){
            the_player.hp = the_player.hp - enemy.damage;

            System.out.printf("\nEnemy does %d damage. You have %d HP remaining.", enemy.damage, the_player.hp);

        ///else pirate is dead
        }


    }

}
