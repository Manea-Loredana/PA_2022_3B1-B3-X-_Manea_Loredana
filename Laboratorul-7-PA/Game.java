import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {
    private final Object mutex = new Object();
    private List<Token> tokens;
    private List<Player> players;
    private final List<Token> board = new ArrayList<>();

    public Game(List<Token> tokens) {
        this.tokens = tokens;
    }

    public Game(List<Token> tokens, List<Player> players) {
        this.tokens = tokens;
        this.players = players;
    }

    int pickPosition() {
        if (tokens.isEmpty()) return -1;
        else {
            Random rand = new Random();
            int tokenPosition = rand.nextInt(tokens.size());
            return tokenPosition;
        }
    }

    public boolean getAToken(Player player) {
        synchronized (mutex) {
            int tokenPosition = pickPosition();
            if (tokenPosition != -1) {
                Token tokenTaken = tokens.get(tokenPosition);
                player.addToken(tokenTaken);
                System.out.println("The board at this moment is:\n");
                for (Token token : player.getTokens()) {
                    board.add(token);
                    System.out.println(board);
                }
                tokens.remove(tokens.get(tokenPosition));
            } else {
                return false;
            }
        }
        return true;
    }

    public void play() {

        for (Player player : this.players) {
            new Thread(player).start();
        }
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
