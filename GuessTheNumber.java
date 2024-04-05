import java.util.Random;
import javax.swing.JOptionPane;

public class GuessTheNumber 
{
    public static void main(String[] args) 
    {
        int MAX_ATTEMPTS = 10; 
        int RANGE = 100;
        int score = 0; 
        
        JOptionPane.showMessageDialog(null, "Welcome to Guess the Number game!");

        while (true) 
        {
            Random random = new Random();
            int randomNumber = random.nextInt(RANGE) + 1;
            int attempts = 0;
            
            JOptionPane.showMessageDialog(null, "I have picked a number between 1 and " + RANGE + ". Can you guess it?");

            while (attempts < MAX_ATTEMPTS) 
            {
                String input = JOptionPane.showInputDialog("Enter your guess:");
                int guess = Integer.parseInt(input);
                
                if (guess == randomNumber) 
                {
                    JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number!");
                    score += MAX_ATTEMPTS - attempts; 
                    break;
                } 
                else if (guess < randomNumber) 
                {
                    JOptionPane.showMessageDialog(null, "Too low! Try again.");
                } 
                else 
                {
                    JOptionPane.showMessageDialog(null, "Too high! Try again.");
                }
                
                attempts++;
            }
            
            if (attempts == MAX_ATTEMPTS) 
            {
                JOptionPane.showMessageDialog(null, "Sorry, you've run out of attempts. The number was: " + randomNumber);
            }
            
            int choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Play Again", JOptionPane.YES_NO_OPTION);
            if (choice != JOptionPane.YES_OPTION) 
            {
                break;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Your final score is: " + score);
        JOptionPane.showMessageDialog(null, "Thank you for playing Guess the Number!");
    }
}

