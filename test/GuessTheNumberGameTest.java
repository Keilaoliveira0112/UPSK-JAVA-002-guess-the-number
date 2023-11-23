import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GuessTheNumberGameTest {

    @Test
    @DisplayName("Deve retornar a mensagem muito baixa")
    void testCheckMuitoBaixa() {
        GuessTheNumberGame.targetNumber = 50;
        HumanPlayer mockHumanPlayer = mock(HumanPlayer.class);
        when(mockHumanPlayer.getName()).thenReturn("Keila");
        when(mockHumanPlayer.makeGuess()).thenReturn(10);
        GuessTheNumberGame.checkGuess(mockHumanPlayer);
        Mockito.verify(mockHumanPlayer, Mockito.never()).setGuessed(true);
    }
    @Test
    @DisplayName("Deve retornar a mensagem muito alta")
    void testCheckMuitoAlta() {
        GuessTheNumberGame.targetNumber = 10;
        HumanPlayer mockHumanPlayer = mock(HumanPlayer.class);
        when(mockHumanPlayer.getName()).thenReturn("Keila");
        when(mockHumanPlayer.makeGuess()).thenReturn(88);
        GuessTheNumberGame.checkGuess(mockHumanPlayer);
        Mockito.verify(mockHumanPlayer, Mockito.never()).setGuessed(true);
    }
  //  @Test
    //@DisplayName("Deve retornar a mensagem você venceu")
    //void testCheckVencedor() {
        //GuessTheNumberGame.targetNumber = 75;
       // HumanPlayer mockHumanPlayer = mock(HumanPlayer.class);
       // when(mockHumanPlayer.getName()).thenReturn("Keila");
        //when(mockHumanPlayer.makeGuess()).thenReturn(75);
      //  GuessTheNumberGame.checkGuess(mockHumanPlayer);
    //    Mockito.verify(mockHumanPlayer, Mockito.never()).setGuessed(true);
  //  }

    @Test
    @DisplayName("Deve retornar a mensagem você venceu")
    void testCheckVencedor() {
        GuessTheNumberGame.targetNumber = 75;

        HumanPlayer mockHumanPlayer = mock(HumanPlayer.class);
        when(mockHumanPlayer.getName()).thenReturn("Keila");
        when(mockHumanPlayer.makeGuess()).thenReturn(75);


        GuessTheNumberGame.checkGuess(mockHumanPlayer);


        Mockito.verify(mockHumanPlayer).setGuessed(true);
    }

}
