import java.util.Random;

public class GuessTheNumberGame {
    private static Random random = new Random();
    private static int targetNumber;

    public static void main(String[] args) {
        targetNumber = random.nextInt(100) + 1;
        Player currentPlayer = new HumanPlayer("Keila");
        Player computerPlayer = new ComputerPlayer("Computador");

        while (true) {
            checkGuess(currentPlayer);
            if (currentPlayer.hasGuessed()) {
                displayGameResult(currentPlayer);
                break;
            }
            currentPlayer = (currentPlayer instanceof HumanPlayer) ? computerPlayer : new HumanPlayer("Keila");
        }
    }

    public static void checkGuess(Player player) {
        int guess = player.makeGuess();
        if (guess < targetNumber) {
            System.out.println(player.getName() + " fez a suposição " + guess + " (Muito Baixa)");
        } else if (guess > targetNumber) {
            System.out.println(player.getName() + " fez a suposição " + guess + " (Muito Alta)");
        } else {
            player.setGuessed(true);
        }
    }

    public static void displayGameResult(Player winner) {
        System.out.println("Fim do jogo!");
        System.out.println(winner.getName() + " adivinhou o número " + targetNumber + " corretamente!");
        System.out.println("Tentativas de " + winner.getName() + ": " + winner.getGuesses());
    }
}
