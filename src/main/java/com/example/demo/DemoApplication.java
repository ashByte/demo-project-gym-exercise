package com.example.demo;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static final String COMMA_DELIMITER = ",";
	private List<List<String>> records = new ArrayList<>();
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	private void fetchData() throws FileNotFoundException, IOException {
		try (BufferedReader br = new BufferedReader (new FileReader("megaGymDataset.csv"))) {
			String line;

			while((line = br.readLine()) != null) {
				String[] values = line.split(COMMA_DELIMITER);
				records.add(Arrays.asList(values));
			}
		}
	}

}
