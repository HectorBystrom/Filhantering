import java.io.File;
import java.io.IOException;
public class Files3 {
    public Files3() {
        control();
    }

    public void control() {
        File file = new File("newFile.txt"); //skapar en variabel som kan skriva till filen
        if (file.exists())  //lite onödigt men ifall det inte skulle finnas någon fil.
        {
            if (file.canRead()) { //kollar ifall den kan läsas
                System.out.println("Filen kan läsas");
            } else {
                System.out.println("Filen kan inte läsas");
            }
            if (file.canWrite()) { //kollar ifall filen kan skrivas till
                System.out.println("Filen kan bli inmatad");
            } else {
                System.out.println("Filen kan inte bli inmatad");
            }
        }
    }
}
