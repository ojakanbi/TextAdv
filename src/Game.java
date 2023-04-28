import javax.swing.*;
import  java.io.*;
import java.lang.reflect.WildcardType;
import java.nio.BufferOverflowException;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Pirate Name: ");
        String pirateName = input.nextLine();

        World world = new World();
        world.load_tiles();

        Pirate pirate = new Pirate(pirateName);
        pirate.setName(pirateName);

        MapTile room = World.tile_exists(pirate.location_x, pirate.location_y);

        if (room != null) {
            System.out.print(room.intro_text(pirate.getName()));
            while (pirate.is_alive() && !pirate.victory) {
                room = World.tile_exists(pirate.location_x, pirate.location_y);
                room.modify_player(pirate);
                if (pirate.is_alive() && !pirate.victory) {
                    System.out.println("\nChoose an action: ");
                    ArrayList<Action> available_actions = room.available_actions();
                    for (Action action : available_actions) {
                        System.out.println(action.getHotkey() + ": " + action.getName());
                    }
                    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                    System.out.print("Action: ");
                    char action_input = in.readLine().charAt(0);
                    for (Action action : available_actions) {
                        if (action_input == action.getHotkey()) {
                            pirate.do_action(action, action.getKwargs(), room);
                            break;
                        } else if (action_input == 'L' || action_input == 'l') {
                            System.out.println("You have left the grotto.");
                        }
                    }
                } else {
                    System.out.println("\n\tGAME OVER!!!! " + pirateName);
                    pirate.writeToFile();
                }
            }
        }
    }
}
