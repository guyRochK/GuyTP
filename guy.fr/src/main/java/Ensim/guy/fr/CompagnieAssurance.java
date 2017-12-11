package Ensim.guy.fr;

public class CompagnieAssurance {
	
	private String nom;
	
	public int obtenirNombreDeClients(){
		
		Personne p = null;
		return p.getCompteur();
	}
	
	public int obtenirNombreDeProspects(){
		return 0;
	}
	
	public int obtenirNombreDeContrats(){
		Personne p = null;
		return p.getCompteur();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	

}
