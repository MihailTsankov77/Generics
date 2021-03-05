package First;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		GenericStack<String> a = new GenericStack<>();
		
		for(byte i = 0; i<5;i++) {
			System.out.println("Come on give me a String");
			a.push(sc.nextLine());
			System.out.println("Thanks");
		}
		System.out.println("\nNow take them back!(in reverse)");

		while(!a.isEmpty()) {
			System.out.println( a.pop());
		}
		
		
	}

	
}
