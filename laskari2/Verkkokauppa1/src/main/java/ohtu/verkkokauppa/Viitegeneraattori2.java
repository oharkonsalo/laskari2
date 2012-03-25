package ohtu.verkkokauppa;

public class Viitegeneraattori2 implements Viitegeneraattori{


    private int seuraava;
    
    public Viitegeneraattori2(){
        seuraava = 1;    
    }
    
    public int uusi(){
        return seuraava++;
    }
}
