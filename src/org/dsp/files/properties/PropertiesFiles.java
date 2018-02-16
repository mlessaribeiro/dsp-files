package org.dsp.files.properties;

import java.io.FileOutputStream;
import java.util.Properties;

public class PropertiesFiles {

    public static void main(String...args) throws Exception {
        Properties p = new Properties();
        
        p.setProperty("url", "localhost");
        p.setProperty("user", "marcelo");
        p.setProperty("password", "wololo");        

        p.store(new FileOutputStream("arquivoPropertiesWrite.properties"), null);
    }    
}
