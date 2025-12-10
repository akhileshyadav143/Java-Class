import java.io.*;

public class java18 {

    static void writeData(String data) {
        try {
            FileWriter writer = new FileWriter("New.txt", true);
            writer.write(data);
            writer.close();
            System.out.println("Data written successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void fileRead() {
        try {
            FileReader reader = new FileReader("New.txt");
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
            System.out.println("\nFile read successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void fileDeleteAndRecreate() {
        File file = new File("New.txt");

        // Delete file
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("File could not be deleted.");
            }
        }

        // Create file again
        try {
            if (file.createNewFile()) {
                System.out.println("New file created again.");

                // Write some default text
                FileWriter writer = new FileWriter("New.txt");
                writer.write("New file created again!\n");
                writer.close();
                System.out.println("Default text written.");
            } else {
                System.out.println("File already exists (unexpected).");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        writeData("hello old data haiai\n");
        fileRead();
        fileDeleteAndRecreate();
        fileRead(); 
    }
}
