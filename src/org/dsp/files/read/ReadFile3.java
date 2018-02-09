package org.dsp.files.read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFile3 {

	public static void main(String... args) throws IOException {
		InputStream inputStream = System.in;
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		System.out.println("Digite algo:");
		String line = bufferedReader.readLine();
		while(line != null) {
			System.out.println(line);
			System.out.println("Digite algo:");
			line = bufferedReader.readLine();
		}
	}

}
