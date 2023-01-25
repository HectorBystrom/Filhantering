import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Files4 {

    public Files4() {
        findLongestWords();
    }

    public void findLongestWords() {
        String longestWord = ""; //variabel för att ha det längsta ordet i
        try {
            BufferedReader reader = new BufferedReader(new FileReader("words.txt")); //skapar en buffertreader objekt som ska läsa filen words
            String line;
            while ((line = reader.readLine()) != null) { //läser varje rad i words
                String[] words = line.split(" "); //kollar igenom alla ord i arrayn
                for (String word : words) {
                    if (word.length() > longestWord.length()) { //kollar ifall det nya ordet är längre än del längsta hittils.
                        longestWord = word; //sätter det längsta ordet.
                    }
                }
            }
            reader.close(); //stänger genomsökningen
        } catch (IOException e) { //ifall fel uppstår
            e.printStackTrace();
        }
        System.out.println(longestWord); //skriver ut ordet
    }
}
