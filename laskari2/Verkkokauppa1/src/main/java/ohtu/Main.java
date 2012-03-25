package ohtu;

import ohtu.verkkokauppa.Kauppa;
import ohtu.verkkokauppa.Kirjanpito;
import ohtu.verkkokauppa.Kirjanpito2;
import ohtu.verkkokauppa.Pankki;
import ohtu.verkkokauppa.Pankki2;
import ohtu.verkkokauppa.Varasto2;
import ohtu.verkkokauppa.Viitegeneraattori2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class Main {

    public static void main(String[] args) {
       
        
        ApplicationContext ctx = new FileSystemXmlApplicationContext("src/main/resources/spring-context.xml");
        ///Kirjanpito kirjanpito = ctx.getBean(Kirjanpito.class);
        Varasto2 varasto = ctx.getBean(Varasto2.class);
        Pankki2 pankki = ctx.getBean(Pankki2.class);
        Viitegeneraattori2 viitegeneraattori = ctx.getBean(Viitegeneraattori2.class);
        Kauppa kauppa = ctx.getBean(Kauppa.class);
        
     //   Kirjanpito kirjanpito = new Kirjanpito();
//Varasto varasto = new Varasto(kirjanpito);
//Pankki pankki = new Pankki2(kirjanpito);
//Viitegeneraattori viitegeneraattori = new Viitegeneraattori();
//Kauppa kauppa = new Kauppa(varasto, pankki, viitegeneraattori);
        
        

        // kauppa hoitaa yhden asiakkaan kerrallaan seuraavaan tapaan:
        kauppa.aloitaAsiointi();
        kauppa.lisaaKoriin(1);
        kauppa.lisaaKoriin(3);
        kauppa.lisaaKoriin(3);
        kauppa.poistaKorista(1);
        kauppa.tilimaksu("Pekka Mikkola", "1234-12345");

        // seuraava asiakas
        kauppa.aloitaAsiointi();
        for (int i = 0; i < 24; i++) {
            kauppa.lisaaKoriin(5);
        }

        kauppa.tilimaksu("Arto Vihavainen", "3425-1652");

        // kirjanpito
     ///   for (String tapahtuma : kirjanpito.getTapahtumat()) {
        
       for (String tapahtuma : ctx.getBean(Kirjanpito.class).getTapahtumat()) {
            System.out.println(tapahtuma);
        }
    }
}
