/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.miniprojekti.bibtex;

import java.util.ArrayList;
import java.util.List;
import ohtu.miniprojekti.domain.Viite;
import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertThat;
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
        
        List<String> testiLista = new ArrayList();
        testiLista.add("Moriarty, James");
        
        List<String> testiLista2 = new ArrayList();
        testiLista2.add("Möriärty, JamesÄÖ");
        
        
       
        testiViite.setViiteType(Viite.ViiteType.BOOK);
        testiViite.setRefId("MORI50");
        testiViite.setAuthors(testiLista);
        testiViite.setTitle("A Treatise on the Binomial Theorem");
        testiViite.setPublicationYear("1850");
        testiViite.setPublisher("Miscatonic University Press");
        String test = tex.generateBibtex(testiViite);
        System.out.println(test);
        assertThat(test, Matchers.containsString("@BOOK{ MORI50,"));
        assertThat(test, Matchers.containsString("AUTHOR    = {Moriarty, James}"));
        assertThat(test, Matchers.containsString("TITLE     = {A Treatise on the Binomial Theorem},"));
        assertThat(test, Matchers.containsString("PUBLISHER = {Miscatonic University Press},"));
        assertThat(test, Matchers.containsString("YEAR      = {1850},"));
        
        Viite testiViite2 = new Viite();
        testiViite2.setViiteType(Viite.ViiteType.ARTICLE);
        testiViite2.setRefId("MORI30");
        testiViite2.setAuthors(testiLista);
        testiViite2.setTitle("Essays on chess openings");
        testiViite2.setPublicationYear("1830");
        testiViite2.setJournal("Miscatonic University Chess Club");
        testiViite2.setPages("20-34");
        String test2 = tex.generateBibtex(testiViite2);
        System.out.println(test2);
        
        Viite testiViite3 = new Viite();
        testiViite3.setViiteType(Viite.ViiteType.INPROCEEDINGS);
        testiViite3.setRefId("MORI57");
        testiViite3.setAuthors(testiLista2);
        testiViite3.setTitle("Of Quantum flux in temporal displacement phenomenom");
        testiViite3.setBooktitle("Assorted writings of Arkham supervillains");
        testiViite3.setPublicationYear("1857");
        testiViite3.setPublisher("Arkham City");
        testiViite3.setOrganization("Q");
        String test3 = tex.generateBibtex(testiViite3);
        System.out.println(test3);
        assertThat(test3, Matchers.containsString("AUTHOR    = {M\\\"{o}ri\\\"{a}rty, James\\\"{A}\\\"{O}},"));
       
    }
}
