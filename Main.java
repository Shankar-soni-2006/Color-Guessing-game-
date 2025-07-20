

import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args) {
    ColorGame colorGame=new ColorGame();
    colorGame.startGame();

    }
}
class ColorGame{
    String [] colors={"red","green"};
    int numberOfAttempts=5;
    String systemGeneratedColor;
    String userInput;

    public void startGame()
    {
        Scanner sc=new Scanner(System.in);
        this.systemGeneratedColor=this.generateRandomColor();
        boolean isCompleted=true;
        for(int i=1;i<=this.numberOfAttempts;i++)
        {
            System.out.println("Enter the color: ");
            this.userInput=sc.next();
            if(this.userInput.equalsIgnoreCase(this.systemGeneratedColor))
            {
                System.out.println("You won the game in the attempts of: "+i);
                isCompleted=false;
                break;
            }
            else {
                System.out.println("Incorrect Guess please try again\n" +
                        "Number of attempts left: "+(this.numberOfAttempts-i));
            }
        }
      if(isCompleted)
      {
          System.out.println("Gave over better luck next Time");
      }
    }
    public String generateRandomColor()
    {
        Random r =new Random();
        return this.colors[r.nextInt(0,colors.length)];
    }
}