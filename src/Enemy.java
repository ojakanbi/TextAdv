public class Enemy {

    protected String name;

    protected int damage;

    protected int hp;

    public Enemy(String name, int hp, int damage){
        this.name = name;
        this.damage = damage;
        this.hp = hp;
    }
    // Health check method: returns a boolean(True or false) if the enemy is greater than 0
    public boolean is_alive(){
        return (this.hp > 0);
    }


}
