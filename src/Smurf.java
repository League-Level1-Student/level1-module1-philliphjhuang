/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

/* 
 * 1. Watch this smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "My name is " + name + " Smurf.";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		// 3. Fill in this method
		if(name.equalsIgnoreCase("Papa")) {
		return "I have a red hat.";
		} else {
			return "I have a white hat.";
		}
	}

	/* Smurfette is the only female Smurf. */
	public String isGirlOrBoy() {
		// 4. Fill in this method
		if(name.equalsIgnoreCase("Smurfette")) {
		return "I am a Girl.";
		} else {
		return "I am a Boy.";
		}
		
	}


public static void main(String[] args) {
	
	
Smurf HandySmurf = new Smurf("Handy");
System.out.println(HandySmurf.getName());
HandySmurf.eat();


Smurf PapaSmurf = new Smurf("Papa");
System.out.println(PapaSmurf.getName());
System.out.println(PapaSmurf.getHatColor());
System.out.println(PapaSmurf.isGirlOrBoy());

		
Smurf Smurfette = new Smurf("Smurfette");
System.out.println(Smurfette.getName());
System.out.println(Smurfette.getHatColor());
System.out.println(Smurfette.isGirlOrBoy());


}
}