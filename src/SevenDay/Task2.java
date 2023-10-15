package SevenDay;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(100 - 90) + 90);
        Player player2 = new Player(random.nextInt(100 - 90) + 90);
        Player player3 = new Player(random.nextInt(100 - 90) + 90);
        Player player4 = new Player(random.nextInt(100 - 90) + 90);
        Player player5 = new Player(random.nextInt(100 - 90) + 90);
        Player player6 = new Player(random.nextInt(100 - 90) + 90);

        Player.info();
        while (player1.stamina > 0) {
            player1.run();
        }
        Player.getCountPlayers();
        Player.info();

    }
}
