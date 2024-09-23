package personnages;

public class Village {
	private String nom;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	private Chef chef;
	

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}

	public String getNom() {
		return nom;
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois++;
		}
		else {
			System.out.println("Oups");
		}
	}
	
	public Gaulois trouverHabitant(int indice) {
		if (0 <= indice && indice < villageois.length) {
			return villageois[indice];
		} else {
			return null;
		}
	}
	
	public void afficherVillageois(Village village) {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les legendaires Gaulois:");
		int i = 0;
		Gaulois v = villageois[i];
		while (v != null) {
			System.out.println("-" + v.getNom());
			i++;
			v = village.trouverHabitant(i);
		}
	}
	
	public static void main(String[] args) {
		Village irreductibles = new Village("Village des irreductibles", 30);
		Chef Abra = new Chef("Abraracourcix", 6, irreductibles);
		irreductibles.setChef(Abra);
		
		Gaulois asterix = new Gaulois("Asterix", 8);
		irreductibles.ajouterHabitant(asterix);
		
		Gaulois obelix = new Gaulois("Obelix", 25);
		irreductibles.ajouterHabitant(obelix);
		
		irreductibles.afficherVillageois(irreductibles);
		
	}
}
