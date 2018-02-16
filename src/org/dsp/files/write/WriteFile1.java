package org.dsp.files.write;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class WriteFile1 {
    
    public static void main(String...args) throws Exception {
        OutputStream outputStream = new FileOutputStream("arquivoSaida.txt", true);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        
        bufferedWriter.write("Aula 04");
        bufferedWriter.newLine();
        bufferedWriter.write("Aula 05");
        bufferedWriter.close();
    }
}
