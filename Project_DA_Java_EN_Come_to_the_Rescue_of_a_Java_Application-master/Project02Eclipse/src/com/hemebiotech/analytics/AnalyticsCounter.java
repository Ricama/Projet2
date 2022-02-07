package com.hemebiotech.analytics;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
public class AnalyticsCounter {


	public static void main(String args[]) throws Exception {
		new WriteSymptomDataToFile().pullSymptoms();
	}

	/**
	 * Allows you to sort the list that you get from ReadSymptomDataFromFile
	 *
	 * @return the list sort
	 */
    public static List<String> count () {
		ReadSymptomDataFromFile read = new ReadSymptomDataFromFile("symptoms.txt");
		ArrayList <String> symptoms = new ArrayList<>(read.getSymptoms()) ;
		ArrayList <String> result = new ArrayList<>();
		symptoms.stream()
				.collect(Collectors.groupingBy(s -> s))
				.forEach((k, v) -> result.add(k+"="+v.size()));
		Collections.sort(result);
		return result;
	}

	}

