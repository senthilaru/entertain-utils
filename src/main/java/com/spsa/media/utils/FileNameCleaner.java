package com.spsa.media.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FileNameCleaner {

	private final List<String> unwantedWords = Arrays.asList(" - TamilWire.com", " - TamilTunes.com ",
			" - TamilTunes.com");

	public String getCleanedFileName(String fileName) {
		String name = new String(fileName);
		Map<String, String> ff = new HashMap<>();
		ff.put(fileName, name);
		if (Objects.nonNull(fileName)) {
			unwantedWords.stream().forEach(word -> {
				String namee = ff.get(fileName).replaceAll(word, "").trim();
				ff.put(fileName, namee);
			});
			return ff.get(fileName);
		} else {
			return fileName;
		}
	}

	public String strip(String fileName) {
		String name = new String(fileName);
		if (Objects.nonNull(fileName)) {
			return name.substring(0, name.indexOf(".mp3")).trim() + ".mp3";
		} else {
			return fileName;
		}
	}
	
	
	public static void main(String[] args) {
		
	}
	
}
