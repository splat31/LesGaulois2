package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipements[] equipements;
	private int nbEquipements = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipements[2];
		assert this.force > 0 : "La force du romain est positive";
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
		assert this.force > 0 : "Pre-condition recevoirCoup";
		int forceDebut = this.force;

		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}

		assert this.force < forceDebut : "Post-condition recevoirCoup";
	}

	public void sEquiper(Equipements equipement) {
		switch (nbEquipements) {
		case 0:
			equipements[0] = equipement;
			System.out.println("Le soldat " + nom + " s'equipe avec un " + equipement.getNom());
			nbEquipements++;
			break;
		case 1:
			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possede deja un " + equipement.getNom() + "!");
			} else {
				equipements[1] = equipement;
				System.out.println("Le soldat " + nom + " s'equipe avec un " + equipement.getNom());
				nbEquipements++;
			}
			break;
		case 2:
			System.out.println("Le soldat " + nom + " est deja bien protege!");
			break;
		}
	}
	
	public static void main(String[] args) {
		Romain Auguste = new Romain("Auguste", 10);

		/*Auguste.parler("Suis-je le premier ou bien le dernier empereurs?");
		Auguste.recevoirCoup(8);
		Auguste.recevoirCoup(3);

		System.out.println(Equipements.CASQUE); */
		
		Auguste.sEquiper(Equipements.CASQUE);
		Auguste.sEquiper(Equipements.CASQUE);
		Auguste.sEquiper(Equipements.BOUCLIER);
		Auguste.sEquiper(Equipements.CASQUE);
	}
}
