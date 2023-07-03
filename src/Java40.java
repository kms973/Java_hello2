import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

import java.io.BufferedWriter;

public class Java40 {
	public static void main(String[] args) throws Exception {
		Path file = Paths.get("C:\\javastudy\\simple.txt");
		BufferedWriter writer = null;

		writer = Files.newBufferedWriter(file);
	}
}
