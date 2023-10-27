public class Angajati {
    private int idAngajat;
    private String nume;
    private String prenume;
    private String functie;
    private int salariu;

    public Angajati(int idAngajat, String nume, String prenume, String functie, int salariu){
        this.idAngajat=idAngajat;
        this.nume=nume;
        this.prenume=prenume;
        this.functie=functie;
        this.salariu=salariu;
    }
    public int getIdAngajat(){
        return this.idAngajat;
    }
    public String getNume(){
        return this.nume;
    }
    public String getPrenume(){
        return this.prenume;
    }
    public String getFunctie(){
        return this.functie;
    }
    public int getSalariu(){
        return this.salariu;
    }
    public void setSalariu(int salariunou){
        this.salariu = salariunou;
    }

    public String toString() {
        return "\nAngajati:"+ "\n"
                + "ID Angajat: " + this.idAngajat + "\n" +
                "Nume: " + this.nume+ "\n" +
                "Prenume: " + this.prenume+ "\n" +
                "Functia: " + this.functie+ "\n" +
                "Salariu: " + this.salariu+"\n" ;
    }
}
