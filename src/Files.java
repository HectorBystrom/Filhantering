import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class Files {
    //attributes

    //constructor
    public Files() {
        Write();
    }

    //methods
    public void Write() {
        System.out.println("Do you wish to write over the existing file or add more? \n Type 1 for write over and 2 for adding more");
        int addwrite = 0;
        Scanner scan = new Scanner(System.in);
        try {
            addwrite = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Något gick fel försök igen");
        } finally {
            System.out.println("Klart");
        } //tar svaret från frågan innan och gör 2 olika alternativ från det
        switch (addwrite) {
            case 1:
                String ans;
                try {
                    FileWriter fileWrite = new FileWriter("newFile.txt"); //gör så den kan skriva in i textfilen
                    Scanner scanner = new Scanner(System.in);
                    ans = scanner.next();
                    fileWrite.write(ans); //här skriver den över filen
                    fileWrite.close();
                    System.out.println("Mission completed");
                } catch (IOException f) {
                    f.printStackTrace();

                }
                FileReader();
                break;
            case 2:
                System.out.println("Vad vill du skriva? ");
                try {
                    FileWriter fileWriter = new FileWriter("newFile.txt", true);

                    Scanner scanner = new Scanner(System.in);
                    ans = scanner.next();
                    fileWriter.write("\n" + ans); //här skapar den en ny rad för varje meddelande
                    fileWriter.close();
                    System.out.println("Mission completed");
                } catch (IOException e) {//ifall något går fel
                    System.out.println("Something bad happened");
                    e.printStackTrace();
                }
                FileReader();
                break;
        }


    }

    public void FileReader() {
        File fileReader = new File("newFile.txt");
        try {
            Scanner newScan = new Scanner(fileReader);
            while (newScan.hasNextLine()) {
                String data = newScan.nextLine();//onödig metod finns ovanför egenligen men så att den kan läsa från en fil
                System.out.println(data);
            }
            newScan.close();
        } catch (FileNotFoundException e) {
            System.out.println("no micky no");
            e.printStackTrace();
        }
    }
    //get set
}
