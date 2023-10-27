// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Filme film1= new Filme(1, "Barbie",  "Drama", "engleza",2023);
        Filme film2= new Filme(2,"SpiderMan","actiune","rusa",2019);
        SaliCinema sala1= new SaliCinema(4,100, "3D");
        SaliCinema sala2= new SaliCinema(5, 80, "2D");
        Bilete bilet1= new Bilete(001, 95, 4,10);
        Bilete bilet2= new Bilete(002, 110, 7,1);
        Angajati angajat1= new Angajati(10,"Ana","Bordei","Casier",6000);
        Angajati angajat2= new Angajati(11,"Liliana","Busuioc","Manager",10000);
        System.out.println(film1);
        System.out.println(sala1);
        System.out.println(bilet1);
        System.out.println(bilet1);
        System.out.println(angajat2);

        System.out.println(film1.getIdFilm());
        System.out.println(film1.getDenumireFilm());
        System.out.println(film1.getGenFilm());
        System.out.println(film1.getLimbaFilm());
        System.out.println(film1.getAnLansare());

        System.out.println(sala2.getNrSala());
        System.out.println(sala2.getCapacitate());
        System.out.println(sala2.setTipEcran());

        bilet2.setPret(100);
        System.out.println(bilet1.getIdBilet());
        System.out.println(bilet1.getPret());
        System.out.println(bilet1.getRand());
        System.out.println(bilet1.getLoc());

        angajat2.setSalariu(12000);
        System.out.println(angajat2.getIdAngajat());
        System.out.println(angajat2.getNume());
        System.out.println(angajat2.getPrenume());
        System.out.println(angajat2.getFunctie());
        System.out.println(angajat2.getSalariu());
    }
}