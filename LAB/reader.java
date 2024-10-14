import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        // File paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Data to write
        String data = "Hello, World!";

        // Write data to file
        try (FileWriter writer = new FileWriter(outputFile)) {
            writer.write(data);
            System.out.println("Data written to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Read data from file
        try (FileReader reader = new FileReader(inputFile)) {
            int character;
            System.out.println("Data read from " + inputFile + ":");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}