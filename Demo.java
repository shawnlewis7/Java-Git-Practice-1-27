import java.util.Scanner;

public class Demo
{
   public static void main(String[] args)
   {
       Scanner kb = new Scanner(System.in);
       ZooExhibits x;
       System.out.println("You are a zoo keeper at your local zoo");
       System.out.println("You have to take care of " 
                          +"the animals within the zoo");
       System.out.println("Type p if you want to go to the " 
                          + "penguin exhibit, otherwise you will to " 
                          + "go to the reptile exhibit");
       String answer = kb.nextLine();
       if (answer.equals("p") || answer.equals("P"))
       {
           x = new PenguinExhibit();
       }
       else
       {
           x = new ReptileExhibit();
       }
       x.feedAnimals();
   }
}
