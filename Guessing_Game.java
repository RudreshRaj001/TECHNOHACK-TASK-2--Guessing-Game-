import java.util.Scanner;

public class Guessing_Game{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = (int)(Math.random() * 100 + 1); // Generate a random number between 1 and 100
    int game = 0; // means no guess was right until
    int count = 0; // Count of tries


    System.out.println("Welcome to the guessing game! I have thought of a number between 1 and 100 GIVE YOUR GUESS: ");
    while(game != 1){
      System.out.println("Enter your guess: ");

      if(sc.hasNextInt()){
        int guess = sc.nextInt();
        if (guess > number){ 
          System.out.println("The number is smaller Than your guess.");
        } else if(guess < number){
          System.out.println("The number is larger Than your guess.");
        }else if (guess == number){ 
          System.out.println("You Guessed it correct!!");
          System.out.println("Correct Number: " + number);
          System.out.println("Your Guess: " + guess);
          System.out.println("No of Failed Tries: " + count);
          game = 1;
        }
        count++;
      }else{
        sc.next(); // empties the previous input.
      }
    }
  }
  
}