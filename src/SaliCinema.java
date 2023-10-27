public class SaliCinema {
    private int nrSala;
    private int capacitate;
    private String tipEcran;

    public SaliCinema (int nrSala, int capacitate, String tipEcran ){
        this.nrSala= nrSala;
        this.capacitate = capacitate;
        this.tipEcran = tipEcran;
    }
    public int getNrSala(){
        return this.nrSala;
    }
    public int getCapacitate(){
        return this.capacitate;
    }
    public String setTipEcran(){
        return this.tipEcran;
    }
    public String toString() {
        return "\nSali: "+ "\n"
                + "Numarul salii: " + this.nrSala + "\n" +
                "Capacitate: " + this.capacitate +"\n"+
                "Tip ecran: " + this.tipEcran + "\n";
    }
}
