package de.exxcellent.challenge.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader implements Reader {

	private final String resourcePath;

	public CSVReader(String resourcePath) {
		this.resourcePath = resourcePath;
	}

	public List<List<String>> readData(String fileName) {
		List<List<String>> content = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(resourcePath + fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				content.add(Arrays.asList(values));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content;
	}
}
