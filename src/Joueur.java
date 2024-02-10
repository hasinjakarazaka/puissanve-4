
public class Joueur {
	private String nom;
	private int couleur;

	public Joueur(String nom, int couleur) {
		this.nom = nom;
		this.couleur = couleur;
	}

	public String getNom() {
		return nom;
	}

	public int getCouleur() {
		return couleur;
	}

  /**
   * Cette m�thode joue un coup avec le tableau re�u en param�tre.
   * La m�thode est vide car les sous-classes doivent l'impl�menter.
   * (Vous verrez prochainement comment g�rer ce genre de cas plus proprement)
   * @param jeu Le Jeu avec lequel jouer.
   */
	public void joue(Jeu jeu) {}
}