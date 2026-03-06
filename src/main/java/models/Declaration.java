package models;


import java.time.LocalDate;

public class Declaration {

	private int id ;
	private int mois;
	private int annee ;
	private LocalDate dateDeclaration;
	

	public Declaration(int id, int mois, int annee, LocalDate dateDeclaration) {
		super();
		this.id = id;
		this.mois = mois;
		this.annee = annee;
		this.dateDeclaration = dateDeclaration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public LocalDate getDateDeclaration() {
		return dateDeclaration;
	}
	public void setDateDeclaration(LocalDate dateDeclaration) {
		this.dateDeclaration = dateDeclaration;
	}
	
	
}
