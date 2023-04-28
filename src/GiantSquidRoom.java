public class GiantSquidRoom extends EnemyRoom{

    GiantSquid enemy;

    public GiantSquidRoom(int x, int y, GiantSquid enemy){
        super(x, y, enemy);
        this.enemy = enemy;
    }

    public String intro_text(String name) {
        String squid = "************************************\n" +
                "              _   __\n" +
                "             / `\\/  \\~-_\n" +
                "            {    ;    \\,\\\n" +
                "             \\_  /_  _/\\|\n" +
                "              \\_\\  \\/_/||\n" +
                "              \\_\\O/_/ \\||\n" +
                "          _____\\_\\O/__\\_\\o\\____\n" +
                "         /`  <_\\/_>  `\\\\ \\----.\n" +
                "        /  _.--._    \\ |  (|\n" +
                "    _   `>_...._<'   /_/  /\\|_\n" +
                " /\\`\\_/`  o`    o  `\\/_/ /_/ /`\\\n" +
                "|`\\\\;,',-\"\"\"-,_..-'|`._/\\/``-._ \\\n" +
                " \\\\ \\``--'--'..__,/' \\    `'---._\\\\\n" +
                "  `/_            _`/         ,_>\\\\\n" +
                "     `--._`-.___,'  / ____,--'\\_\\\\\n" +
                "         ||`'---'`|| /_,,----'`\"\"\"`\n" +
                "         \\_\\      /_/\n" +
                "************************************\n";

        if (enemy.is_alive()) {
            return squid + "\nAhoy " + name + "! A giant squid approaches you! Beware its deadly embrace and fight for your life! ";
        } else {
            return squid + "\nAhoy " + name + "! The squid of a dead rot lies on the ground.";
        }
    }

}
