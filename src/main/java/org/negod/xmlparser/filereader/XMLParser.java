/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.negod.xmlparser.filereader;

import org.dom4j.Document;
import org.dom4j.Element;

/**
 *
 * @author Admin
 */
public class XMLParser {
    
    String filePath;
    Document xmlDocument;
    Element rootElement;

    public XMLParser(String filePath) {
        this.filePath = filePath;
        getXMLDucument();
    }
    
    private void getXMLDucument(){        
        XMLReader reader = new XMLReader(filePath);
        xmlDocument = reader.getMainDoc();
    }
    
    private void getRootElement(){
        rootElement = xmlDocument.getRootElement();
    }
    
}
