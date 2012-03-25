/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pekkis
 */
public class StatisticsTest {
 
    Reader readerStub = new Reader() {
 
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<Player>();
 
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
 
            return players;
        }
         
    };
   Statistics stats2 = new Statistics(readerStub);
    public StatisticsTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of search method, of class Statistics.
     */
    @Test
    public void testSearch() {
        Statistics stats2 = new Statistics(readerStub);
        System.out.println("search");
        String name = "Semenko";
        Statistics instance = stats2;
        Player expResult = readerStub.getPlayers().get(0);
        Player result = instance.search(name);
        assertEquals(expResult.getName(), result.getName());
        // TODO review the generated test code and remove the default call to fail.
   
    }

    /**
     * Test of team method, of class Statistics.
     */
    @Test
    public void testTeam() {
        System.out.println("team");
        String teamName = "PIT";
        Statistics instance = stats2;
        List expResult = null;
        List result = instance.team(teamName);
        Player result2 = (Player) result.get(0);
        assertEquals(result2.getName(), "Lemieux");
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of topScorers method, of class Statistics.
     */
    @Test
    public void testTopScorers() {
        System.out.println("topScorers");
        int howMany = 0;
        Statistics instance = stats2;
        List expResult = null;
        List result = instance.topScorers(howMany);
        Player result2 = (Player) result.get(0);
        assertEquals("Gretzky", result2.getName());
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testSearch2(){
        assertEquals(stats2.search("anonymous"), null);
     }
}
