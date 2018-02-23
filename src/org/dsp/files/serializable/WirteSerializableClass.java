package org.dsp.files.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WirteSerializableClass {
 
    public static void main(String...arg) throws Exception {
        Empregado empregado = new Empregado();
        empregado.setCpf(0101010101);
        empregado.setEndereco("Rua Maringa");
        empregado.setNome("Maria das Neves");
        empregado.setNumero(221);
        
        System.out.println(empregado);
        
        FileOutputStream fos = new FileOutputStream("writeSerializable.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(empregado);
        oos.close();
        fos.close();
    }
    
}
