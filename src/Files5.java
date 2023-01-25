import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Files5 {

    public Files5() {
        commonLetter();
    }

    public void commonLetter() {
        int[] alfabetAmount = new int[26]; //array för att samla antalet för varje bokstav
        try {
            BufferedReader reader = new BufferedReader(new FileReader("words.txt")); //skapar en buffertreader för att läsa words
            int a;
            while ((a = reader.read()) != -1) { //läser varje bokstav i filen
                if (Character.isLetter(a)) { //kontrollerar så att det är en bokstav
                    char ch = Character.toLowerCase((char) a); //gör om alla bokstäver till lowercase
                    alfabetAmount[ch - 'a']++; //ökar antalet bokstäver i arrayn
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int max = -1; //maxmängd för bokstav
        char letter = ' '; //för att ha till den mest använda bokstaven
        for (int i = 0; i < 26; i++) { //upprepar genom arrayn av bokstäver
            if (alfabetAmount[i] > max) { //kollar ifall det finns större mängd av varje bokstav
                max = alfabetAmount[i]; //sätter max bokstaven
                letter = (char) (i + 'a');
            }
        }
        System.out.println(letter); //skriver ut det
    }
}
