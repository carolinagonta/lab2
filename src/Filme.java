public class Filme {
    private int idFilm;
    private String denumireFilm;
    private String genFilm;
    private String limbaFilm;
    private int anLansare;

    public Filme (int idFilm, String denumireFilm, String genFilm, String limbaFilm, int anLansare){
        this.idFilm = idFilm;
        this.denumireFilm =denumireFilm;
        this.genFilm = genFilm;
        this.limbaFilm = limbaFilm;
        this.anLansare = anLansare;
    }

    public int getIdFilm(){
        return this.idFilm;
    }
    public String getDenumireFilm(){
        return this.denumireFilm;
    }
    public String getGenFilm(){
        return this.genFilm;
    }
    public String getLimbaFilm(){
        return this.limbaFilm;
    }
    public int getAnLansare(){
        return this.anLansare;
    }

    public String toString() {
        return "\nFilme:"+ "\n"
                + "IDFilm: " + this.idFilm + "\n" +
                "DenumireFilm: " + this.denumireFilm+ "\n" +
                "GenFilm: " + this.genFilm + "\n" +
                "LimbaFilm: " + this.limbaFilm +"\n" +
                "AnLansare: " + this.anLansare +"\n" ;
    }
}
