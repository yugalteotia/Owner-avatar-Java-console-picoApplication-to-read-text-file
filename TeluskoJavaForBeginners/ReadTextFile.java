import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

    private String filePath = "./QuestionsFile.txt";
    private String[] dataLines = new String[5];

    ReadTextFile() {
        // took this buffer reader code from gpt
        // Wrap the FileReader in a BufferedReader for efficient reading
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int i = 0;
            // Read each line from the file until the end is reached (null is returned)
            while ((dataLines[i++] = reader.readLine()) != null) {
                if (i == 5)
                    break;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] getDataLines() {
        return dataLines;
    }
}