package models;

public class Assure {

	private int id ;
	private String nom;
	private double salaireMensue;
	
	public Assure(int id, String nom, double salaireMensue) {
		super();
		this.id = id;
		this.nom = nom;
		this.salaireMensue = salaireMensue;
	}
	public Assure() {
	}
	public int getId() {	
		return id;
		}
	public void setId(int id) {
		this.id = id;
		}
	public String getNom() {
		return nom;
		}
	public void setNom(String nom) {
		this.nom = nom;
		}
	public double getSalaireMensue() {
		return salaireMensue;
	}
	public void setSalaireMensue(double salaireMensue) {
		this.salaireMensue = salaireMensue;
	}

}
