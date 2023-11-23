import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public int makeGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(name + ", faça sua aposta: ");
        int guess = scanner.nextInt();
        guesses.add(guess);
        return guess;
    }
}
