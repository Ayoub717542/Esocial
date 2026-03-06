package models;

public class Cotisation {
    private int id;
    private int employeId;
    private double salaire;
    private double cotisationSalariale;
    private double cotisationPatronale;

    // getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getEmployeId() { return employeId; }
    public void setEmployeId(int employeId) { this.employeId = employeId; }

    public double getSalaire() { return salaire; }
    public void setSalaire(double salaire) { this.salaire = salaire; }

    public double getCotisationSalariale() { return cotisationSalariale; }
    public void setCotisationSalariale(double c) { this.cotisationSalariale = c; }

    public double getCotisationPatronale() { return cotisationPatronale; }
    public void setCotisationPatronale(double c) { this.cotisationPatronale = c; }
}