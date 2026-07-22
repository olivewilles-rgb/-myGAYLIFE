import java.util.*;
import java.io.*;

public class TheImages {
    private HashMap<String, String> notSure;
    private static final String IMAGE_FILE_NOTSURE = "images.txt";

    public TheImages() {
        notSure = new HashMap<>();
        loadImages(IMAGE_FILE_NOTSURE, notSure);
    }

    public String getNotSure(String name) {
        return notSure.get(name.toLowerCase());
    }

    private void loadImages(String filename, HashMap<String, String> map) {
        try (BufferedReader input = new BufferedReader(new FileReader(filename))) {
            String line;
            String currentImage = "";
            String currentName = null;

            while ((line = input.readLine()) != null) {
                if (line.startsWith("$$")) continue;

                if (line.startsWith("##")) {
                    if (currentName != null) {
                        map.put(currentName, currentImage);
                    }
                    currentName = line.substring(2).toLowerCase();
                    currentImage = "";
                } else {
                    currentImage += line + "\n";
                }
            }

            if (currentName != null) {
                map.put(currentName, currentImage);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Couldn't open file: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + filename);
            e.printStackTrace();
        }
    }
}
