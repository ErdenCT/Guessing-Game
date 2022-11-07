import java.util.Scanner;

class Picker{
	int pickNum;
	
	int pickNum(){
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("Picker please pick a random number (1-10) ");
		pickNum = scan.nextInt();
		if(pickNum>0 && pickNum<11) {
			break;
		}
		else {
			System.out.println("Your pick is not valid pick between 1-10");
			continue;
			}
		}
		return pickNum;
	}
}
class Player{
	int guessNum;

	int guessNum(int i){
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("Player "+ i + " please give me a guess (1-10) ");
		guessNum = scan.nextInt();
		if(guessNum>0 && guessNum<11) {
			break;
		}
		else {
			System.out.println("Your guess is not valid guess between 1-10");
			continue;
			}
		}
		return guessNum;
	
}
}
class Referee{
	int numFromPicker;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	int count=1;
	
	void collectFromPicker() {
		Picker obj=new Picker();
		numFromPicker=obj.pickNum();
		
	}
	void collectFromPlayers() {
		
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum(1);
		numFromPlayer2=p2.guessNum(2);
		numFromPlayer3=p3.guessNum(3);
		
	}
	void compareNumbers() {
		if(numFromPlayer1==numFromPicker&&numFromPlayer2 ==numFromPicker
				&&numFromPlayer3 ==numFromPicker) {
			System.out.print("All 3 has won ");
			System.out.println("at "+count+". try!");
		}
		else if(numFromPlayer1==numFromPicker&&numFromPlayer2 !=numFromPicker
				&&numFromPlayer3 !=numFromPicker) {
			System.out.print("Player 1 has won ");
			System.out.println("at "+count+". try!");
		}
		else if(numFromPlayer1==numFromPicker&&numFromPlayer2 ==numFromPicker
				&&numFromPlayer3 !=numFromPicker) {
			System.out.print("Both Player 1 and 2 has won ");
			System.out.println("at "+count+". try!");
		}
		else if(numFromPlayer1==numFromPicker&&numFromPlayer2 !=numFromPicker
				&&numFromPlayer3 ==numFromPicker) {
			System.out.print("Both Player 1 and 3 has won ");
			System.out.println("at "+count+". try!");
		}
		
		else if(numFromPlayer2==numFromPicker&&numFromPlayer1 !=numFromPicker
				&&numFromPlayer3 !=numFromPicker) {
			System.out.print("Player 2 has won ");
			System.out.println("at "+count+". try!");
		}
		else if(numFromPlayer2==numFromPicker&&numFromPlayer3 ==numFromPicker){ 
			System.out.print("Both Player 2 and 3 has won ");
			System.out.println("at "+count+". try!");
		}
		else if(numFromPlayer3==numFromPicker&&numFromPlayer1 !=numFromPicker
				&&numFromPlayer2 !=numFromPicker) {
			System.out.print("Player 3 have won ");
			System.out.println("at "+count+". try!");
		}
		else {
			System.out.println("No one predicted the number! Try again.");
			count++;
			System.out.println();
			collectFromPlayers();
			compareNumbers();
			
		}
		
		
	}
}

public class GuessingGame {
	

	public static void main(String[] args) {
		
		Referee referee=new Referee();
		
		referee.collectFromPicker();
		referee.collectFromPlayers();
		referee.compareNumbers();
		

	}

}
