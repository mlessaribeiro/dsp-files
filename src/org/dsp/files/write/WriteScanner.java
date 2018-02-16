package org.dsp.files.write;

import java.io.PrintStream;
import java.util.Scanner;

public class WriteScanner {

    public static void main(String...args) throws Exception {
        Scanner s = new Scanner(System.in);
        PrintStream ps = new PrintStream("arquivoConsole.txt");
        while(s.hasNextLine()) {
            ps.println(s.nextLine());
        }
    }
    
}
