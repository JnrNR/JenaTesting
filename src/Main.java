
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.vocabulary.VCARD;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jnr
 */
public class Main {
    static Model nuevoModelo;
    
    public static void main(String[] args) throws FileNotFoundException{
        nuevoModelo = ModelFactory.createDefaultModel();
        
        //Formando una tripleta
        Resource sujeto = nuevoModelo.createResource("http://somewhere/JohnSmith");
        sujeto.addProperty(VCARD.FN, "objeto");
        
        
        
        FileOutputStream fop;
	File file;
        file = new File("D:\\CINVESTAV\\Tesis\\Desarrollo\\prueba.rdf");
        fop = new FileOutputStream(file);
        
        //Escritura RDF
        nuevoModelo.write(System.out);
        nuevoModelo.write(fop, "RDF/XML-ABBREV");


        
        
    }
}
