import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class Pirate implements Comparable<Pirate> {

    int hp; // pirate health points

    String name; // pirate name

    int plyrGold;
    Integer score;
    Boolean	 victory;
    int location_x, location_y;
    int prevLocatnX,prevLocatnY;

    ArrayList<Treasure> inventory = new ArrayList<Treasure>();

    public Pirate(String name) {
        super();
        this.name = name;
//        inventory.add(new Cutlass());
        inventory.add(new Pistol());
        inventory.add(new Gold(20));
        this.hp = 140; // Health Points
        this.location_x = World.Starting_Position.x;
        this.location_y = World.Starting_Position.y;
        this.victory = false; //no victory on start up

    }

    public boolean is_alive(){
        return (hp > 0);   //Greater than zero value then you are still alive
    }

    public void print_inventory(){

        int totalGold=0;Gold geld=null ;
        for (Treasure treasure: inventory){
            if(!(treasure instanceof Gold))
            {

                System.out.println(treasure.toString());
            }
            else
            {
                geld = (Gold)treasure;
                totalGold += geld.amt;
            }

        }
        Treasure gold = new Gold(totalGold);
        plyrGold = totalGold;
        System.out.println(gold.toString());
    }

    public void updateGold()
    {
        int totalGold=0;Gold geld=null ;
        for (Treasure treasure: inventory){
            if(!(treasure instanceof Gold))
            {

            }
            else
            {
                geld = (Gold )treasure;
                totalGold += geld.amt;
            }

        }
        Treasure gold = new Gold(totalGold);
        plyrGold = totalGold;

    }

    public void writeToFile()
    {
        //update player's gold
        updateGold();

        try {
            //open file to write to
            File fw = new File("Scores.txt");

            //if file doesn't exist, create it
            if(!fw.exists() )
            {
                fw.createNewFile();
            }

            //open file writer and print writer to write to file
            FileWriter fobj= new FileWriter(fw,true);
            PrintWriter pobj = new PrintWriter(fobj);

            //write player's name and gold to file
            pobj.println(name+"\t"+plyrGold);

            //close print writer and file writer
            pobj.close();
            fobj.close();

            //open file reader and buffered reader to read from file
            FileReader frdr = new FileReader(fw);
            BufferedReader brdr= new BufferedReader(frdr);

            //initialize variables for parsing file data
            String entry = "";
            ArrayList<Pirate> plyrs = new ArrayList<Pirate>();

            //read file line by line and create a Pirate object for each entry
            while((entry=brdr.readLine()) != null)
            {
                String arr[] = entry.split("\t");
                Pirate plyr = new Pirate(name);
                plyr.setName(arr[0]);
                plyr.setScore(Integer.parseInt(arr[1]));
                plyrs.add(plyr);
            }

            //sort the Pirates array list based on score
            Collections.sort(plyrs);

            //print out the Pirates array list in descending order of score
            for(Pirate p:plyrs)
            {
                System.out.println("Name:"+p.getName()+"    Score:"+p.getScore());
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }


    public void move(int dx, int dy){
        prevLocatnX = location_x;
        prevLocatnY = location_y;
        location_x += dx;
        location_y += dy;
        System.out.print(World.tile_exists(location_x, location_y).intro_text(name));
    }
    public void move_north(){
        move(-1,0);
    }

    public void move_south(){
        move(1,0);
    }

    public void move_east(){
        move(0,1);
    }

    public void move_west(){
        move(0,-1);
    }

    public void doFlee(MapTile mp)
    {
        ArrayList<Action> available_moves = mp.adjacentMoves();
        Random rn=new Random();
        int random=rn.nextInt(available_moves.size());
        Action randomAction=available_moves.get(random);
        do_action(randomAction, null, null);

    }
    public void do_action(Action action, Enemy kwargs,MapTile mp){
        if(kwargs == null)
        {
            if(action instanceof MoveEast)
            {
                move_east();
            }else if (action instanceof MoveWest)
            {
                move_west();
            }else if (action instanceof MoveNorth)
            {
                move_north();
            }else if (action instanceof MoveSouth)
            {
                move_south();
            }else if (action instanceof ViewInventory)
            {
                print_inventory();
            }else if (action instanceof Flee)
            {
                doFlee(mp);
            }

        }
        else if (action instanceof Attack)
        {
            attackEnemy(kwargs);
        }

    } //End Code block do_attack method*/

    public void attackEnemy(Enemy enemy)
    {
        Weapon best_weapon = new Weapon("None", "None", 0, 0);
        int max_dmg = 0;
        for (Treasure i:inventory){
            if (i instanceof Weapon){
                Weapon wpn = (Weapon)i;
                if (wpn.getDamage() > max_dmg){
                    max_dmg = wpn.getDamage();
                    best_weapon = wpn;
                }
            }
        } //End Code block for loop
        System.out.printf("You use %s against %s!",best_weapon.name, enemy.name);
        enemy.hp -= best_weapon.getDamage();
        if (!enemy.is_alive()){
            System.out.printf("You killed %s!",enemy.name);
        }else{
            System.out.printf("%s HP is %d.",enemy.name, enemy.hp);
        }
    }

    // getters and setters
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlyrGold() {
        return plyrGold;
    }

    public void setPlyrGold(int plyrGold) {
        this.plyrGold = plyrGold;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Boolean getVictory() {
        return victory;
    }

    public void setVictory(Boolean victory) {
        this.victory = victory;
    }

    public int getLocation_x() {
        return location_x;
    }

    public void setLocation_x(int location_x) {
        this.location_x = location_x;
    }

    public int getLocation_y() {
        return location_y;
    }

    public void setLocation_y(int location_y) {
        this.location_y = location_y;
    }

    public int getPrevLocatnX() {
        return prevLocatnX;
    }

    public void setPrevLocatnX(int prevLocatnX) {
        this.prevLocatnX = prevLocatnX;
    }

    public int getPrevLocatnY() {
        return prevLocatnY;
    }

    public void setPrevLocatnY(int prevLocatnY) {
        this.prevLocatnY = prevLocatnY;
    }

    @Override
    public int compareTo(Pirate o) {
        return 0;
    }
}
