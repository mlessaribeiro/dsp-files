package org.dsp.files.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadSerializableClass {

    public static void main(String...args) throws Exception {
        FileInputStream fos = new FileInputStream("writeSerializable.txt");
        ObjectInputStream oos = new ObjectInputStream(fos);
        
        Empregado empregado = (Empregado)oos.readObject();
        
        System.out.println(empregado);
    }
    
}
