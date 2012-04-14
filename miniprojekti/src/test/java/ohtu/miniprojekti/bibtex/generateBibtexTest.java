/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.miniprojekti.bibtex;

import ohtu.miniprojekti.domain.Viite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author sam
 */
public class generateBibtexTest {
    
    public generateBibtexTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGenerateBibtex() {
        
        Viite testiViite = new Viite();
        generateBibtex tex = new generateBibtex();
        
        
        testiViite.setViiteType(Viite.ViiteType.BOOK);
        testiViite.setAuthor("Moriarty, James");
        testiViite.setTitle("A Treatise on the Binomial Theorem");
        testiViite.setPublicationYear("1850");
        testiViite.setPublisher("Miscatonic University Press");
        StringBuffer test = tex.generateBibtex(testiViite);
        System.out.println(test);
        
        Viite testiViite2 = new Viite();
        testiViite2.setViiteType(Viite.ViiteType.ARTICLE);
        testiViite2.setAuthor("Moriarty, James");
        testiViite2.setTitle("Essays on chess openings");
        testiViite2.setPublicationYear("1830");
        testiViite2.setJournal("Miscatonic University Chess Club");
        StringBuffer test2 = tex.generateBibtex(testiViite2);
        System.out.println(test2);
        
        Viite testiViite3 = new Viite();
        testiViite3.setViiteType(Viite.ViiteType.INPROCEEDINGS);
        testiViite3.setAuthor("Moriarty, James");
        testiViite3.setTitle("Of Quantum flux in temporal displacement phenomenom");
        testiViite3.setBooktitle("Assorted writings of Arkham supervillains");
        testiViite3.setPublicationYear("1857");
        testiViite3.setPublisher("Arkham City");
        testiViite3.setOrganization("Q");
        StringBuffer test3 = tex.generateBibtex(testiViite3);
        System.out.println(test3);
        
    }
}
