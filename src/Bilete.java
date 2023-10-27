public class Bilete {
    private int idBilet;
    private int pret;
    private int rand;
    private int loc;

    public Bilete(int idBilet, int pret, int rand, int loc){
        this.idBilet= idBilet;
        this.pret = pret;
        this.rand = rand;
        this.loc = loc;
    }
    public int getIdBilet(){
        return this.idBilet;
    }
    public int getPret(){
        return this.pret;
    }
    public void setPret(int altPret){
        this.pret = altPret;
    }
    public int getRand(){
        return this.rand;
    }
    public int getLoc(){
        return this.loc;
    }
    public String toString() {
        return "\nBilete: "+ "\n"
                + "ID Bilet: " + this.idBilet + "\n" +
                "Pret Bilet: " + this.pret+ "\n" +
                "Randul: " + this.rand + "\n" +
                "Loc: " + this.loc+"\n" ;
    }
}
