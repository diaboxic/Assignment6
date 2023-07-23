import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
	public static void main(String[] args) {
		String fileName = "myFile.txt";
		
		try (FileWriter writer = new FileWriter(fileName)) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter text to write to the file (type 'exit' to stop):");
			
			String inputLine;
			
			while (!(inputLine = scanner.nextLine()).equalsIgnoreCase("exit")) {
				
				writer.write(inputLine + System.lineSeparator());
				}
			
			scanner.close();
			System.out.println("Text written to the file successfully.");
			} catch (IOException e) {
				
				System.err.println("Error writing to the file: " + e.getMessage());
				}
		}
	}

