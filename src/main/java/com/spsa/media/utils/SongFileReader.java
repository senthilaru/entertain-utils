package com.spsa.media.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SongFileReader {

	public List<File> readFiles(String basePath) {
		FileNameCleaner cleaner = new FileNameCleaner();
		List<File> files = new ArrayList<>();
		try {
			Files.list(Paths.get(basePath)).forEach(e -> {
				String cleanedFileName = cleaner.getCleanedFileName(e.getFileName().toString());
				File modified = new File(e.getParent().toFile(), cleanedFileName);
				try {
					Files.move(e, Paths.get(modified.toURI()));
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return files;
	}

}
