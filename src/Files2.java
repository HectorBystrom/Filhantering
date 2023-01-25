import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Files2 {

    public Files2() {
        mapFiles2();

    }

    public void Pers() { //lägger till lite personer i en arraylist där de inte är i alfabetisk ordning.
        ArrayList<String> personer = new ArrayList<>();
        personer.add("Person A");
        personer.add("Person C");
        personer.add("Person B");

        try {
            FileWriter writer = new FileWriter("personer.txt");
            for (String pers : personer) { //samma som i Files klassen med funktionaliteten.
                writer.write(pers + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(personer); //det är denna som får det att bli sorterat.
        for (String person : personer) {
            System.out.println(person);
        }
    }

    public void mapFiles() {
        File myPath = new File("C:\\Program Files\\Git"); //hittar en path för att skriva ut från en map
        String[] allFiles = myPath.list();  //skapar en array med allt innehåll
        for (String name : allFiles) {
            System.out.println(name); //skriver ut alla filer från en map
        }
    }

    public void mapFiles2() {
        String folderPath = "C:\\Program Files\\Git"; //för enkelhetensskull så görs en variable till en map
        String fileType = ".txt"; // samma som ovan men med den typen av fil vi vill läsa
        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                String fileName = listOfFiles[i].getName();
                if (fileName.endsWith(fileType)) { //tar reda på att det är rätt filtyp
                    System.out.println("File: " + fileName); //skriver ut filerna.
                }
            }
        }
    }
}

