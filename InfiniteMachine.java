import java.util.Scanner;

public class InfiniteMachine{
	
	public static void main(String[] args) throws InterruptedException {

		String answer = "";
		Scanner console = new Scanner(System.in);
		System.out.print("Move the machine? ");
		answer = console.next();
		String distance = "";
		
		while (answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes")){
			
			for (int i = 0; i < 3; i++){
				Thread.sleep(800);
				System.out.print(distance);
				System.out.println("clank clank");	
				distance = distance + "    ";	
			}
			Thread.sleep(800);
			System.out.print(distance + "Move the machine? ");
			distance = distance + "    ";
			
		    answer = console.next();
		}
	}
}