package Histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 10);
		Romain minus = new Romain("Minus", 8);
		
		asterix.parler("Bonjour a tous");
		minus.parler("UN GAU... UN GAUGAU...");
		
		asterix.frapper(minus);
		
		asterix.frapper(minus);

		asterix.frapper(minus);
		
	}

}
