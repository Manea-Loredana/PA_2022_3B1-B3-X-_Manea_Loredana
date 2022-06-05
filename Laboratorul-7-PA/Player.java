import java.util.ArrayList;
import java.util.List;

public class Player implements Runnable {

    private String name;
    private List<Token> tokens;
    private Game game;

    public Player(String name, Game game) {
        this.name = name;
        this.game = game;
        tokens = new ArrayList<>();
    }

    @Override
    public void run() {
        while (game.getAToken(this)) {
            if (!game.getTokens().isEmpty()) {
                System.out.println("Game is still going! Fight!");
                System.out.println();
            } else System.out.println("\nGame has ended");
        }
    }

    public void addToken(Token token) {
        tokens.add(token);
        System.out.println("Player " + this.name + " added the token " + token);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Token> getTokens() {
        return tokens;
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
