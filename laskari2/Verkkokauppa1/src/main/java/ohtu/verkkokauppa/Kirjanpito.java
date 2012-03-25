
package ohtu.verkkokauppa;

import java.util.ArrayList;


    public interface Kirjanpito {

    ArrayList<String> getTapahtumat();

    void lisaaTapahtuma(String tapahtuma);
    
}


