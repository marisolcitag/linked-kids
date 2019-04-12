package userInterface;

import model.*;

public class Main {

	public static void main(String[] args) {
		Party p = new Party();
		p.addKid("Marisol", 5);
		p.addKid("Juan Manuel", 2);
		p.addKid("Lina", 8);
		p.addKid("Diana", 6);
		p.addKid("Pedro", 3);
		p.addKid("Luis", 9);
		
		System.out.println("The kids in the Party are:");
		System.out.println(p.patiensInString());
		System.out.println("The kids ordered by Age:");
		
		
	}

}

