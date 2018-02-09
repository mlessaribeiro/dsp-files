package org.dsp.files.read;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFile {

	public static void main(String... args) throws IOException {
		InputStream inputStream = new FileInputStream("arquivo.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		String line = bufferedReader.readLine();
		while(line != null) {
			System.out.println(line);
			line = bufferedReader.readLine();
		}
	}

}
