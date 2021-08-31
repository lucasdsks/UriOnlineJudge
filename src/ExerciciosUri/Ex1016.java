package ExerciciosUri;

import java.util.Scanner;

public class Ex1016 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int km = sc.nextInt();
		int tempo = (60*km)/30;
		
		System.out.println(tempo + "minutos");
		
		sc.close();		
	}

}
