/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */
 

public class HarryPotter {

	private static boolean cloakOn;
	
	static void HarryPotter() {
		System.out.println("making Harry Potter...");
	}

	static void castSpell(String spell){
System.out.println("casting spell: " + spell);
	}

	static void makeInvisible(boolean invisible) {
		cloakOn = invisible;
		
		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}

	static void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}

	public static void main(String[] args) {
		// 1. make harry potter
		HarryPotter();
		// 2. become invisible
		makeInvisible(true);
		// 3. spy on professor snape
		spyOnSnape();
		// 4. become visible again
		makeInvisible(false);
		// 5. cast a “stupefy” spell
		castSpell("stupefy");
	}

}






