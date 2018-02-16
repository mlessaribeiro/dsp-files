package org.dsp.files.properties;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {

    public static void main(String...args) throws Exception {
        Properties p = new Properties();
        p.load(new FileInputStream("arquivoPropertiesWrite.properties"));
        
        String user = p.getProperty("user");
        
        System.out.println(user);
    }
    
}
