package Advanced_Lab4_StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ADV_LAB06_SortLines {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Boevi Main\\OneDrive\\Документи\\Java\\Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

       List<String> sortedLines = Files.readAllLines(Paths.get(path))
                .stream()
                .sorted()
                .collect(Collectors.toList());

        Path outputPath = Path.of("sorted-lines-out.txt");

        Path write = Files.write(outputPath, sortedLines);

    }
}
