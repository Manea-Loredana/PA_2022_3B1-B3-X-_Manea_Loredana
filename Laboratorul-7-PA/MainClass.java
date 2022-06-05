import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainClass {

    static public void main(String[] args) {
        List<Token> gameTokens = new ArrayList<>();
        //26 litere ale alfabetului englez
        int numberOfTokens = 26;

        Random rand = new Random();
        for (int index = 0; index < numberOfTokens; index++) {
            int generatedTokenLetter = rand.nextInt(26) + 1;
            int generatedTokenValue = rand.nextInt(10) + 1;
            Token generatedToken = new Token(generatedTokenLetter, generatedTokenValue);
            gameTokens.add(generatedToken);
        }


        Game game = new Game(gameTokens);

        Player player1 = new Player("Player1", game);
        Player player2 = new Player("Player2", game);
        Player player3 = new Player("Player3", game);

        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        game.setPlayers(players);
        game.play();

    }
}
