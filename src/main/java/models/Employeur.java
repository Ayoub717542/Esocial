package models;

public class Employeur {
	private int Employeurid;
    private String raisonSociale;
    private String secteurActivite;
    
	
	public Employeur(int Employeurid, String raisonSociale, String secteurActivite) {
		super();
		this.Employeurid = Employeurid;
		this.raisonSociale = raisonSociale;
		this.secteurActivite = secteurActivite;
	}
	public Employeur() {
		
	}
	public int getId() {return Employeurid;}
	public void setId(int Employeurid) {this.Employeurid = Employeurid;}
	public String getRaisonSociale() {return raisonSociale;}
	public void setRaisonSociale(String raisonSociale) {this.raisonSociale = raisonSociale;}
	public String getSecteurActivite() {return secteurActivite;}
	public void setSecteurActivite(String secteurActivite) {this.secteurActivite = secteurActivite;}

    public void setEmployeurid(int employeurid) {
        Employeurid = employeurid;
    }

    public int getEmployeurid() {
        return Employeurid;
    }
}

