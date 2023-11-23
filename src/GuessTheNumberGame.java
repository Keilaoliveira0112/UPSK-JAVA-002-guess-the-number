import java.util.Random;

public class GuessTheNumberGame {
    public static int targetNumber;

    public static void main(String[] args) {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1;
        Player humanPlayer = new HumanPlayer("Keila");
        Player computerPlayer = new ComputerPlayer("Computador");

        Player currentPlayer = humanPlayer;
        while (true) {
            checkGuess(currentPlayer);
            if (currentPlayer.hasGuessed()) {
                displayGameResult(currentPlayer);
                break;
            }
            currentPlayer = (currentPlayer instanceof HumanPlayer) ? computerPlayer : humanPlayer;
        }
    }

    public static void checkGuess(Player player) {
        int guess = player.makeGuess();
        if (guess < targetNumber) {
            System.out.println(player.getName() + " fez a aposta " + guess + " (Muito Baixa)");
        } else if (guess > targetNumber) {
            System.out.println(player.getName() + " fez a aposta " + guess + " (Muito Alta)");
        } else {
            player.setGuessed(true);
        }


    }

    public static void displayGameResult(Player winner) {
        System.out.println("Fim do jogo!");
        System.out.println(winner.getName() + " advinhou o número " + targetNumber + " corretamente!");
        System.out.println("Tentativas de " + winner.getName() + ": " + winner.getGuesses());
    }
}
