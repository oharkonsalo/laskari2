package ohtu.verkkokauppa;

public class Pankki2 implements Pankki{

  
    private Kirjanpito kirjanpito;

    public Pankki2(Kirjanpito kirjanpito) {
        this.kirjanpito = kirjanpito;
    }
 
    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa) {
        kirjanpito.lisaaTapahtuma("tilisiirto: tililtä " + tilille + " tilille " + tilille
                + " viite " + viitenumero + " summa " + summa + "e");
        
        // täällä olisi koodi joka ottaa yhteyden pankin verkkorajapintaan
        return true;
    }
}
