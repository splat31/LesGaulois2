package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert this.force > 0;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Romain " + nom + ": ";
	}

	public void recevoirCoup(int forceCoup) {
		assert this.force > 0 : "Pre-condition";
		int forceDebut = this.force;
		
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
		
		assert this.force < forceDebut : "Post-condition";
	}
	
	public static void main(String[] args) {
		Romain Auguste = new Romain("Auguste", 8);
		
		Auguste.parler("Suis-je le premier ou bien le dernier empereurs?");
		Auguste.recevoirCoup(8);
		Auguste.recevoirCoup(3);
	}
}
