import java.util.Scanner;

public class WhileLoops {
	public static void main(String args []){
		System.out.printf("Welcome to the guess a number game, please type in a non decimal number between 0 and 10.\n");
		System.out.printf("You get 3 tries. A new number is generated each time.\n");
		int attempt =1;
		while (attempt<4){
			System.out.printf("\t");   //Input on screen is indented
			int game = 0 + (int) (Math.random() * 10);
			Scanner input = new Scanner(System.in);		
			int user = input.nextInt();
		
			if (user == game) {			
					System.out.printf("Congratulations, the number %d is the correct choice. You have won the game.\n", user);
			}		
			if (user < game){			
					System.out.printf("Sorry but the number %d is too low, the correct number is %d, please try again.\n", user , game);
			}		
			if (user > game){			
				System.out.printf("Sorry but the number %d is too high, the correct number is %d, please try again.\n", user , game);		
			}
			attempt++;
		}
	}
}