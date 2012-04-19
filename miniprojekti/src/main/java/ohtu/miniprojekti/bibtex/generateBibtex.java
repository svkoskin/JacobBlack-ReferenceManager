/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu.miniprojekti.bibtex;


import java.io.StringWriter;
import java.util.Properties;
import ohtu.miniprojekti.domain.Viite;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
/**
 *
 * @author sam
 */
public class generateBibtex {
 
    
    public String generateBibtex(Viite viite){
        
        VelocityEngine engine = new VelocityEngine();
        Template t;
        VelocityContext context = new VelocityContext();
        StringWriter writer = new StringWriter();

        // Load the engine with classpath rloader
        try{
            
        Properties p = new Properties();
            p.setProperty("resource.loader", "class");  
            p.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
            p.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
         
        engine.init(p);
        
        }catch(Exception e){
            System.out.println(e);
        }
        
        //Figure out which template to load
               
        try{
            switch (viite.getViiteType()){
                case BOOK:          t = engine.getTemplate("META-INF/book.vm");
                                    break;
                
                case ARTICLE:       t = engine.getTemplate("META-INF/article.vm");
                                    break;
                
                case INPROCEEDINGS: t = engine.getTemplate("META-INF/inproceedings.vm");
                                    break;
                
                default:            t = engine.getTemplate("META-INF/book.vm");
                                    break;
                    
            
            }
                     
        // push everything to context    
        context.put("tag",  viite.getRefId());
        context.put("author", u2b(viite.getAuthor()));
        context.put("editor", u2b(viite.getEditor()));
        context.put("title", u2b(viite.getTitle()));
        context.put("booktitle", u2b(viite.getBooktitle()));
        context.put("publisher", u2b(viite.getPublisher()));
        context.put("journal",u2b(viite.getJournal()));
        context.put("year", viite.getPublicationYear());
        context.put("pages",u2b(viite.getPages()));
        context.put("volume",u2b(viite.getVolume()));
        context.put("series",u2b(viite.getSeries()));
        context.put("address",u2b(viite.getAddress()));
        context.put("edition",u2b(viite.getEdition()));
        context.put("address",u2b(viite.getAddress()));
        context.put("organization",u2b(viite.getOrganization()));
        
        t.merge( context, writer );
        
        }catch(Exception e){
            System.out.println(e);
        }

        
        return writer.getBuffer().toString();
    }
   private String u2b(String s){
       
       if((s == null)||("".equals(s))){
           return null;
       }
       s=s.replaceAll("Ä", "\\\\\"{A}")
          .replaceAll("ä", "\\\\\"{a}")
          .replaceAll("Ö", "\\\\\"{O}")
          .replaceAll("ö", "\\\\\"{o}");
   return s;
   
  }
}
