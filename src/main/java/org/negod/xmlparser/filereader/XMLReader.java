/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.negod.xmlparser.filereader;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

/**
 *
 * @author Admin
 */
class XMLReader {

    private URL fileURL;
    private Document mainDoc;

    public XMLReader(String filePath) {
        try {
            fileURL = new URL(filePath);
            parseXmlDoc();
        } catch (MalformedURLException ex) {
            Logger.getLogger(XMLReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void parseXmlDoc() {
        SAXReader reader = new SAXReader();
        try {
            mainDoc = reader.read(fileURL);
        } catch (DocumentException ex) {
            Logger.getLogger(XMLReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getFileURL() {
        return fileURL.getPath();
    }

    public Document getMainDoc() {
        return mainDoc;
    }
    
    
}
