import javax.swing.*;
import  java.io.*;
import java.lang.reflect.WildcardType;
import java.nio.BufferOverflowException;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws IOException {
        //        System.out.println("Hello world!");

        World world = new World();

        world.load_tiles();

        //System.println("Enter Pirate Name: ");
        //Scanner input = new Scanner(System.in);

        String pirateName = "Team Deadly Games";

        Pirate pirate  = new Pirate(pirateName);

        //These lines load the starting room and display the text

        MapTile room  = World.tile_exists(pirate.location_x, pirate.location_y);
    if(room != null);
        {
            System.out.print(room.intro_text());
            while ((pirate.is_alive()) && (!pirate.victory)){
                room = World.tile_exists(pirate.location_x, pirate.location_y);
                // System.out.print(room.intro_text());
//                room.modify_player(pirate);
//			  // Check again since the room could have changed the player's state

                if ((pirate.is_alive()) &&  (!pirate.victory)){
                    System.out.print("\nChoose an action: \n");
                    ArrayList<Action> available_actions = room.available_actions();
                    for (Action action :available_actions){
                        System.out.print(action.getHotkey() + ":" + action.getName() + "\n");
                    }
                    BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
                    System.out.println("Action: ");
                    char action_input = in.readLine().charAt(0);
                    for (Action action:available_actions){
                        if (action_input == action.getHotkey()){
                            pirate.do_action(action, action.getKwargs(), room);
                            break;
                        }
                    }

                }
                else{
                    System.out.println("\n \t GAME OVER!!!!");
                    pirate.writeToFile();
                }
            }
        }

    }
}