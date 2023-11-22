package homework7.task13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFileByWords {
    public List<String> readFile (String fileName) {
        List<String> fileWords = new ArrayList<>();
        try {
            Path path = Paths.get("src/main/alina/homework7/task13/"+ fileName);
            List<String> lines  = Files.readAllLines(path);


            for (String line : lines) {
                String[] words = line.split("\\s+");
                fileWords.addAll(Arrays.asList(words));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileWords;
    }
}

